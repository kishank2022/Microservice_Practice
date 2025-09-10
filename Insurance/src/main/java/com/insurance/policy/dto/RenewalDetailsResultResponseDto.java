package com.insurance.policy.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RenewalDetailsResultResponseDto {

	@JsonProperty("MessageResult")
	private String messageResult;
	@JsonProperty("ERROR_CODE")
    private String eRROR_CODE;
	@JsonProperty("ERROR_DESC")
    private String eRROR_DESC;
	@JsonProperty("RenewalDtlList")
    private List<RenewalDtlListResponseDto> renewalDtlList;
	public RenewalDetailsResultResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RenewalDetailsResultResponseDto(String messageResult, String eRROR_CODE, String eRROR_DESC,
			List<RenewalDtlListResponseDto> renewalDtlList) {
		super();
		this.messageResult = messageResult;
		this.eRROR_CODE = eRROR_CODE;
		this.eRROR_DESC = eRROR_DESC;
		this.renewalDtlList = renewalDtlList;
	}
	@Override
	public String toString() {
		return "RenewalDetailsResultResponseDto [messageResult=" + messageResult + ", eRROR_CODE=" + eRROR_CODE
				+ ", eRROR_DESC=" + eRROR_DESC + ", renewalDtlList=" + renewalDtlList + "]";
	}
	public String getMessageResult() {
		return messageResult;
	}
	public void setMessageResult(String messageResult) {
		this.messageResult = messageResult;
	}
	public String geteRROR_CODE() {
		return eRROR_CODE;
	}
	public void seteRROR_CODE(String eRROR_CODE) {
		this.eRROR_CODE = eRROR_CODE;
	}
	public String geteRROR_DESC() {
		return eRROR_DESC;
	}
	public void seteRROR_DESC(String eRROR_DESC) {
		this.eRROR_DESC = eRROR_DESC;
	}
	public List<RenewalDtlListResponseDto> getRenewalDtlList() {
		return renewalDtlList;
	}
	public void setRenewalDtlList(List<RenewalDtlListResponseDto> renewalDtlList) {
		this.renewalDtlList = renewalDtlList;
	}
	
	
	
	
}
