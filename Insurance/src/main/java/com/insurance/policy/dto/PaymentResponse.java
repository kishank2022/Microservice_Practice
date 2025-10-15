package com.insurance.policy.dto;

public class PaymentResponse {

	private String policyNumber;
	
	
	private String responseStatus;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	
	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public PaymentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PaymentResponse [policyNumber=" + policyNumber + ", responseStatus=" + responseStatus + "]";
	}

	public PaymentResponse(String policyNumber, String responseStatus) {
		super();
		this.policyNumber = policyNumber;
		this.responseStatus = responseStatus;
	}

	
	
	
}
