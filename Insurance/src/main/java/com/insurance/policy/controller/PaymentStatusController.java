package com.insurance.policy.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.policy.dto.PaymentStatusRequestDto;
import com.insurance.policy.dto.PaymentStatusResponseDto;
import com.insurance.policy.externalAPICall.service.PaymentStatusService;

@RestController
@RequestMapping("/insurance/api/")
public class PaymentStatusController {

	private static final Logger L   = Logger.getLogger(PaymentStatusController.class.getName());

	@Autowired
	private PaymentStatusService paymentStatusService;
	
	@PostMapping("/paymentStatus")
	public ResponseEntity<PaymentStatusResponseDto> getPaymentStatus(@RequestBody PaymentStatusRequestDto requestDto){
		L.info("PaymentStatusRequestDto>>"+requestDto.toString());
		PaymentStatusResponseDto responseDto = paymentStatusService.paymentStatusCheck(requestDto);
		
		return new ResponseEntity<PaymentStatusResponseDto>(responseDto, HttpStatus.OK);
	}
	
}
