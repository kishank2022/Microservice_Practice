package com.insurance.policy.externalAPICall.service.impl;

import org.jboss.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.PaymentStatusRequestDto;
import com.insurance.policy.dto.PaymentStatusResponseDto;
import com.insurance.policy.externalAPICall.service.PaymentStatusService;

@Service
public class PaymentStatusServiceImpl implements PaymentStatusService{

	private static final Logger L   = Logger.getLogger(PaymentStatusServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	public PaymentStatusResponseDto paymentStatusCheck(PaymentStatusRequestDto requestDto) {
		PaymentStatusResponseDto responseDto = new PaymentStatusResponseDto();
		String paymentStatusCheckURL = "http://novaapiuat.shriramgi.com/UATNovaWS/novaServices/WebAggregator.svc/RestService/getPaymentStatus";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<PaymentStatusRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("Get PaymentStatusRequestDto RequestEntity: "+requestEntity.toString());
			ResponseEntity<PaymentStatusResponseDto> responseEntity = restTemplate.exchange(
								paymentStatusCheckURL,
			                    HttpMethod.POST,
			                    requestEntity,
			                    PaymentStatusResponseDto.class
            );			
			L.info("PaymentStatusResponseDto Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("PaymentStatusResponseDto Response Body:"+responseDto.toString());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}
	
}
