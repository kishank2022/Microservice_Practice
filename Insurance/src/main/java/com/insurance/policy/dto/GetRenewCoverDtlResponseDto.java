package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRenewCoverDtlResponseDto {

	@JsonProperty("CoverDesc")
	private String coverDesc;
	@JsonProperty("Premium")
    private String premium;
	public GetRenewCoverDtlResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetRenewCoverDtlResponseDto(String coverDesc, String premium) {
		super();
		this.coverDesc = coverDesc;
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "GetRenewCoverDtlResponseDto [coverDesc=" + coverDesc + ", premium=" + premium + "]";
	}
	public String getCoverDesc() {
		return coverDesc;
	}
	public void setCoverDesc(String coverDesc) {
		this.coverDesc = coverDesc;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	
	
	
	
}
