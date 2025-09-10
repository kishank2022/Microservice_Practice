package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentStatusRequestDto {

	@JsonProperty("ProposalNo")
	private String ProposalNo;
	@JsonProperty("QuoteID")
    private String QuoteID;
	public PaymentStatusRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentStatusRequestDto(String proposalNo, String quoteID) {
		super();
		ProposalNo = proposalNo;
		QuoteID = quoteID;
	}
	@Override
	public String toString() {
		return "PaymentStatusRequestDto [ProposalNo=" + ProposalNo + ", QuoteID=" + QuoteID + "]";
	}
	public String getProposalNo() {
		return ProposalNo;
	}
	public void setProposalNo(String proposalNo) {
		ProposalNo = proposalNo;
	}
	public String getQuoteID() {
		return QuoteID;
	}
	public void setQuoteID(String quoteID) {
		QuoteID = quoteID;
	}
	
	
}
