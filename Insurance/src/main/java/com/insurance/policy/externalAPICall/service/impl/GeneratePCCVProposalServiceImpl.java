package com.insurance.policy.externalAPICall.service.impl;

import org.jboss.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.GeneratePCCVProposalRequestDto;
import com.insurance.policy.dto.GeneratePCCVProposalResponseDto;
import com.insurance.policy.externalAPICall.service.GeneratePCCVProposalService;


@Service
public class GeneratePCCVProposalServiceImpl implements GeneratePCCVProposalService{

	private static final Logger L   = Logger.getLogger(GeneratePCCVProposalServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	public GeneratePCCVProposalResponseDto generatePCCVProposal(GeneratePCCVProposalRequestDto requestDto) {
		GeneratePCCVProposalResponseDto responseDto = new GeneratePCCVProposalResponseDto();
		String generatePCCVProposalURL = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/GeneratePCCVProposal";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<GeneratePCCVProposalRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("GeneratePCCVProposalRequestDto RequestEntity: "+requestEntity.toString());
			ResponseEntity<GeneratePCCVProposalResponseDto> responseEntity = restTemplate.exchange(
								generatePCCVProposalURL,
			                    HttpMethod.POST,
			                    requestEntity,
			                    GeneratePCCVProposalResponseDto.class
            );			
			L.info("GeneratePCCVProposalResponseDto Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("GeneratePCCVProposalResponseDto Response Body:"+responseDto.toString());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}
}
