package com.insurance.policy.externalAPICall.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.GenerateCarProposalResponseDto;
import com.insurance.policy.dto.GenerateTwoWheelerProposalRequestDto;
import com.insurance.policy.externalAPICall.service.GenerateTwoWheelerProposalService;

import org.jboss.logging.Logger;


@Service
public class GenerateTwoWheelerProposalServiceImpl implements GenerateTwoWheelerProposalService{

	private static final Logger L   = Logger.getLogger(GenerateTwoWheelerProposalServiceImpl.class.getName());
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public GenerateCarProposalResponseDto generateTwoWheelerProposal(GenerateTwoWheelerProposalRequestDto requestDto) {
		GenerateCarProposalResponseDto responseDto = new GenerateCarProposalResponseDto();
		String generateTwoWheelerProposalUrl = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/GenerateProposal";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<GenerateTwoWheelerProposalRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("Generate Two Wheeler Proposal RequestDto RequestEntity: "+requestEntity.toString());
			ResponseEntity<GenerateCarProposalResponseDto> responseEntity = restTemplate.exchange(
								generateTwoWheelerProposalUrl,
			                    HttpMethod.POST,
			                    requestEntity,
			                    GenerateCarProposalResponseDto.class
            );			
			L.info("Generate Two Wheeler Proposal Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("Generate Two Wheeler Proposal response Body: "+responseDto.toString());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}
}
