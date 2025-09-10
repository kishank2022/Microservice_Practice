package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyApproveResponseDto {

	
	@JsonProperty("MessageResult")
	private GenerateProposalMessageResultResponseDto messageResult;
	@JsonProperty("PolicyApproveResult")
    private PolicyApproveResultResponseDto policyApproveResult;
	public PolicyApproveResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyApproveResponseDto(GenerateProposalMessageResultResponseDto messageResult,
			PolicyApproveResultResponseDto policyApproveResult) {
		super();
		this.messageResult = messageResult;
		this.policyApproveResult = policyApproveResult;
	}
	@Override
	public String toString() {
		return "PolicyApproveResponseDto [messageResult=" + messageResult + ", policyApproveResult="
				+ policyApproveResult + "]";
	}
	public GenerateProposalMessageResultResponseDto getMessageResult() {
		return messageResult;
	}
	public void setMessageResult(GenerateProposalMessageResultResponseDto messageResult) {
		this.messageResult = messageResult;
	}
	public PolicyApproveResultResponseDto getPolicyApproveResult() {
		return policyApproveResult;
	}
	public void setPolicyApproveResult(PolicyApproveResultResponseDto policyApproveResult) {
		this.policyApproveResult = policyApproveResult;
	}
	
	
}
