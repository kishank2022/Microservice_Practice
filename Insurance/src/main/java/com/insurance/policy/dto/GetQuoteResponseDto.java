package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class GetQuoteResponseDto {

	@JsonProperty("MessageResult")
	private GetQuoteResponseDtoMessageResult messageResult;
	@JsonProperty("GetQuotResult")
    private GetQuoteResponseDtoGetQuotResult getQuotResult;
	
	public GetQuoteResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetQuoteResponseDto(GetQuoteResponseDtoMessageResult messageResult,
			GetQuoteResponseDtoGetQuotResult getQuotResult) {
		super();
		this.messageResult = messageResult;
		this.getQuotResult = getQuotResult;
	}

	@Override
	public String toString() {
		return "GetQuoteResponseDto [messageResult=" + messageResult + ", getQuotResult=" + getQuotResult + "]";
	}

	public GetQuoteResponseDtoMessageResult getMessageResult() {
		return messageResult;
	}

	public void setMessageResult(GetQuoteResponseDtoMessageResult messageResult) {
		this.messageResult = messageResult;
	}

	public GetQuoteResponseDtoGetQuotResult getGetQuotResult() {
		return getQuotResult;
	}

	public void setGetQuotResult(GetQuoteResponseDtoGetQuotResult getQuotResult) {
		this.getQuotResult = getQuotResult;
	}
	
    
    
}
