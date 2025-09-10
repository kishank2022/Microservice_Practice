package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CoverDtlListDto {

	@JsonProperty("CoverDesc")
	private String coverDesc;
	
	@JsonProperty("Premium")
    private String premium;
	
	@JsonProperty("Type")
    private String type;
	public CoverDtlListDto() {
		super();
	}
	public CoverDtlListDto(String coverDesc, String premium, String type) {
		super();
		this.coverDesc = coverDesc;
		this.premium = premium;
		this.type = type;
	}
	@Override
	public String toString() {
		return "CoverDtlListDto [coverDesc=" + coverDesc + ", premium=" + premium + ", type=" + type + "]";
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
    
    
}
