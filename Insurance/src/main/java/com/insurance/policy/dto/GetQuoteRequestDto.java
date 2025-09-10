package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetQuoteRequestDto {

	@JsonProperty("objPolicyEntryETT")
	private GetQuoteRequestDtoObjPolicyEntryETT objPolicyEntryETT;

	public GetQuoteRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetQuoteRequestDto(GetQuoteRequestDtoObjPolicyEntryETT objPolicyEntryETT) {
		super();
		this.objPolicyEntryETT = objPolicyEntryETT;
	}

	@Override
	public String toString() {
		return "GetQuoteRequestDto [objPolicyEntryETT=" + objPolicyEntryETT + "]";
	}

	public GetQuoteRequestDtoObjPolicyEntryETT getObjPolicyEntryETT() {
		return objPolicyEntryETT;
	}

	public void setObjPolicyEntryETT(GetQuoteRequestDtoObjPolicyEntryETT objPolicyEntryETT) {
		this.objPolicyEntryETT = objPolicyEntryETT;
	}

	
	
}
