package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRenewalDetailsResultRequestDto {

	@JsonProperty("EmailId")
	private String EmailId;
	@JsonProperty("MobileNo")
    private String MobileNo;
	@JsonProperty("PolicyNumber")
    private String PolicyNumber;
	@JsonProperty("VehicleRegno")
    private String VehicleRegno;
	public GetRenewalDetailsResultRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetRenewalDetailsResultRequestDto(String emailId, String mobileNo, String policyNumber,
			String vehicleRegno) {
		super();
		EmailId = emailId;
		MobileNo = mobileNo;
		PolicyNumber = policyNumber;
		VehicleRegno = vehicleRegno;
	}
	@Override
	public String toString() {
		return "GetRenewalDetailsResultRequestDto [EmailId=" + EmailId + ", MobileNo=" + MobileNo + ", PolicyNumber="
				+ PolicyNumber + ", VehicleRegno=" + VehicleRegno + "]";
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getVehicleRegno() {
		return VehicleRegno;
	}
	public void setVehicleRegno(String vehicleRegno) {
		VehicleRegno = vehicleRegno;
	}
	
	
}
