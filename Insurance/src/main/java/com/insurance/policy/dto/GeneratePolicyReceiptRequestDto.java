package com.insurance.policy.dto;

public class GeneratePolicyReceiptRequestDto {

	private String proposalNo;

	public GeneratePolicyReceiptRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeneratePolicyReceiptRequestDto(String proposalNo) {
		super();
		this.proposalNo = proposalNo;
	}

	@Override
	public String toString() {
		return "GeneratePolicyReceiptRequestDto [proposalNo=" + proposalNo + "]";
	}

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}
	
	
	
}
