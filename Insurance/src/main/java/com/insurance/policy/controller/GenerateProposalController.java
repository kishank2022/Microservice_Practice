package com.insurance.policy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.policy.dto.CoverDtlListDto;
import com.insurance.policy.dto.GenerateCarProposalRequestDto;
import com.insurance.policy.dto.GenerateCarProposalResponseDto;
import com.insurance.policy.dto.GenerateGCCVProposalRequestDto;
import com.insurance.policy.dto.GenerateGCCVProposalResponseDto;
import com.insurance.policy.dto.GenerateGCCVProposalResultResponseDto;
import com.insurance.policy.dto.GeneratePCCVProposalRequestDto;
import com.insurance.policy.dto.GeneratePCCVProposalResponseDto;
import com.insurance.policy.dto.GeneratePCCVProposalResultResponseDto;
import com.insurance.policy.dto.GenerateProposalResultResponseDto;
import com.insurance.policy.dto.GenerateTwoWheelerProposalRequestDto;
import com.insurance.policy.externalAPICall.service.GenerateCarProposalService;
import com.insurance.policy.externalAPICall.service.GenerateGCCVProposalService;
import com.insurance.policy.externalAPICall.service.GeneratePCCVProposalService;
import com.insurance.policy.externalAPICall.service.GenerateTwoWheelerProposalService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/insurance/api/")
@Slf4j
public class GenerateProposalController {

	@Autowired
	private GenerateCarProposalService generateCarProposalService;
	
	@Autowired
	private GenerateGCCVProposalService generateGCCVProposalServic;
	
	@Autowired
	private GeneratePCCVProposalService generatePCCVProposalService;
	
	@Autowired
	private GenerateTwoWheelerProposalService generateTwoWheelerProposalService;
	
	@PostMapping("/generateCarProposal")
	public ResponseEntity<GenerateCarProposalResponseDto> getQuote(@RequestBody GenerateCarProposalRequestDto requestDto){
		log.info("GenerateCarProposalRequestDto :: {}",requestDto.toString());
		GenerateCarProposalResponseDto responseDto = generateCarProposalService.generateCarProposal(requestDto);
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
	
	@PostMapping("/generateGCCVProposal")
	public ResponseEntity<GenerateGCCVProposalResponseDto> generateGCCVProposal(@RequestBody GenerateGCCVProposalRequestDto requestDto){
		log.info("GenerateGCCVProposalRequestDto :: {}",requestDto.toString());
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
	
	@PostMapping("/generatePccvProposal")
	public ResponseEntity<GeneratePCCVProposalResponseDto> getQuote(@RequestBody GeneratePCCVProposalRequestDto requestDto){
		log.info("GeneratePCCVProposalRequestDto :: {}",requestDto.toString());
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
	
	@PostMapping("/generateTwoWheelerProposal")
	public ResponseEntity<GenerateCarProposalResponseDto> generateTwoWheelerProposalController(@RequestBody GenerateTwoWheelerProposalRequestDto requestDto){
		log.info("GenerateTwoWheelerProposalRequestDto :: {}",requestDto.toString());
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
