package com.insurance.policy.externalAPICall.service.impl;

import org.jboss.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.PolicyApproveRequestDto;
import com.insurance.policy.dto.PolicyApproveResponseDto;
import com.insurance.policy.externalAPICall.service.PolicyApproveService;

@Service
public class PolicyApproveServiceImpl implements PolicyApproveService{

	private static final Logger L   = Logger.getLogger(PolicyApproveServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	public PolicyApproveResponseDto palicyApprove(PolicyApproveRequestDto requestDto) {
		PolicyApproveResponseDto responseDto = new PolicyApproveResponseDto();
		String policyApproveURL = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/PolicyApprove";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<PolicyApproveRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("Get PolicyApproveRequestDto RequestEntity: "+requestEntity.toString());
			ResponseEntity<PolicyApproveResponseDto> responseEntity = restTemplate.exchange(
								policyApproveURL,
			                    HttpMethod.POST,
			                    requestEntity,
			                    PolicyApproveResponseDto.class
            );			
			L.info("PolicyApproveResponseDto Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("PolicyApproveResponseDto Response Body:"+responseDto.toString());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}

}
