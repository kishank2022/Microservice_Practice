package com.insurance.policy.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.policy.dto.GetQuoteRequestDto;
import com.insurance.policy.dto.GetQuoteResponseDto;
import com.insurance.policy.externalAPICall.service.GetQuoteAPICallService;

@RestController
@RequestMapping("/insurance/api/")
public class GetQuoteController {
	
	private static final Logger L   = Logger.getLogger(GetQuoteController.class.getName());

	@Autowired
	private GetQuoteAPICallService getQuoteAPICallService;
	
	@PostMapping("/getQuote")
	public ResponseEntity<GetQuoteResponseDto> getQuote(@RequestBody GetQuoteRequestDto requestDto){
		L.info("GetQuoteRequestDto>>"+requestDto.toString());
		GetQuoteResponseDto responseDto = getQuoteAPICallService.getQuote(requestDto);
		return new ResponseEntity<GetQuoteResponseDto>(responseDto, HttpStatus.OK);
	}
}
