package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateGCCVProposalResponseDto {

	@JsonProperty("MessageResult")
	private GenerateProposalMessageResultResponseDto messageResult;
	
	@JsonProperty("GenerateGCCVProposalResult")
	private GenerateGCCVProposalResultResponseDto generateGCCVProposalResult;

	public GenerateGCCVProposalResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenerateGCCVProposalResponseDto(GenerateProposalMessageResultResponseDto messageResult,
			GenerateGCCVProposalResultResponseDto generateGCCVProposalResult) {
		super();
		this.messageResult = messageResult;
		this.generateGCCVProposalResult = generateGCCVProposalResult;
	}

	@Override
	public String toString() {
		return "GenerateGCCVProposalResponseDto [messageResult=" + messageResult + ", generateGCCVProposalResult="
				+ generateGCCVProposalResult + "]";
	}

	public GenerateProposalMessageResultResponseDto getMessageResult() {
		return messageResult;
	}

	public void setMessageResult(GenerateProposalMessageResultResponseDto messageResult) {
		this.messageResult = messageResult;
	}

	public GenerateGCCVProposalResultResponseDto getGenerateGCCVProposalResult() {
		return generateGCCVProposalResult;
	}

	public void setGenerateGCCVProposalResult(GenerateGCCVProposalResultResponseDto generateGCCVProposalResult) {
		this.generateGCCVProposalResult = generateGCCVProposalResult;
	}

	
	
	
}
