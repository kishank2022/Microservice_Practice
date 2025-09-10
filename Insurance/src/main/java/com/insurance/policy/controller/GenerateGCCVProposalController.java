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
import com.insurance.policy.dto.GenerateGCCVProposalRequestDto;
import com.insurance.policy.dto.GenerateGCCVProposalResponseDto;
import com.insurance.policy.dto.GenerateGCCVProposalResultResponseDto;
import com.insurance.policy.externalAPICall.service.GenerateGCCVProposalService;

@RestController
@RequestMapping("/insurance/api/")
public class GenerateGCCVProposalController {

	
	private static final Logger L   = Logger.getLogger(GenerateGCCVProposalController.class.getName());

	@Autowired
	private GenerateGCCVProposalService generateGCCVProposalServic;
	
	@PostMapping("/generateGCCVProposal")
	public ResponseEntity<GenerateGCCVProposalResponseDto> generateGCCVProposal(@RequestBody GenerateGCCVProposalRequestDto requestDto){
		L.info("GenerateGCCVProposalRequestDto>>"+requestDto.toString());
		GenerateGCCVProposalResponseDto responseDto = generateGCCVProposalServic.generateGCCVProposal(requestDto);
		if(responseDto.getGenerateGCCVProposalResult() == null) {
			GenerateGCCVProposalResultResponseDto res1 = new GenerateGCCVProposalResultResponseDto();
			CoverDtlListDto res2 = new CoverDtlListDto();
			res2.setCoverDesc("");
			res2.setPremium("");
			res2.setType("");
			List<CoverDtlListDto> list1 = new ArrayList<>();
			list1.add(res2);
			res1.setCoverDtlList(list1);
			res1.seteRROR_CODE("");
			res1.seteRROR_DESC("");
			res1.setgROSSPREMIUM("");
			res1.setpOL_SYS_ID("");
			res1.setpROPOSAL_NO("");
			res1.setsERVICE_TAX("");
			res1.setsTAMPDUTY("");
			res1.settOTALPREMIUM("");
			res1.setVehicleIDV("");
			responseDto.setGenerateGCCVProposalResult(res1);
		}
		return new ResponseEntity<GenerateGCCVProposalResponseDto>(responseDto, HttpStatus.OK);
	}
	
}
