package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeneratePCCVProposalResponseDto {

	@JsonProperty("GeneratePCCVProposalResult")
	private GeneratePCCVProposalResultResponseDto generatePCCVProposalResult;
	
	@JsonProperty("MessageResult")
	private GenerateProposalMessageResultResponseDto messageResult;

	public GeneratePCCVProposalResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeneratePCCVProposalResponseDto(GeneratePCCVProposalResultResponseDto generatePCCVProposalResult,
			GenerateProposalMessageResultResponseDto messageResult) {
		super();
		this.generatePCCVProposalResult = generatePCCVProposalResult;
		this.messageResult = messageResult;
	}

	@Override
	public String toString() {
		return "GeneratePCCVProposalResponseDto [generatePCCVProposalResult=" + generatePCCVProposalResult
				+ ", messageResult=" + messageResult + "]";
	}

	public GeneratePCCVProposalResultResponseDto getGeneratePCCVProposalResult() {
		return generatePCCVProposalResult;
	}

	public void setGeneratePCCVProposalResult(GeneratePCCVProposalResultResponseDto generatePCCVProposalResult) {
		this.generatePCCVProposalResult = generatePCCVProposalResult;
	}

	public GenerateProposalMessageResultResponseDto getMessageResult() {
		return messageResult;
	}

	public void setMessageResult(GenerateProposalMessageResultResponseDto messageResult) {
		this.messageResult = messageResult;
	}

	
	
}
