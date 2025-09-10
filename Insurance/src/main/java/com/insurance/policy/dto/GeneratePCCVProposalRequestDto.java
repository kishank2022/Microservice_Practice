package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeneratePCCVProposalRequestDto {

	@JsonProperty("objPolicyEntryETT")
	private GeneratePCCVPolicyEntryEttProposalRequestDto objPolicyEntryETT;

	public GeneratePCCVProposalRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeneratePCCVProposalRequestDto(GeneratePCCVPolicyEntryEttProposalRequestDto objPolicyEntryETT) {
		super();
		this.objPolicyEntryETT = objPolicyEntryETT;
	}

	@Override
	public String toString() {
		return "GeneratePCCVProposalRequestDto [objPolicyEntryETT=" + objPolicyEntryETT + "]";
	}

	public GeneratePCCVPolicyEntryEttProposalRequestDto getObjPolicyEntryETT() {
		return objPolicyEntryETT;
	}

	public void setObjPolicyEntryETT(GeneratePCCVPolicyEntryEttProposalRequestDto objPolicyEntryETT) {
		this.objPolicyEntryETT = objPolicyEntryETT;
	} 
	
	
	
}
