package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentStatusResultResponseDto {

	@JsonProperty("ErrorMessage")
	private String errorMessage;
	@JsonProperty("Result")
    private String result;
	@JsonProperty("SuccessMessage")
    private String successMessage;
	public PaymentStatusResultResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentStatusResultResponseDto(String errorMessage, String result, String successMessage) {
		super();
		this.errorMessage = errorMessage;
		this.result = result;
		this.successMessage = successMessage;
	}
	@Override
	public String toString() {
		return "PaymentStatusResultResponseDto [errorMessage=" + errorMessage + ", result=" + result
				+ ", successMessage=" + successMessage + "]";
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
		
	
}
