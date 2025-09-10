package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateGCCVProposalRequestDto {

	 @JsonProperty("objGCCVProposalEntryETT")
	private GenerateGCCVProposalEntryEttRequestDto objGCCVProposalEntryETT;

	public GenerateGCCVProposalRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenerateGCCVProposalRequestDto(GenerateGCCVProposalEntryEttRequestDto objGCCVProposalEntryETT) {
		super();
		this.objGCCVProposalEntryETT = objGCCVProposalEntryETT;
	}

	@Override
	public String toString() {
		return "GenerateGCCVProposalRequestDto []";
	}

	public GenerateGCCVProposalEntryEttRequestDto getObjGCCVProposalEntryETT() {
		return objGCCVProposalEntryETT;
	}

	public void setObjGCCVProposalEntryETT(GenerateGCCVProposalEntryEttRequestDto objGCCVProposalEntryETT) {
		this.objGCCVProposalEntryETT = objGCCVProposalEntryETT;
	}
	 
	 
}
