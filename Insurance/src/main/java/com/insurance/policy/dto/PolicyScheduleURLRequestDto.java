package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyScheduleURLRequestDto {

	@JsonProperty("strPolSysId")
	private String strPolSysId;

	public PolicyScheduleURLRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PolicyScheduleURLRequestDto(String strPolSysId) {
		super();
		this.strPolSysId = strPolSysId;
	}

	@Override
	public String toString() {
		return "PolicyScheduleURLRequestDto [strPolSysId=" + strPolSysId + "]";
	}

	public String getStrPolSysId() {
		return strPolSysId;
	}

	public void setStrPolSysId(String strPolSysId) {
		this.strPolSysId = strPolSysId;
	}
	
	
}
