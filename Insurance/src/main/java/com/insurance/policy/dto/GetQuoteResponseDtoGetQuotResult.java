package com.insurance.policy.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class GetQuoteResponseDtoGetQuotResult {

	@JsonProperty("POL_SYS_ID")
	private String pOL_SYS_ID;
	@JsonProperty("PROPOSAL_NO")
    private String pROPOSAL_NO;
	@JsonProperty("VehicleIDV")
    private String vehicleIDV;
	@JsonProperty("ERROR_DESC")
    private String eRROR_DESC;
	@JsonProperty("ERROR_CODE")
    private String eRROR_CODE;
	@JsonProperty("CoverDtlList")
    private List<CoverDtlListDto> coverDtlList;
	public GetQuoteResponseDtoGetQuotResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetQuoteResponseDtoGetQuotResult(String pOL_SYS_ID, String pROPOSAL_NO, String vehicleIDV, String eRROR_DESC,
			String eRROR_CODE, List<CoverDtlListDto> coverDtlList) {
		super();
		this.pOL_SYS_ID = pOL_SYS_ID;
		this.pROPOSAL_NO = pROPOSAL_NO;
		this.vehicleIDV = vehicleIDV;
		this.eRROR_DESC = eRROR_DESC;
		this.eRROR_CODE = eRROR_CODE;
		this.coverDtlList = coverDtlList;
	}
	@Override
	public String toString() {
		return "GetQuoteResponseDtoGetQuotResult [pOL_SYS_ID=" + pOL_SYS_ID + ", pROPOSAL_NO=" + pROPOSAL_NO
				+ ", vehicleIDV=" + vehicleIDV + ", eRROR_DESC=" + eRROR_DESC + ", eRROR_CODE=" + eRROR_CODE
				+ ", coverDtlList=" + coverDtlList + "]";
	}
	public String getpOL_SYS_ID() {
		return pOL_SYS_ID;
	}
	public void setpOL_SYS_ID(String pOL_SYS_ID) {
		this.pOL_SYS_ID = pOL_SYS_ID;
	}
	public String getpROPOSAL_NO() {
		return pROPOSAL_NO;
	}
	public void setpROPOSAL_NO(String pROPOSAL_NO) {
		this.pROPOSAL_NO = pROPOSAL_NO;
	}
	public String getVehicleIDV() {
		return vehicleIDV;
	}
	public void setVehicleIDV(String vehicleIDV) {
		this.vehicleIDV = vehicleIDV;
	}
	public String geteRROR_DESC() {
		return eRROR_DESC;
	}
	public void seteRROR_DESC(String eRROR_DESC) {
		this.eRROR_DESC = eRROR_DESC;
	}
	public String geteRROR_CODE() {
		return eRROR_CODE;
	}
	public void seteRROR_CODE(String eRROR_CODE) {
		this.eRROR_CODE = eRROR_CODE;
	}
	public List<CoverDtlListDto> getCoverDtlList() {
		return coverDtlList;
	}
	public void setCoverDtlList(List<CoverDtlListDto> coverDtlList) {
		this.coverDtlList = coverDtlList;
	}
	
	
    
}
