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
import com.insurance.policy.dto.GenerateCarProposalResponseDto;
import com.insurance.policy.dto.GenerateProposalResultResponseDto;
import com.insurance.policy.dto.GenerateTwoWheelerProposalRequestDto;
import com.insurance.policy.externalAPICall.service.GenerateTwoWheelerProposalService;

@RestController
@RequestMapping("/insurance/api/")
public class GenerateTwoWheelerProposalController {

	@Autowired
	private GenerateTwoWheelerProposalService generateTwoWheelerProposalService;
	
	private static final Logger L   = Logger.getLogger(GenerateTwoWheelerProposalController.class.getName());
	
	@PostMapping("/generateTwoWheelerProposal")
	public ResponseEntity<GenerateCarProposalResponseDto> generateTwoWheelerProposalController(@RequestBody GenerateTwoWheelerProposalRequestDto requestDto){
		L.info("GenerateTwoWheelerProposalRequestDto>>"+requestDto.toString());
		GenerateCarProposalResponseDto responseDto = generateTwoWheelerProposalService.generateTwoWheelerProposal(requestDto);
		if(responseDto.getGenerateProposalResult() == null) {
			GenerateProposalResultResponseDto res1 = new GenerateProposalResultResponseDto();
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
			responseDto.setGenerateProposalResult(res1);
		}	
		return new ResponseEntity<GenerateCarProposalResponseDto>(responseDto, HttpStatus.OK);
	}
}
