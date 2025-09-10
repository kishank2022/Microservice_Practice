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

import com.insurance.policy.dto.CoverDtlListDto;
import com.insurance.policy.dto.GeneratePCCVProposalRequestDto;
import com.insurance.policy.dto.GeneratePCCVProposalResponseDto;
import com.insurance.policy.dto.GeneratePCCVProposalResultResponseDto;
import com.insurance.policy.dto.GetQuoteRequestDto;
import com.insurance.policy.dto.GetQuoteResponseDto;
import com.insurance.policy.externalAPICall.service.GeneratePCCVProposalService;
import com.insurance.policy.externalAPICall.service.GetQuoteAPICallService;

@RestController
@RequestMapping("/insurance/api/")
public class GeneratePCCVProposalController {

	private static final Logger L   = Logger.getLogger(GeneratePCCVProposalController.class.getName());

	@Autowired
	private GeneratePCCVProposalService generatePCCVProposalService;
	
	@PostMapping("/generatePccvProposal")
	public ResponseEntity<GeneratePCCVProposalResponseDto> getQuote(@RequestBody GeneratePCCVProposalRequestDto requestDto){
		L.info("GeneratePCCVProposalRequestDto>>"+requestDto.toString());
		GeneratePCCVProposalResponseDto responseDto = generatePCCVProposalService.generatePCCVProposal(requestDto);
		if(responseDto.getGeneratePCCVProposalResult() == null) {
			GeneratePCCVProposalResultResponseDto res1 = new GeneratePCCVProposalResultResponseDto();
			CoverDtlListDto res2 = new CoverDtlListDto();
			res2.setCoverDesc("");
			res2.setPremium("");
			res2.setType("");
			List<CoverDtlListDto> list1 = new ArrayList<>();
			list1.add(res2);
			res1.setCoverDtlList(list1);
			res1.seteRROR_CODE("");
			res1.seteRROR_DESC("");
			res1.setpOL_SYS_ID("");
			res1.setpROPOSAL_NO("");
			res1.setVehicleIDV("");
			responseDto.setGeneratePCCVProposalResult(res1);
		}
		return new ResponseEntity<GeneratePCCVProposalResponseDto>(responseDto, HttpStatus.OK);
	}
}
