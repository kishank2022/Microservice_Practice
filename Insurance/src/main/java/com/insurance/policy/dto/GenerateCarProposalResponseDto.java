package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateCarProposalResponseDto {

	@JsonProperty("MessageResult")
	private GenerateProposalMessageResultResponseDto messageResult;
	
	@JsonProperty("GenerateProposalResult")
	private GenerateProposalResultResponseDto generateProposalResult;

	public GenerateCarProposalResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenerateCarProposalResponseDto(GenerateProposalMessageResultResponseDto messageResult,
			GenerateProposalResultResponseDto generateProposalResult) {
		super();
		this.messageResult = messageResult;
		this.generateProposalResult = generateProposalResult;
	}

	@Override
	public String toString() {
		return "GenerateCarProposalResponseDto [messageResult=" + messageResult + ", generateProposalResult="
				+ generateProposalResult + "]";
	}

	public GenerateProposalMessageResultResponseDto getMessageResult() {
		return messageResult;
	}

	public void setMessageResult(GenerateProposalMessageResultResponseDto messageResult) {
		this.messageResult = messageResult;
	}

	public GenerateProposalResultResponseDto getGenerateProposalResult() {
		return generateProposalResult;
	}

	public void setGenerateProposalResult(GenerateProposalResultResponseDto generateProposalResult) {
		this.generateProposalResult = generateProposalResult;
	}

	
	
}
