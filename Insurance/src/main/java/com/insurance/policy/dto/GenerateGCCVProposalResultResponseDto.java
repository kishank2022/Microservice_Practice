package com.insurance.policy.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateGCCVProposalResultResponseDto {

	@JsonProperty("POL_SYS_ID")
	private String pOL_SYS_ID;
	@JsonProperty("PROPOSAL_NO")
    private String pROPOSAL_NO;
	@JsonProperty("VehicleIDV")
    private String vehicleIDV;
	@JsonProperty("GROSSPREMIUM")
    private String gROSSPREMIUM;
	@JsonProperty("SERVICE_TAX")
    private String sERVICE_TAX;
	@JsonProperty("TOTALPREMIUM")
    private String tOTALPREMIUM;
	@JsonProperty("STAMPDUTY")
    private String sTAMPDUTY;
	@JsonProperty("ERROR_DESC")
    private String eRROR_DESC;
	@JsonProperty("ERROR_CODE")
    private String eRROR_CODE;
	@JsonProperty("CoverDtlList")
    private List<CoverDtlListDto> coverDtlList;
	public GenerateGCCVProposalResultResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GenerateGCCVProposalResultResponseDto(String pOL_SYS_ID, String pROPOSAL_NO, String vehicleIDV,
			String gROSSPREMIUM, String sERVICE_TAX, String tOTALPREMIUM, String sTAMPDUTY, String eRROR_DESC,
			String eRROR_CODE, List<CoverDtlListDto> coverDtlList) {
		super();
		this.pOL_SYS_ID = pOL_SYS_ID;
		this.pROPOSAL_NO = pROPOSAL_NO;
		this.vehicleIDV = vehicleIDV;
		this.gROSSPREMIUM = gROSSPREMIUM;
		this.sERVICE_TAX = sERVICE_TAX;
		this.tOTALPREMIUM = tOTALPREMIUM;
		this.sTAMPDUTY = sTAMPDUTY;
		this.eRROR_DESC = eRROR_DESC;
		this.eRROR_CODE = eRROR_CODE;
		this.coverDtlList = coverDtlList;
	}
	@Override
	public String toString() {
		return "GenerateGCCVProposalResultResponseDto [pOL_SYS_ID=" + pOL_SYS_ID + ", pROPOSAL_NO=" + pROPOSAL_NO
				+ ", vehicleIDV=" + vehicleIDV + ", gROSSPREMIUM=" + gROSSPREMIUM + ", sERVICE_TAX=" + sERVICE_TAX
				+ ", tOTALPREMIUM=" + tOTALPREMIUM + ", sTAMPDUTY=" + sTAMPDUTY + ", eRROR_DESC=" + eRROR_DESC
				+ ", eRROR_CODE=" + eRROR_CODE + ", coverDtlList=" + coverDtlList + "]";
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
	public String getgROSSPREMIUM() {
		return gROSSPREMIUM;
	}
	public void setgROSSPREMIUM(String gROSSPREMIUM) {
		this.gROSSPREMIUM = gROSSPREMIUM;
	}
	public String getsERVICE_TAX() {
		return sERVICE_TAX;
	}
	public void setsERVICE_TAX(String sERVICE_TAX) {
		this.sERVICE_TAX = sERVICE_TAX;
	}
	public String gettOTALPREMIUM() {
		return tOTALPREMIUM;
	}
	public void settOTALPREMIUM(String tOTALPREMIUM) {
		this.tOTALPREMIUM = tOTALPREMIUM;
	}
	public String getsTAMPDUTY() {
		return sTAMPDUTY;
	}
	public void setsTAMPDUTY(String sTAMPDUTY) {
		this.sTAMPDUTY = sTAMPDUTY;
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
