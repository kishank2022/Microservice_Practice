package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentStatusResponseDto {


	@JsonProperty("MessageResult")
    private PaymentStatusResultResponseDto messageResult;

	public PaymentStatusResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentStatusResponseDto(PaymentStatusResultResponseDto messageResult) {
		super();
		this.messageResult = messageResult;
	}

	@Override
	public String toString() {
		return "PaymentStatusResponseDto [messageResult=" + messageResult + "]";
	}

	public PaymentStatusResultResponseDto getMessageResult() {
		return messageResult;
	}

	public void setMessageResult(PaymentStatusResultResponseDto messageResult) {
		this.messageResult = messageResult;
	}

	
	
	
}
