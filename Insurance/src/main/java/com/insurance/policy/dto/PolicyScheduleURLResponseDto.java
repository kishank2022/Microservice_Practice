package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyScheduleURLResponseDto {

	@JsonProperty("PolicyScheduleURLResult")
	private String policyScheduleURLResult;

	public PolicyScheduleURLResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PolicyScheduleURLResponseDto(String policyScheduleURLResult) {
		super();
		this.policyScheduleURLResult = policyScheduleURLResult;
	}

	@Override
	public String toString() {
		return "PolicyScheduleURLResponseDto [policyScheduleURLResult=" + policyScheduleURLResult + "]";
	}

	public String getPolicyScheduleURLResult() {
		return policyScheduleURLResult;
	}

	public void setPolicyScheduleURLResult(String policyScheduleURLResult) {
		this.policyScheduleURLResult = policyScheduleURLResult;
	}
	
	
	
	
}
