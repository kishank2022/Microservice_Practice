package com.insurance.policy.externalAPICall.service.impl;

import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Locale;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.GeneratePolicyReceiptRequestDto;
import com.insurance.policy.dto.GeneratePolicyReceiptResponseDto;
import com.insurance.policy.dto.PolicyScheduleURLRequestDto;
import com.insurance.policy.dto.PolicyScheduleURLResponseDto;
import com.insurance.policy.entity.InsuranceMotorEntity;
import com.insurance.policy.externalAPICall.service.PolicyScheduleURLService;
import com.insurance.policy.repository.InsuranceMotorRepository;

@Service
public class PolicyScheduleURLServiceImpl implements PolicyScheduleURLService{

	
	private static final Logger L   = Logger.getLogger(PolicyScheduleURLServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	private InsuranceMotorRepository insuranceMotorRepository;
	
	private final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
	
	public GeneratePolicyReceiptResponseDto generateReceiptUrl(GeneratePolicyReceiptRequestDto requestDto) {
		GeneratePolicyReceiptResponseDto responseDto = new GeneratePolicyReceiptResponseDto();
		L.info("GeneratePolicyReceiptRequestDto>>"+requestDto.toString());
		InsuranceMotorEntity entity1 = new InsuranceMotorEntity();
		String strPolSysId = "";
		try {
			Optional<InsuranceMotorEntity> opt1 = this.insuranceMotorRepository.findByProposalNo(requestDto.getProposalNo());
			if(opt1.isPresent()) {
				entity1 = opt1.get();
			}
			strPolSysId = entity1.getApprovePolSysId().toString();
			L.info("strPolSysId>>"+strPolSysId);
			
			PolicyScheduleURLRequestDto request1 = new PolicyScheduleURLRequestDto();
			request1.setStrPolSysId(strPolSysId);
			
			PolicyScheduleURLResponseDto response1 = new PolicyScheduleURLResponseDto();
			String policyScheduleURL = "http://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/PolicyScheduleURL";
			try {
				HttpHeaders headers = new HttpHeaders();
				headers.set("Username", "NiveshIns");
				headers.set("Password", "shriram@1");
				headers.setContentType(MediaType.APPLICATION_JSON);
		        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
				
				HttpEntity<PolicyScheduleURLRequestDto> requestEntity = new HttpEntity<>(request1, headers);
				L.info("Get policyScheduleURL RequestEntity: "+requestEntity.toString());
				L.info("policyScheduleURL>>"+policyScheduleURL);
				ResponseEntity<PolicyScheduleURLResponseDto> responseEntity = restTemplate.exchange(
									policyScheduleURL,
				                    HttpMethod.POST,
				                    requestEntity,
				                    PolicyScheduleURLResponseDto.class
	            );			
				L.info("PolicySchedule Response Entity:"+responseEntity.toString());			
				response1 =responseEntity.getBody();
				L.info("PolicySchedule Response Body:"+response1.toString());
				
				String policyScheduleURLResult = response1.getPolicyScheduleURLResult() != null ? response1.getPolicyScheduleURLResult() : "";
				L.info("policyScheduleURLResult: "+policyScheduleURLResult);
				entity1.setPolicy_schedule_url_result(policyScheduleURLResult);
				entity1 = this.insuranceMotorRepository.save(entity1);
				L.info("insuranceMotorEntity after saving the url in DB>>"+entity1.toString());
				
				responseDto.setProposalNo(entity1.getProposalNo());
				responseDto.setReceiptUrl(entity1.getPolicy_schedule_url_result());
				responseDto.setMessage("SUCCESS");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}	
			
			
		}catch(Exception e) {
			e.printStackTrace();
			L.info(e.getMessage());
		}
		
		
		L.info("GeneratePolicyReceiptResponseDto>>"+responseDto.toString());
		return responseDto;
	}
	
}
