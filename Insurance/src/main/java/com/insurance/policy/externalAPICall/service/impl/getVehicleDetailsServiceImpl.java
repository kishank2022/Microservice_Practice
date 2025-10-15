package com.insurance.policy.externalAPICall.service.impl;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientRequestException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insurance.policy.externalAPICall.service.InsuranceService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

@Service
@Slf4j
public class getVehicleDetailsServiceImpl implements InsuranceService{
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Autowired
    private ObjectMapper objectMapper;

	private static final String SECRET_KEY = "UTA5U1VEQXdNREF4VFZSSmVrNUVWVEpPZWxVd1RuYzlQUT09"; //UAT
	//private static final String SECRET_KEY = "UTA5U1VEQXdNREF4TkRJelQxUnJlVTFFUVhoTlZFVjZUVkU5UFE9PQ=="; // prod

	public Map<String, Object> getVehicleDetails(String rc_number, String refid){
		
		String vehicleURL = "https://uat.paysprint.in/sprintverify-uat/api/v1/verification/rc_advance";
        Map<String, Object> response = null;
        Map<String, Object> request = new LinkedHashMap<>();
	    try {
	        request.put("rc_number", rc_number);
	        request.put("refid", refid);
	        
	        WebClient webClient = webClientBuilder.baseUrl(vehicleURL).build();
	        Mono<Map> apiResponse = webClient.method(HttpMethod.POST)
	                .header("Content-Type", "application/json")
	                .header("Accept", "application/json")
	                .header("Token", generateToken())
	                .header("authorisedkey", "TVRJek5EVTJOelUwTnpKRFQxSlFNREF3TURFPQ==")
	                .bodyValue(request)
	                .retrieve()
	                .bodyToMono(Map.class)
	                .retryWhen(Retry.fixedDelay(3, Duration.ofSeconds(3))
	                .filter(throwable -> throwable instanceof WebClientRequestException)
	                .doBeforeRetry(retrySignal -> log.info("Retrying request due to: {}", retrySignal.failure()))
	                .onRetryExhaustedThrow((retryBackoffSpec, retrySignal) ->
	                                new RuntimeException("Max retry attempts reached. Failed to create order")));

	        // Block and get the actual response
	        response = apiResponse.block();
	        
	        log.info("Response from PaySprint :: {}", response);

	        // Convert the map response to a JsonNode for easier traversal
	        JsonNode responseJson = objectMapper.convertValue(response, JsonNode.class);
	        log.info("Response from PaySprint in JSON :: {}", responseJson);
	        
	    } catch (Exception e) {
	        log.error("Error creating order after retries:: {} - {}", e.getMessage(), e);
	        response = null;
	    }
		
		return response;
	}
	
    public  String generateToken() throws Exception {
        // Create header and payload
        Map<String, Object> header = new HashMap<>();
        header.put("alg", "HS256");
        header.put("typ", "JWT");
 
        Map<String, Object> payload = new HashMap();
        payload.put("reqid", String.valueOf(ThreadLocalRandom.current().nextInt(1000000000, 2000000000)));
        payload.put("partnerId", "CORP00001"); // UAT
        //payload.put("partnerId", "CORP00001423"); // prod
        payload.put("timestamp", System.currentTimeMillis() / 1000L); // Current time in seconds
 
        // Convert header and payload to JSON strings
        ObjectMapper objectMapper = new ObjectMapper();
        String headerJson = objectMapper.writeValueAsString(header);
        String payloadJson = objectMapper.writeValueAsString(payload);
 
        // Encode header and payload to Base64 URL format
        String encodedHeader = Base64.getUrlEncoder().withoutPadding().encodeToString(headerJson.getBytes(StandardCharsets.UTF_8));
        String encodedPayload = Base64.getUrlEncoder().withoutPadding().encodeToString(payloadJson.getBytes(StandardCharsets.UTF_8));
 
        // Create the signature
        String dataToSign = encodedHeader + "." + encodedPayload;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        byte[] signatureBytes = mac.doFinal(dataToSign.getBytes(StandardCharsets.UTF_8));
        String encodedSignature = Base64.getUrlEncoder().withoutPadding().encodeToString(signatureBytes);
 
        // Concatenate the parts to form the JWT
        return encodedHeader + "." + encodedPayload + "." + encodedSignature;
    }

}
