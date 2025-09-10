package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateCarProposalRequestDto  {

	@JsonProperty("objPolicyEntryETT")
	private GenerateCarProposalPolicyEntryEntityRequestDto objPolicyEntryETT;

	public GenerateCarProposalRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenerateCarProposalRequestDto(GenerateCarProposalPolicyEntryEntityRequestDto objPolicyEntryETT) {
		super();
		this.objPolicyEntryETT = objPolicyEntryETT;
	}

	@Override
	public String toString() {
		return "GenerateCarProposalRequestDto [objPolicyEntryETT=" + objPolicyEntryETT + "]";
	}

	public GenerateCarProposalPolicyEntryEntityRequestDto getObjPolicyEntryETT() {
		return objPolicyEntryETT;
	}

	public void setObjPolicyEntryETT(GenerateCarProposalPolicyEntryEntityRequestDto objPolicyEntryETT) {
		this.objPolicyEntryETT = objPolicyEntryETT;
	}
	
	

	
	
	
}
