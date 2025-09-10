package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MakePaymentRequestDto {

	@JsonProperty("createdBy")
	private String createdBy;
	@JsonProperty("paymentFrom")
    private String paymentFrom;
	@JsonProperty("prodCode")
    private String prodCode;
	@JsonProperty("QuoteId")
	private String QuoteId;
	@JsonProperty("amount")
    private String amount;
	@JsonProperty("sourceUrl")
    private String sourceUrl;
	@JsonProperty("DbFrom")
	private String DbFrom;
	@JsonProperty("application")
    private String application;
	@JsonProperty("prodName")
    private String prodName;
	public MakePaymentRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MakePaymentRequestDto(String createdBy, String paymentFrom, String prodCode, String quoteId, String amount,
			String sourceUrl, String dbFrom, String application, String prodName) {
		super();
		this.createdBy = createdBy;
		this.paymentFrom = paymentFrom;
		this.prodCode = prodCode;
		QuoteId = quoteId;
		this.amount = amount;
		this.sourceUrl = sourceUrl;
		DbFrom = dbFrom;
		this.application = application;
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "MakePaymentRequestDto [createdBy=" + createdBy + ", paymentFrom=" + paymentFrom + ", prodCode="
				+ prodCode + ", QuoteId=" + QuoteId + ", amount=" + amount + ", sourceUrl=" + sourceUrl + ", DbFrom="
				+ DbFrom + ", application=" + application + ", prodName=" + prodName + "]";
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getPaymentFrom() {
		return paymentFrom;
	}
	public void setPaymentFrom(String paymentFrom) {
		this.paymentFrom = paymentFrom;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getQuoteId() {
		return QuoteId;
	}
	public void setQuoteId(String quoteId) {
		QuoteId = quoteId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getDbFrom() {
		return DbFrom;
	}
	public void setDbFrom(String dbFrom) {
		DbFrom = dbFrom;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	
	
}
