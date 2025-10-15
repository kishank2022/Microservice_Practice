package com.insurance.policy.dto;


public class PaymentRequestDto {

//	private String transactionNumber;	
//    private String cardNumber;    
    private String proposalNumber;
	private String prodCode;
    private String amount;
//    private String prodName;
    private String vkid;

	public PaymentRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentRequestDto(String proposalNumber, String prodCode, String amount, String vkid) {
		super();
		this.proposalNumber = proposalNumber;
		this.prodCode = prodCode;
		this.amount = amount;
		this.vkid = vkid;
	}

	@Override
	public String toString() {
		return "PaymentRequestDto [proposalNumber=" + proposalNumber + ", prodCode=" + prodCode + ", amount=" + amount
				+ ", vkid=" + vkid + "]";
	}

	public String getProposalNumber() {
		return proposalNumber;
	}

	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getVkid() {
		return vkid;
	}

	public void setVkid(String vkid) {
		this.vkid = vkid;
	}

	
    
	
}
