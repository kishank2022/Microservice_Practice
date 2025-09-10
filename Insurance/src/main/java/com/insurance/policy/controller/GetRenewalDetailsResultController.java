package com.insurance.policy.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.insurance.policy.dto.GetRenewCoverDtlResponseDto;
import com.insurance.policy.dto.GetRenewalDetailsResultRequestDto;
import com.insurance.policy.dto.RenewalDetailsResultResponseDto;
import com.insurance.policy.dto.RenewalDtlListResponseDto;
import com.insurance.policy.externalAPICall.service.GetQuoteAPICallService;
import com.insurance.policy.externalAPICall.service.GetRenewalDetailsResultService;

@RestController
@RequestMapping("/insurance/api/")
public class GetRenewalDetailsResultController {

	private static final Logger L   = Logger.getLogger(GetRenewalDetailsResultController.class.getName());

	@Autowired
	private GetRenewalDetailsResultService getRenewalDetailsResultService;
	
	@PostMapping("/getRenewalDetail")
	public ResponseEntity<RenewalDetailsResultResponseDto> getQuote(@RequestBody GetRenewalDetailsResultRequestDto requestDto){
		L.info("GetRenewalDetailsResultRequestDto>>"+requestDto.toString());
		RenewalDetailsResultResponseDto responseDto = getRenewalDetailsResultService.getRenewalDetailsResult(requestDto);
		if(responseDto.getMessageResult() == null) {
			responseDto.setMessageResult("");
		}
		RenewalDtlListResponseDto res1 = responseDto.getRenewalDtlList().get(0);
		if(res1.getGetRenewCoverDtl().size()==0) {
			GetRenewCoverDtlResponseDto res2 = new GetRenewCoverDtlResponseDto();
			res2.setCoverDesc("");
			res2.setPremium("");
			List<GetRenewCoverDtlResponseDto> list1 = new ArrayList<>();
			list1.add(res2);
			res1.setGetRenewCoverDtl(list1);
		}
		
		return new ResponseEntity<RenewalDetailsResultResponseDto>(responseDto, HttpStatus.OK);
	}
	
}
