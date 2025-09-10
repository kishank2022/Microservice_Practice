package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MakePaymentResponseDto {

	@JsonProperty("PolicyNumber")
	private String PolicyNumber;
	@JsonProperty("PolicyURL")
    private String PolicyURL;
	@JsonProperty("Status")
    private String Status;
	public MakePaymentResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MakePaymentResponseDto(String policyNumber, String policyURL, String status) {
		super();
		PolicyNumber = policyNumber;
		PolicyURL = policyURL;
		Status = status;
	}
	@Override
	public String toString() {
		return "MakePaymentResponseDto [PolicyNumber=" + PolicyNumber + ", PolicyURL=" + PolicyURL + ", Status="
				+ Status + "]";
	}
	public String getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getPolicyURL() {
		return PolicyURL;
	}
	public void setPolicyURL(String policyURL) {
		PolicyURL = policyURL;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
