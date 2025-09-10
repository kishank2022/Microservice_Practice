package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateTwoWheelerProposalRequestDto {

	@JsonProperty("objPolicyEntryETT")
	private GenerateTwoWheelerProposalPolicyEntryEttRequestDto objPolicyEntryETT;

	public GenerateTwoWheelerProposalRequestDto() {
		super();
	}

	public GenerateTwoWheelerProposalRequestDto(GenerateTwoWheelerProposalPolicyEntryEttRequestDto objPolicyEntryETT) {
		super();
		this.objPolicyEntryETT = objPolicyEntryETT;
	}

	@Override
	public String toString() {
		return "GenerateTwoWheelerProposalRequestDto [objPolicyEntryETT=" + objPolicyEntryETT + "]";
	}

	public GenerateTwoWheelerProposalPolicyEntryEttRequestDto getObjPolicyEntryETT() {
		return objPolicyEntryETT;
	}

	public void setObjPolicyEntryETT(GenerateTwoWheelerProposalPolicyEntryEttRequestDto objPolicyEntryETT) {
		this.objPolicyEntryETT = objPolicyEntryETT;
	}

	
	
}
