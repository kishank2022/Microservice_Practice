package com.insurance.policy.externalAPICall.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

import com.insurance.policy.dto.PolicyApproveRequestDto;
import com.insurance.policy.dto.PolicyApproveResponseDto;
import com.insurance.policy.entity.InsuranceMotorEntity;
import com.insurance.policy.externalAPICall.service.PolicyApproveService;
import com.insurance.policy.repository.InsuranceMotorRepository;

@Service
public class PolicyApproveServiceImpl implements PolicyApproveService{

	private static final Logger L   = Logger.getLogger(PolicyApproveServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	private InsuranceMotorRepository insuranceMotorRepository;
	
	private final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
	
	public PolicyApproveResponseDto palicyApprove(PolicyApproveRequestDto requestDto) {
		
		InsuranceMotorEntity insuranceMotorEntity = new InsuranceMotorEntity();
		Optional<InsuranceMotorEntity> existingInsuranceEntity = this.insuranceMotorRepository.findByProposalNo(requestDto.getProposalNo());
		L.info("existingInsuranceEntity.isPresent()>>"+existingInsuranceEntity.isPresent());
		
		if(existingInsuranceEntity.isPresent()) {
			L.info("existingInsuranceEntity:"+existingInsuranceEntity.toString());
			insuranceMotorEntity = existingInsuranceEntity.get();
		}
		L.info("existing insuranceMotorEntity:"+insuranceMotorEntity.toString());
		insuranceMotorEntity.setTransactionNumber(insuranceMotorEntity.getTransactionNumber());
		insuranceMotorEntity.setCardNumber(requestDto.getCardNumber());
		insuranceMotorEntity.setCardholderName(requestDto.getCardholderName());
		insuranceMotorEntity.setCardType(requestDto.getCardType());
		insuranceMotorEntity.setCardValidUpTo(requestDto.getCardValidUpTo());
		insuranceMotorEntity.setBankName(requestDto.getBankName());
		insuranceMotorEntity.setBranchName(requestDto.getBranchName());
		insuranceMotorEntity.setPaymentType(requestDto.getPaymentType());
		if(!requestDto.getTransactionDate().isBlank() && requestDto.getTransactionDate()!=null) {
			LocalDate getTransactionDate = LocalDate.parse(requestDto.getTransactionDate(), inputFormatter);
			L.info("getTransactionDate>>>"+getTransactionDate);
			insuranceMotorEntity.setTransactionDate(getTransactionDate);			
		}
//		insuranceMotorEntity.setTransactionDate(requestDto.getTransactionDate());
		insuranceMotorEntity.setChequeType(requestDto.getChequeClearType());
		insuranceMotorEntity.setCashType(requestDto.getCashType());
		
		
		
		
		
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
			
			String ApprovePolNo = responseDto.getPolicyApproveResult().getApprovePolNo() != null ? responseDto.getPolicyApproveResult().getApprovePolNo() : "";
			L.info("ApprovePolNo: "+ApprovePolNo);
			String ApprovePolSysId = responseDto.getPolicyApproveResult().getAprovePolSysId() != null ? responseDto.getPolicyApproveResult().getAprovePolSysId() : "";
			L.info("ApprovePolSysId: "+ApprovePolSysId);
			String Err_Desc = responseDto.getPolicyApproveResult().getErr_Desc() != null ? responseDto.getPolicyApproveResult().getErr_Desc() : "";
			if(Err_Desc!=null) {
				Err_Desc = Err_Desc.length()>50? Err_Desc.substring(0, 50) : Err_Desc; 
			}
			L.info("Err_Desc: "+Err_Desc);
			String Err_Code = responseDto.getPolicyApproveResult().getErr_Code() != null ? responseDto.getPolicyApproveResult().getErr_Code() : "";
			L.info("Err_Code: "+Err_Code);
			
			insuranceMotorEntity.setApprovePolNo(ApprovePolNo);
			insuranceMotorEntity.setApprovePolSysId(ApprovePolSysId);
			insuranceMotorEntity.setError_Desc(Err_Desc);
			insuranceMotorEntity.setErr_Code(Err_Code);
			
			insuranceMotorEntity = this.insuranceMotorRepository.save(insuranceMotorEntity);
			L.info("insuranceMotorEntity>>: "+insuranceMotorEntity.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}

}
