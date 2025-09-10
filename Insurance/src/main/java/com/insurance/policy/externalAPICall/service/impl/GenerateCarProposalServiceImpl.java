package com.insurance.policy.externalAPICall.service.impl;

import org.jboss.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.GenerateCarProposalRequestDto;
import com.insurance.policy.dto.GenerateCarProposalResponseDto;
import com.insurance.policy.externalAPICall.service.GenerateCarProposalService;

@Service
public class GenerateCarProposalServiceImpl implements GenerateCarProposalService{
	
	private static final Logger L   = Logger.getLogger(GenerateCarProposalServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();

	public GenerateCarProposalResponseDto generateCarProposal(GenerateCarProposalRequestDto requestDto) {
		GenerateCarProposalResponseDto responseDto = new GenerateCarProposalResponseDto();
		try {
			String generateCarProposalUrl = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/GenerateProposal";
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<GenerateCarProposalRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("Generate Car Proposal Request Entity: "+requestEntity.toString());
			ResponseEntity<GenerateCarProposalResponseDto> responseEntity = restTemplate.exchange(
								generateCarProposalUrl,
			                    HttpMethod.POST,
			                    requestEntity,
			                    GenerateCarProposalResponseDto.class
            );			
			L.info("Generate Car Proposal ResponseEntity: "+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("Generate Car Proposal responseBody: "+responseDto.toString());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return responseDto;
	}
	
}
