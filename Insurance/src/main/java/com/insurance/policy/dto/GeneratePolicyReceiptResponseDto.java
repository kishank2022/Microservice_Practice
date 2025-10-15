package com.insurance.policy.dto;

public class GeneratePolicyReceiptResponseDto {

	private String proposalNo = "";
	
	private String receiptUrl= "";
	
	private String message= "";
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GeneratePolicyReceiptResponseDto(String proposalNo, String receiptUrl) {
		super();
		this.proposalNo = proposalNo;
		this.receiptUrl = receiptUrl;
	}

	public GeneratePolicyReceiptResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GeneratePolicyReceiptResponseDto [proposalNo=" + proposalNo + ", receiptUrl=" + receiptUrl + "]";
	}

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	public String getReceiptUrl() {
		return receiptUrl;
	}

	public void setReceiptUrl(String receiptUrl) {
		this.receiptUrl = receiptUrl;
	}
	
	
}
