package com.insurance.policy.externalAPICall.service.impl;

import org.jboss.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.GetRenewalDetailsResultRequestDto;
import com.insurance.policy.dto.RenewalDetailsResultResponseDto;
import com.insurance.policy.externalAPICall.service.GetRenewalDetailsResultService;

@Service
public class GetRenewalDetailsResultServiceImpl implements GetRenewalDetailsResultService{

	private static final Logger L   = Logger.getLogger(GetRenewalDetailsResultServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	public RenewalDetailsResultResponseDto getRenewalDetailsResult(GetRenewalDetailsResultRequestDto requestDto) {
		RenewalDetailsResultResponseDto responseDto = new RenewalDetailsResultResponseDto();
		String getRenewalDetailsResultURL = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/GetRenewalDetailsResult";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<GetRenewalDetailsResultRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("GetRenewalDetailsResultRequestDto RequestEntity: "+requestEntity.toString());
			ResponseEntity<RenewalDetailsResultResponseDto> responseEntity = restTemplate.exchange(
								getRenewalDetailsResultURL,
			                    HttpMethod.POST,
			                    requestEntity,
			                    RenewalDetailsResultResponseDto.class
            );			
			L.info("GetRenewalDetailsResultRequestDto Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("GetRenewalDetailsResultRequestDto Response Body:"+responseDto.toString());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}
}
