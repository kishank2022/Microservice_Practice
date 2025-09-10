package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class GetQuoteResponseDtoMessageResult {

	@JsonProperty("Result")
	private String result;
	@JsonProperty("ErrorMessage")
    private String errorMessage;
	@JsonProperty("SuccessMessage")
    private String successMessage;
	public GetQuoteResponseDtoMessageResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetQuoteResponseDtoMessageResult(String result, String errorMessage, String successMessage) {
		super();
		this.result = result;
		this.errorMessage = errorMessage;
		this.successMessage = successMessage;
	}
	@Override
	public String toString() {
		return "GetQuoteResponseDtoMessageResult [result=" + result + ", errorMessage=" + errorMessage
				+ ", successMessage=" + successMessage + "]";
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	
}
