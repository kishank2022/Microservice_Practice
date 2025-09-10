package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyApproveResultResponseDto {

	@JsonProperty("ApprovePolNo")
	private String approvePolNo;
	@JsonProperty("ApprovePolSysId")
    private String aprovePolSysId;
	@JsonProperty("Err_Desc")
    private String err_Desc;
	@JsonProperty("Err_Code")
    private String err_Code;
	public PolicyApproveResultResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyApproveResultResponseDto(String approvePolNo, String aprovePolSysId, String err_Desc,
			String err_Code) {
		super();
		this.approvePolNo = approvePolNo;
		this.aprovePolSysId = aprovePolSysId;
		this.err_Desc = err_Desc;
		this.err_Code = err_Code;
	}
	@Override
	public String toString() {
		return "PolicyApproveResultResponseDto [approvePolNo=" + approvePolNo + ", aprovePolSysId=" + aprovePolSysId
				+ ", err_Desc=" + err_Desc + ", err_Code=" + err_Code + "]";
	}
	public String getApprovePolNo() {
		return approvePolNo;
	}
	public void setApprovePolNo(String approvePolNo) {
		this.approvePolNo = approvePolNo;
	}
	public String getAprovePolSysId() {
		return aprovePolSysId;
	}
	public void setAprovePolSysId(String aprovePolSysId) {
		this.aprovePolSysId = aprovePolSysId;
	}
	public String getErr_Desc() {
		return err_Desc;
	}
	public void setErr_Desc(String err_Desc) {
		this.err_Desc = err_Desc;
	}
	public String getErr_Code() {
		return err_Code;
	}
	public void setErr_Code(String err_Code) {
		this.err_Code = err_Code;
	}
	
}
