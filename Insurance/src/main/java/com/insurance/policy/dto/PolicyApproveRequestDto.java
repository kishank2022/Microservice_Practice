package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyApproveRequestDto {

	@JsonProperty("ProposalNo")
	private String ProposalNo;
	@JsonProperty("TransactionNumber")
    private String TransactionNumber;
	@JsonProperty("CardNumber")
    private String CardNumber;
	@JsonProperty("CardholderName")
	private String CardholderName;
	@JsonProperty("CardType")
    private String CardType;
	@JsonProperty("CardValidUpTo")
    private String CardValidUpTo;
	@JsonProperty("BankName")
	private String BankName;
	@JsonProperty("BranchName")
    private String BranchName;
	@JsonProperty("PaymentType")
    private String PaymentType;
	@JsonProperty("TransactionDate")
    private String TransactionDate;
	@JsonProperty("ChequeType")
    private String ChequeType;
	@JsonProperty("ChequeClearType")
    private String ChequeClearType;
	@JsonProperty("CashType")
    private String CashType;
	
	@JsonProperty("PremiumAmt")
    private String PremiumAmt;
	
	
	
	public String getPremiumAmt() {
		return PremiumAmt;
	}
	public void setPremiumAmt(String premiumAmt) {
		PremiumAmt = premiumAmt;
	}
	public PolicyApproveRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyApproveRequestDto(String proposalNo, String transactionNumber, String cardNumber,
			String cardholderName, String cardType, String cardValidUpTo, String bankName, String branchName,
			String paymentType, String transactionDate, String chequeType, String chequeClearType, String cashType) {
		super();
		ProposalNo = proposalNo;
		TransactionNumber = transactionNumber;
		CardNumber = cardNumber;
		CardholderName = cardholderName;
		CardType = cardType;
		CardValidUpTo = cardValidUpTo;
		BankName = bankName;
		BranchName = branchName;
		PaymentType = paymentType;
		TransactionDate = transactionDate;
		ChequeType = chequeType;
		ChequeClearType = chequeClearType;
		CashType = cashType;
	}
	@Override
	public String toString() {
		return "PolicyApproveRequestDto [ProposalNo=" + ProposalNo + ", TransactionNumber=" + TransactionNumber
				+ ", CardNumber=" + CardNumber + ", CardholderName=" + CardholderName + ", CardType=" + CardType
				+ ", CardValidUpTo=" + CardValidUpTo + ", BankName=" + BankName + ", BranchName=" + BranchName
				+ ", PaymentType=" + PaymentType + ", TransactionDate=" + TransactionDate + ", ChequeType=" + ChequeType
				+ ", ChequeClearType=" + ChequeClearType + ", CashType=" + CashType + "]";
	}
	public String getProposalNo() {
		return ProposalNo;
	}
	public void setProposalNo(String proposalNo) {
		ProposalNo = proposalNo;
	}
	public String getTransactionNumber() {
		return TransactionNumber;
	}
	public void setTransactionNumber(String transactionNumber) {
		TransactionNumber = transactionNumber;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getCardholderName() {
		return CardholderName;
	}
	public void setCardholderName(String cardholderName) {
		CardholderName = cardholderName;
	}
	public String getCardType() {
		return CardType;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getCardValidUpTo() {
		return CardValidUpTo;
	}
	public void setCardValidUpTo(String cardValidUpTo) {
		CardValidUpTo = cardValidUpTo;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBranchName() {
		return BranchName;
	}
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getChequeType() {
		return ChequeType;
	}
	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
	}
	public String getChequeClearType() {
		return ChequeClearType;
	}
	public void setChequeClearType(String chequeClearType) {
		ChequeClearType = chequeClearType;
	}
	public String getCashType() {
		return CashType;
	}
	public void setCashType(String cashType) {
		CashType = cashType;
	}
	
	
	
	
}
