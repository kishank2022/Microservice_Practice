package com.insurance.policy.externalAPICall.service.impl;

import org.jboss.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.GetQuoteRequestDto;
import com.insurance.policy.dto.GetQuoteResponseDto;
import com.insurance.policy.externalAPICall.service.GetQuoteAPICallService;


@Service
public class GetQuoteAPICallServiceImpl implements GetQuoteAPICallService{
	
	private static final Logger L   = Logger.getLogger(GetQuoteAPICallServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	public GetQuoteResponseDto getQuote(GetQuoteRequestDto requestDto) {
		GetQuoteResponseDto responseDto = new GetQuoteResponseDto();
		String getQuoteUrl = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/GetQuote";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<GetQuoteRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("Get Quote RequestEntity: "+requestEntity.toString());
			ResponseEntity<GetQuoteResponseDto> responseEntity = restTemplate.exchange(
								getQuoteUrl,
			                    HttpMethod.POST,
			                    requestEntity,
			                    GetQuoteResponseDto.class
            );			
			L.info("Get Quote Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("Get Quote Response Body:"+responseDto.toString());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}
	
}
