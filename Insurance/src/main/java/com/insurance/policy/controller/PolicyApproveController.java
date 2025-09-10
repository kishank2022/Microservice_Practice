package com.insurance.policy.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.policy.dto.PolicyApproveRequestDto;
import com.insurance.policy.dto.PolicyApproveResponseDto;
import com.insurance.policy.externalAPICall.service.PolicyApproveService;

@RestController
@RequestMapping("/insurance/api/")
public class PolicyApproveController {

	private static final Logger L   = Logger.getLogger(PolicyApproveController.class.getName());

	@Autowired
	private PolicyApproveService policyApproveService;
	
	@PostMapping("/policyApprove")
	public ResponseEntity<PolicyApproveResponseDto> policyApprove(@RequestBody PolicyApproveRequestDto requestDto){
		L.info("PolicyApproveRequestDto>>"+requestDto.toString());
		PolicyApproveResponseDto responseDto = policyApproveService.palicyApprove(requestDto);
		return new ResponseEntity<PolicyApproveResponseDto>(responseDto, HttpStatus.OK);
	}

	
}
