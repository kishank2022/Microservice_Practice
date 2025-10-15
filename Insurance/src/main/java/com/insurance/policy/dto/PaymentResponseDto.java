package com.insurance.policy.dto;

public class PaymentResponseDto {

	private String result = "";
	private String ErrorMessage = "";
	private String SuccessMessage = "";
	private String ApprovePolNo = "";
	private String ApprovePolSysId = "";
	private String Err_Desc = "";
	private String Err_Code = "";
	private String PolicyScheduleURLResult = "";
	private String payStatus = "";
	
	/*
		payStatus = 0 = insufficient wallet balance
		payStatus = 1 = unable to debit the wallet, but wallet me balance hai 
		payStatus = 2 = unable to provide the comission in wallet, wallet debit hugaya but comission nhi de pa re hai
		payStatus = 3 = policy not approved, wallet me comission gaya but policy approve nhi huaa 
		payStatus = 4 = unable to generate receipt link , policy approve huaa but receipt generate nhi huaa
		
		payStatus = 5 = payment done higaa hai nad receipt link generate hui hai is proposal no. ki 
		payStatus = 10 = success, SUCCEss sab hogaya  
	*/
	
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public PaymentResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentResponseDto(String result, String errorMessage, String successMessage, String approvePolNo,
			String approvePolSysId, String err_Desc, String err_Code, String policyScheduleURLResult) {
		super();
		this.result = result;
		ErrorMessage = errorMessage;
		SuccessMessage = successMessage;
		ApprovePolNo = approvePolNo;
		ApprovePolSysId = approvePolSysId;
		Err_Desc = err_Desc;
		Err_Code = err_Code;
		PolicyScheduleURLResult = policyScheduleURLResult;
	}
	@Override
	public String toString() {
		return "PaymentResponseDto [result=" + result + ", ErrorMessage=" + ErrorMessage + ", SuccessMessage="
				+ SuccessMessage + ", ApprovePolNo=" + ApprovePolNo + ", ApprovePolSysId=" + ApprovePolSysId
				+ ", Err_Desc=" + Err_Desc + ", Err_Code=" + Err_Code + ", PolicyScheduleURLResult="
				+ PolicyScheduleURLResult + "]";
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getSuccessMessage() {
		return SuccessMessage;
	}
	public void setSuccessMessage(String successMessage) {
		SuccessMessage = successMessage;
	}
	public String getApprovePolNo() {
		return ApprovePolNo;
	}
	public void setApprovePolNo(String approvePolNo) {
		ApprovePolNo = approvePolNo;
	}
	public String getApprovePolSysId() {
		return ApprovePolSysId;
	}
	public void setApprovePolSysId(String approvePolSysId) {
		ApprovePolSysId = approvePolSysId;
	}
	public String getErr_Desc() {
		return Err_Desc;
	}
	public void setErr_Desc(String err_Desc) {
		Err_Desc = err_Desc;
	}
	public String getErr_Code() {
		return Err_Code;
	}
	public void setErr_Code(String err_Code) {
		Err_Code = err_Code;
	}
	public String getPolicyScheduleURLResult() {
		return PolicyScheduleURLResult;
	}
	public void setPolicyScheduleURLResult(String policyScheduleURLResult) {
		PolicyScheduleURLResult = policyScheduleURLResult;
	}

	
}
