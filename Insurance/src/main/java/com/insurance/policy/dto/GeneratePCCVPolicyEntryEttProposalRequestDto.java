package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeneratePCCVPolicyEntryEttProposalRequestDto {

	 @JsonProperty("ReferenceNo")
     private String ReferenceNo;
     @JsonProperty("ProdCode")
     private String ProdCode;
     @JsonProperty("ProposalType")
     private String ProposalType;
     @JsonProperty("PolType")
     private String PolType;
     @JsonProperty("PolicyFromDt")
     private String PolicyFromDt;
     @JsonProperty("PolicyToDt")
     private String PolicyToDt;
     @JsonProperty("PolicyIssueDt")
     private String PolicyIssueDt;
     @JsonProperty("InsuredPrefix")
     private String InsuredPrefix;
     @JsonProperty("InsuredName")
     private String InsuredName;
     @JsonProperty("Gender")
     private String Gender;
     @JsonProperty("Address1")
     private String Address1;
     @JsonProperty("Address2")
     private String Address2;
     @JsonProperty("Address3")
     private String Address3;
     @JsonProperty("State")
     private String State;
     @JsonProperty("City")
     private String City;
     @JsonProperty("PinCode")
     private String PinCode;
     @JsonProperty("MobileNo")
     private String MobileNo;
     @JsonProperty("EmailID")
     private String EmailID;
     @JsonProperty("PanNo")
     private String PanNo;
     @JsonProperty("GSTNo")
     private String GSTNo;
     @JsonProperty("TelephoneNo")
     private String TelephoneNo;
     @JsonProperty("DateOfBirth")
     private String DateOfBirth;
     @JsonProperty("FaxNo")
     private String FaxNo;
     @JsonProperty("VehicleCategory")
     private String VehicleCategory;
     @JsonProperty("PCCVVehType")
     private String PCCVVehType;
     @JsonProperty("VehicleCode")
     private String VehicleCode;
     @JsonProperty("FirstRegDt")
     private String FirstRegDt;
     @JsonProperty("VehicleType")
     private String VehicleType;
     @JsonProperty("EngineNo")
     private String EngineNo;
     @JsonProperty("ChassisNo")
     private String ChassisNo;
     @JsonProperty("RegNo1")
     private String RegNo1;
     @JsonProperty("RegNo2")
     private String RegNo2;
     @JsonProperty("RegNo3")
     private String RegNo3;
     @JsonProperty("RegNo4")
     private String RegNo4;
     @JsonProperty("RTOCode")
     private String RTOCode;
     @JsonProperty("IDV_of_Vehicle")
     private String IDV_of_Vehicle;
     @JsonProperty("Colour")
     private String Colour;
     @JsonProperty("PreviousInsurer")
     private String PreviousInsurer;
     @JsonProperty("PreviousPolicyNo")
     private String PreviousPolicyNo;
     @JsonProperty("PreviousPolicyFromDt")
     private String PreviousPolicyFromDt;
     @JsonProperty("PreviousPolicyToDt")
     private String PreviousPolicyToDt;
     @JsonProperty("PreviousPolicySI")
     private String PreviousPolicySI;
     @JsonProperty("PreviousPolicyClaimYN")
     private String PreviousPolicyClaimYN;
     @JsonProperty("PreviousPolicyUWYear")
     private String PreviousPolicyUWYear;
     @JsonProperty("PreviousPolicyNCBPerc")
     private Integer PreviousPolicyNCBPerc;
     @JsonProperty("PreviousPolicyType")
     private String PreviousPolicyType;
     @JsonProperty("NilDepreciationCoverYN")
     private String NilDepreciationCoverYN;
     @JsonProperty("PreviousNilDepreciation")
     private Integer PreviousNilDepreciation;
     @JsonProperty("PAOwnerDriverExclusion")
     private String PAOwnerDriverExclusion;
     @JsonProperty("PAOwnerDriverExReason")
     private String PAOwnerDriverExReason;
     @JsonProperty("NomineeNameforPAOwnerDriver")
     private String NomineeNameforPAOwnerDriver;
     @JsonProperty("NomineeAgeforPAOwnerDriver")
     private String NomineeAgeforPAOwnerDriver;
     @JsonProperty("NomineeRelationforPAOwnerDriver")
     private String NomineeRelationforPAOwnerDriver;
     @JsonProperty("AppointeeNameforPAOwnerDriver")
     private String AppointeeNameforPAOwnerDriver;
     @JsonProperty("AppointeeRelationforPAOwnerDriver")
     private String AppointeeRelationforPAOwnerDriver;
     @JsonProperty("ElectricalaccessYN")
     private String ElectricalaccessYN;
     @JsonProperty("ElectricalaccessSI")
     private String ElectricalaccessSI;
     @JsonProperty("ElectricalaccessRemarks")
     private String ElectricalaccessRemarks;
     @JsonProperty("NonElectricalaccessYN")
     private String NonElectricalaccessYN;
     @JsonProperty("NonElectricalaccessSI")
     private String NonElectricalaccessSI;
     @JsonProperty("NonElectricalaccessRemarks")
     private String NonElectricalaccessRemarks;
     @JsonProperty("PAPaidDriverConductorCleanerYN")
     private String PAPaidDriverConductorCleanerYN;
     @JsonProperty("PAPaidDriverConductorCleanerSI")
     private String PAPaidDriverConductorCleanerSI;
     @JsonProperty("PAPaidDriverCount")
     private String PAPaidDriverCount;
     @JsonProperty("PAPaidConductorCount")
     private String PAPaidConductorCount;
     @JsonProperty("PAPaidCleanerCount")
     private String PAPaidCleanerCount;
     @JsonProperty("SHRIMOTORPROTECTION_YN")
     private String SHRIMOOTORPROTECTION_YN;
     @JsonProperty("RSACover")
     private String RSACover;
     @JsonProperty("Bangladesh")
     private Integer Bangladesh;
     @JsonProperty("Bhutan")
     private Integer Bhutan;
     @JsonProperty("Srilanka")
     private Integer Srilanka;
     @JsonProperty("Nepal")
     private Integer Nepal;
     @JsonProperty("Pakistan")
     private Integer Pakistan;
     @JsonProperty("Maldives")
     private Integer Maldives;
     @JsonProperty("CNGKitYN")
     private Integer CNGKitYN;
     @JsonProperty("CNGKitSI")
     private Integer CNGKitSI;
     @JsonProperty("InBuiltCNGKit")
     private Integer InBuiltCNGKit;
     @JsonProperty("NoEmpCoverLL")
     private String NoEmpCoverLL;
     @JsonProperty("NoOfCleaner")
     private String NoOfCleaner;
     @JsonProperty("NoOfDriver")
     private String NoOfDriver;
     @JsonProperty("NoOfConductor")
     private String NoOfConductor;
     @JsonProperty("DeTariff")
     private String DeTariff;
     @JsonProperty("IMT23YN")
     private String IMT23YN;
     @JsonProperty("BreakIn")
     private String BreakIn;
     @JsonProperty("PreInspectionReportYN")
     private String PreInspectionReportYN;
     @JsonProperty("PreInspection")
     private String PreInspection;
     @JsonProperty("POSAgentName")
     private String POSAgentName;
     @JsonProperty("POSAgentPanNo")
     private String POSAgentPanNo;
     @JsonProperty("CoverNoteNo")
     private String CoverNoteNo;
     @JsonProperty("CoverNoteDt")
     private String CoverNoteDt;
     @JsonProperty("VoluntaryExcess")
     private String VoluntaryExcess;
     @JsonProperty("VehicleMadeinindiaYN")
     private String VehicleMadeinindiaYN;
     @JsonProperty("VehiclePurposeYN")
     private String VehiclePurposeYN;
     @JsonProperty("NFPP_Employees")
     private String NFPP_Employees;
     @JsonProperty("NFPP_OthThanEmp")
     private String NFPP_OthThanEmp;
     @JsonProperty("LimitOwnPremiseYN")
     private String LimitOwnPremiseYN;
     @JsonProperty("LimitedTPPDYN")
     private Integer LimitedTPPDYN;
     @JsonProperty("FitnessCertificateno")
     private String FitnessCertificateno;
     @JsonProperty("FitnessValidupto")
     private String FitnessValidupto;
     @JsonProperty("VehPermit")
     private String VehPermit;
     @JsonProperty("PermitNo")
     private String PermitNo;
     @JsonProperty("PAforUnnamedPassengerYN")
     private String PAforUnnamedPassengerYN;
     @JsonProperty("PAforUnnamedPassengerSI")
     private String PAforUnnamedPassengerSI;
     @JsonProperty("LLtoPaidDriverYN")
     private Integer LLtoPaidDriverYN;
     @JsonProperty("AntiTheftYN")
     private Integer AntiTheftYN;
     @JsonProperty("HypothecationType")
     private String HypothecationType;
     @JsonProperty("HypothecationBankName")
     private String HypothecationBankName;
     @JsonProperty("HypothecationAddress1")
     private String HypothecationAddress1;
     @JsonProperty("HypothecationAddress2")
     private String HypothecationAddress2;
     @JsonProperty("HypothecationAddress3")
     private String HypothecationAddress3;
     @JsonProperty("HypothecationAgreementNo")
     private String HypothecationAgreementNo;
     @JsonProperty("HypothecationCountry")
     private String HypothecationCountry;
     @JsonProperty("HypothecationState")
     private String HypothecationState;
     @JsonProperty("HypothecationCity")
     private String HypothecationCity;
     @JsonProperty("HypothecationPinCode")
     private String HypothecationPinCode;
     @JsonProperty("SpecifiedPersonField")
     private String SpecifiedPersonField;
     @JsonProperty("CKYC_NO")
     private String CKYC_NO;
     @JsonProperty("DOB")
     private String DOB;
     @JsonProperty("POI_Type")
     private String POI_Type;
     @JsonProperty("POI_ID")
     private String POI_ID;
     @JsonProperty("POA_Type")
     private String POA_Type;
     @JsonProperty("POA_ID")
     private String POA_ID;
     @JsonProperty("FatherName")
     private String FatherName;
     @JsonProperty("MotherName")
     private String MotherName;
     @JsonProperty("MaritalStatus")
     private String MaritalStatus;
     @JsonProperty("SpouseName")
     private String SpouseName;
     @JsonProperty("ResidentialStatus")
     private String ResidentialStatus;
     @JsonProperty("POI_DocumentFile")
     private String POI_DocumentFile;
     @JsonProperty("POA_DocumentFile")
     private String POA_DocumentFile;
     @JsonProperty("Insured_photo")
     private String Insured_photo;
     @JsonProperty("POI_DocumentExt")
     private String POI_DocumentExt;
     @JsonProperty("POA_DocumentExt")
     private String POA_DocumentExt;
     @JsonProperty("Insured_photoExt")
     private String Insured_photoExt;
     
     
     @JsonProperty("PHYSICALPOLICY")
     private String physical_policy;  // 1 means isko physical policy chahiye, and 0 means isko physical policy nhi chahiye 
     
     

 	public String getPhysical_policy() {
 		return physical_policy;
 	}

 	public void setPhysical_policy(String physical_policy) {
 		this.physical_policy = physical_policy;
 	}
     
	public GeneratePCCVPolicyEntryEttProposalRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GeneratePCCVPolicyEntryEttProposalRequestDto(String referenceNo, String prodCode, String proposalType,
			String polType, String policyFromDt, String policyToDt, String policyIssueDt, String insuredPrefix,
			String insuredName, String gender, String address1, String address2, String address3, String state,
			String city, String pinCode, String mobileNo, String emailID, String panNo, String gSTNo,
			String telephoneNo, String dateOfBirth, String faxNo, String vehicleCategory, String pCCVVehType,
			String vehicleCode, String firstRegDt, String vehicleType, String engineNo, String chassisNo, String regNo1,
			String regNo2, String regNo3, String regNo4, String rTOCode, String iDV_of_Vehicle, String colour,
			String previousInsurer, String previousPolicyNo, String previousPolicyFromDt, String previousPolicyToDt,
			String previousPolicySI, String previousPolicyClaimYN, String previousPolicyUWYear,
			Integer previousPolicyNCBPerc, String previousPolicyType, String nilDepreciationCoverYN,
			Integer previousNilDepreciation, String pAOwnerDriverExclusion, String pAOwnerDriverExReason,
			String nomineeNameforPAOwnerDriver, String nomineeAgeforPAOwnerDriver,
			String nomineeRelationforPAOwnerDriver, String appointeeNameforPAOwnerDriver,
			String appointeeRelationforPAOwnerDriver, String electricalaccessYN, String electricalaccessSI,
			String electricalaccessRemarks, String nonElectricalaccessYN, String nonElectricalaccessSI,
			String nonElectricalaccessRemarks, String pAPaidDriverConductorCleanerYN,
			String pAPaidDriverConductorCleanerSI, String pAPaidDriverCount, String pAPaidConductorCount,
			String pAPaidCleanerCount, String sHRIMOOTORPROTECTION_YN, String rSACover, Integer bangladesh,
			Integer bhutan, Integer srilanka, Integer nepal, Integer pakistan, Integer maldives, Integer cNGKitYN,
			Integer cNGKitSI, Integer inBuiltCNGKit, String noEmpCoverLL, String noOfCleaner, String noOfDriver,
			String noOfConductor, String deTariff, String iMT23YN, String breakIn, String preInspectionReportYN,
			String preInspection, String pOSAgentName, String pOSAgentPanNo, String coverNoteNo, String coverNoteDt,
			String voluntaryExcess, String vehicleMadeinindiaYN, String vehiclePurposeYN, String nFPP_Employees,
			String nFPP_OthThanEmp, String limitOwnPremiseYN, Integer limitedTPPDYN, String fitnessCertificateno,
			String fitnessValidupto, String vehPermit, String permitNo, String pAforUnnamedPassengerYN,
			String pAforUnnamedPassengerSI, Integer lLtoPaidDriverYN, Integer antiTheftYN, String hypothecationType,
			String hypothecationBankName, String hypothecationAddress1, String hypothecationAddress2,
			String hypothecationAddress3, String hypothecationAgreementNo, String hypothecationCountry,
			String hypothecationState, String hypothecationCity, String hypothecationPinCode,
			String specifiedPersonField, String cKYC_NO, String dOB, String pOI_Type, String pOI_ID, String pOA_Type,
			String pOA_ID, String fatherName, String motherName, String maritalStatus, String spouseName,
			String residentialStatus, String pOI_DocumentFile, String pOA_DocumentFile, String insured_photo,
			String pOI_DocumentExt, String pOA_DocumentExt, String insured_photoExt) {
		super();
		ReferenceNo = referenceNo;
		ProdCode = prodCode;
		ProposalType = proposalType;
		PolType = polType;
		PolicyFromDt = policyFromDt;
		PolicyToDt = policyToDt;
		PolicyIssueDt = policyIssueDt;
		InsuredPrefix = insuredPrefix;
		InsuredName = insuredName;
		Gender = gender;
		Address1 = address1;
		Address2 = address2;
		Address3 = address3;
		State = state;
		City = city;
		PinCode = pinCode;
		MobileNo = mobileNo;
		EmailID = emailID;
		PanNo = panNo;
		GSTNo = gSTNo;
		TelephoneNo = telephoneNo;
		DateOfBirth = dateOfBirth;
		FaxNo = faxNo;
		VehicleCategory = vehicleCategory;
		PCCVVehType = pCCVVehType;
		VehicleCode = vehicleCode;
		FirstRegDt = firstRegDt;
		VehicleType = vehicleType;
		EngineNo = engineNo;
		ChassisNo = chassisNo;
		RegNo1 = regNo1;
		RegNo2 = regNo2;
		RegNo3 = regNo3;
		RegNo4 = regNo4;
		RTOCode = rTOCode;
		IDV_of_Vehicle = iDV_of_Vehicle;
		Colour = colour;
		PreviousInsurer = previousInsurer;
		PreviousPolicyNo = previousPolicyNo;
		PreviousPolicyFromDt = previousPolicyFromDt;
		PreviousPolicyToDt = previousPolicyToDt;
		PreviousPolicySI = previousPolicySI;
		PreviousPolicyClaimYN = previousPolicyClaimYN;
		PreviousPolicyUWYear = previousPolicyUWYear;
		PreviousPolicyNCBPerc = previousPolicyNCBPerc;
		PreviousPolicyType = previousPolicyType;
		NilDepreciationCoverYN = nilDepreciationCoverYN;
		PreviousNilDepreciation = previousNilDepreciation;
		PAOwnerDriverExclusion = pAOwnerDriverExclusion;
		PAOwnerDriverExReason = pAOwnerDriverExReason;
		NomineeNameforPAOwnerDriver = nomineeNameforPAOwnerDriver;
		NomineeAgeforPAOwnerDriver = nomineeAgeforPAOwnerDriver;
		NomineeRelationforPAOwnerDriver = nomineeRelationforPAOwnerDriver;
		AppointeeNameforPAOwnerDriver = appointeeNameforPAOwnerDriver;
		AppointeeRelationforPAOwnerDriver = appointeeRelationforPAOwnerDriver;
		ElectricalaccessYN = electricalaccessYN;
		ElectricalaccessSI = electricalaccessSI;
		ElectricalaccessRemarks = electricalaccessRemarks;
		NonElectricalaccessYN = nonElectricalaccessYN;
		NonElectricalaccessSI = nonElectricalaccessSI;
		NonElectricalaccessRemarks = nonElectricalaccessRemarks;
		PAPaidDriverConductorCleanerYN = pAPaidDriverConductorCleanerYN;
		PAPaidDriverConductorCleanerSI = pAPaidDriverConductorCleanerSI;
		PAPaidDriverCount = pAPaidDriverCount;
		PAPaidConductorCount = pAPaidConductorCount;
		PAPaidCleanerCount = pAPaidCleanerCount;
		SHRIMOOTORPROTECTION_YN = sHRIMOOTORPROTECTION_YN;
		RSACover = rSACover;
		Bangladesh = bangladesh;
		Bhutan = bhutan;
		Srilanka = srilanka;
		Nepal = nepal;
		Pakistan = pakistan;
		Maldives = maldives;
		CNGKitYN = cNGKitYN;
		CNGKitSI = cNGKitSI;
		InBuiltCNGKit = inBuiltCNGKit;
		NoEmpCoverLL = noEmpCoverLL;
		NoOfCleaner = noOfCleaner;
		NoOfDriver = noOfDriver;
		NoOfConductor = noOfConductor;
		DeTariff = deTariff;
		IMT23YN = iMT23YN;
		BreakIn = breakIn;
		PreInspectionReportYN = preInspectionReportYN;
		PreInspection = preInspection;
		POSAgentName = pOSAgentName;
		POSAgentPanNo = pOSAgentPanNo;
		CoverNoteNo = coverNoteNo;
		CoverNoteDt = coverNoteDt;
		VoluntaryExcess = voluntaryExcess;
		VehicleMadeinindiaYN = vehicleMadeinindiaYN;
		VehiclePurposeYN = vehiclePurposeYN;
		NFPP_Employees = nFPP_Employees;
		NFPP_OthThanEmp = nFPP_OthThanEmp;
		LimitOwnPremiseYN = limitOwnPremiseYN;
		LimitedTPPDYN = limitedTPPDYN;
		FitnessCertificateno = fitnessCertificateno;
		FitnessValidupto = fitnessValidupto;
		VehPermit = vehPermit;
		PermitNo = permitNo;
		PAforUnnamedPassengerYN = pAforUnnamedPassengerYN;
		PAforUnnamedPassengerSI = pAforUnnamedPassengerSI;
		LLtoPaidDriverYN = lLtoPaidDriverYN;
		AntiTheftYN = antiTheftYN;
		HypothecationType = hypothecationType;
		HypothecationBankName = hypothecationBankName;
		HypothecationAddress1 = hypothecationAddress1;
		HypothecationAddress2 = hypothecationAddress2;
		HypothecationAddress3 = hypothecationAddress3;
		HypothecationAgreementNo = hypothecationAgreementNo;
		HypothecationCountry = hypothecationCountry;
		HypothecationState = hypothecationState;
		HypothecationCity = hypothecationCity;
		HypothecationPinCode = hypothecationPinCode;
		SpecifiedPersonField = specifiedPersonField;
		CKYC_NO = cKYC_NO;
		DOB = dOB;
		POI_Type = pOI_Type;
		POI_ID = pOI_ID;
		POA_Type = pOA_Type;
		POA_ID = pOA_ID;
		FatherName = fatherName;
		MotherName = motherName;
		MaritalStatus = maritalStatus;
		SpouseName = spouseName;
		ResidentialStatus = residentialStatus;
		POI_DocumentFile = pOI_DocumentFile;
		POA_DocumentFile = pOA_DocumentFile;
		Insured_photo = insured_photo;
		POI_DocumentExt = pOI_DocumentExt;
		POA_DocumentExt = pOA_DocumentExt;
		Insured_photoExt = insured_photoExt;
	}
	@Override
	public String toString() {
		return "GeneratePCCVPolicyEntryEttProposalRequestDto [ReferenceNo=" + ReferenceNo + ", ProdCode=" + ProdCode
				+ ", ProposalType=" + ProposalType + ", PolType=" + PolType + ", PolicyFromDt=" + PolicyFromDt
				+ ", PolicyToDt=" + PolicyToDt + ", PolicyIssueDt=" + PolicyIssueDt + ", InsuredPrefix=" + InsuredPrefix
				+ ", InsuredName=" + InsuredName + ", Gender=" + Gender + ", Address1=" + Address1 + ", Address2="
				+ Address2 + ", Address3=" + Address3 + ", State=" + State + ", City=" + City + ", PinCode=" + PinCode
				+ ", MobileNo=" + MobileNo + ", EmailID=" + EmailID + ", PanNo=" + PanNo + ", GSTNo=" + GSTNo
				+ ", TelephoneNo=" + TelephoneNo + ", DateOfBirth=" + DateOfBirth + ", FaxNo=" + FaxNo
				+ ", VehicleCategory=" + VehicleCategory + ", PCCVVehType=" + PCCVVehType + ", VehicleCode="
				+ VehicleCode + ", FirstRegDt=" + FirstRegDt + ", VehicleType=" + VehicleType + ", EngineNo=" + EngineNo
				+ ", ChassisNo=" + ChassisNo + ", RegNo1=" + RegNo1 + ", RegNo2=" + RegNo2 + ", RegNo3=" + RegNo3
				+ ", RegNo4=" + RegNo4 + ", RTOCode=" + RTOCode + ", IDV_of_Vehicle=" + IDV_of_Vehicle + ", Colour="
				+ Colour + ", PreviousInsurer=" + PreviousInsurer + ", PreviousPolicyNo=" + PreviousPolicyNo
				+ ", PreviousPolicyFromDt=" + PreviousPolicyFromDt + ", PreviousPolicyToDt=" + PreviousPolicyToDt
				+ ", PreviousPolicySI=" + PreviousPolicySI + ", PreviousPolicyClaimYN=" + PreviousPolicyClaimYN
				+ ", PreviousPolicyUWYear=" + PreviousPolicyUWYear + ", PreviousPolicyNCBPerc=" + PreviousPolicyNCBPerc
				+ ", PreviousPolicyType=" + PreviousPolicyType + ", NilDepreciationCoverYN=" + NilDepreciationCoverYN
				+ ", PreviousNilDepreciation=" + PreviousNilDepreciation + ", PAOwnerDriverExclusion="
				+ PAOwnerDriverExclusion + ", PAOwnerDriverExReason=" + PAOwnerDriverExReason
				+ ", NomineeNameforPAOwnerDriver=" + NomineeNameforPAOwnerDriver + ", NomineeAgeforPAOwnerDriver="
				+ NomineeAgeforPAOwnerDriver + ", NomineeRelationforPAOwnerDriver=" + NomineeRelationforPAOwnerDriver
				+ ", AppointeeNameforPAOwnerDriver=" + AppointeeNameforPAOwnerDriver
				+ ", AppointeeRelationforPAOwnerDriver=" + AppointeeRelationforPAOwnerDriver + ", ElectricalaccessYN="
				+ ElectricalaccessYN + ", ElectricalaccessSI=" + ElectricalaccessSI + ", ElectricalaccessRemarks="
				+ ElectricalaccessRemarks + ", NonElectricalaccessYN=" + NonElectricalaccessYN
				+ ", NonElectricalaccessSI=" + NonElectricalaccessSI + ", NonElectricalaccessRemarks="
				+ NonElectricalaccessRemarks + ", PAPaidDriverConductorCleanerYN=" + PAPaidDriverConductorCleanerYN
				+ ", PAPaidDriverConductorCleanerSI=" + PAPaidDriverConductorCleanerSI + ", PAPaidDriverCount="
				+ PAPaidDriverCount + ", PAPaidConductorCount=" + PAPaidConductorCount + ", PAPaidCleanerCount="
				+ PAPaidCleanerCount + ", SHRIMOOTORPROTECTION_YN=" + SHRIMOOTORPROTECTION_YN + ", RSACover=" + RSACover
				+ ", Bangladesh=" + Bangladesh + ", Bhutan=" + Bhutan + ", Srilanka=" + Srilanka + ", Nepal=" + Nepal
				+ ", Pakistan=" + Pakistan + ", Maldives=" + Maldives + ", CNGKitYN=" + CNGKitYN + ", CNGKitSI="
				+ CNGKitSI + ", InBuiltCNGKit=" + InBuiltCNGKit + ", NoEmpCoverLL=" + NoEmpCoverLL + ", NoOfCleaner="
				+ NoOfCleaner + ", NoOfDriver=" + NoOfDriver + ", NoOfConductor=" + NoOfConductor + ", DeTariff="
				+ DeTariff + ", IMT23YN=" + IMT23YN + ", BreakIn=" + BreakIn + ", PreInspectionReportYN="
				+ PreInspectionReportYN + ", PreInspection=" + PreInspection + ", POSAgentName=" + POSAgentName
				+ ", POSAgentPanNo=" + POSAgentPanNo + ", CoverNoteNo=" + CoverNoteNo + ", CoverNoteDt=" + CoverNoteDt
				+ ", VoluntaryExcess=" + VoluntaryExcess + ", VehicleMadeinindiaYN=" + VehicleMadeinindiaYN
				+ ", VehiclePurposeYN=" + VehiclePurposeYN + ", NFPP_Employees=" + NFPP_Employees + ", NFPP_OthThanEmp="
				+ NFPP_OthThanEmp + ", LimitOwnPremiseYN=" + LimitOwnPremiseYN + ", LimitedTPPDYN=" + LimitedTPPDYN
				+ ", FitnessCertificateno=" + FitnessCertificateno + ", FitnessValidupto=" + FitnessValidupto
				+ ", VehPermit=" + VehPermit + ", PermitNo=" + PermitNo + ", PAforUnnamedPassengerYN="
				+ PAforUnnamedPassengerYN + ", PAforUnnamedPassengerSI=" + PAforUnnamedPassengerSI
				+ ", LLtoPaidDriverYN=" + LLtoPaidDriverYN + ", AntiTheftYN=" + AntiTheftYN + ", HypothecationType="
				+ HypothecationType + ", HypothecationBankName=" + HypothecationBankName + ", HypothecationAddress1="
				+ HypothecationAddress1 + ", HypothecationAddress2=" + HypothecationAddress2
				+ ", HypothecationAddress3=" + HypothecationAddress3 + ", HypothecationAgreementNo="
				+ HypothecationAgreementNo + ", HypothecationCountry=" + HypothecationCountry + ", HypothecationState="
				+ HypothecationState + ", HypothecationCity=" + HypothecationCity + ", HypothecationPinCode="
				+ HypothecationPinCode + ", SpecifiedPersonField=" + SpecifiedPersonField + ", CKYC_NO=" + CKYC_NO
				+ ", DOB=" + DOB + ", POI_Type=" + POI_Type + ", POI_ID=" + POI_ID + ", POA_Type=" + POA_Type
				+ ", POA_ID=" + POA_ID + ", FatherName=" + FatherName + ", MotherName=" + MotherName
				+ ", MaritalStatus=" + MaritalStatus + ", SpouseName=" + SpouseName + ", ResidentialStatus="
				+ ResidentialStatus + ", POI_DocumentFile=" + POI_DocumentFile + ", POA_DocumentFile="
				+ POA_DocumentFile + ", Insured_photo=" + Insured_photo + ", POI_DocumentExt=" + POI_DocumentExt
				+ ", POA_DocumentExt=" + POA_DocumentExt + ", Insured_photoExt=" + Insured_photoExt + "]";
	}
	public String getReferenceNo() {
		return ReferenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		ReferenceNo = referenceNo;
	}
	public String getProdCode() {
		return ProdCode;
	}
	public void setProdCode(String prodCode) {
		ProdCode = prodCode;
	}
	public String getProposalType() {
		return ProposalType;
	}
	public void setProposalType(String proposalType) {
		ProposalType = proposalType;
	}
	public String getPolType() {
		return PolType;
	}
	public void setPolType(String polType) {
		PolType = polType;
	}
	public String getPolicyFromDt() {
		return PolicyFromDt;
	}
	public void setPolicyFromDt(String policyFromDt) {
		PolicyFromDt = policyFromDt;
	}
	public String getPolicyToDt() {
		return PolicyToDt;
	}
	public void setPolicyToDt(String policyToDt) {
		PolicyToDt = policyToDt;
	}
	public String getPolicyIssueDt() {
		return PolicyIssueDt;
	}
	public void setPolicyIssueDt(String policyIssueDt) {
		PolicyIssueDt = policyIssueDt;
	}
	public String getInsuredPrefix() {
		return InsuredPrefix;
	}
	public void setInsuredPrefix(String insuredPrefix) {
		InsuredPrefix = insuredPrefix;
	}
	public String getInsuredName() {
		return InsuredName;
	}
	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getAddress3() {
		return Address3;
	}
	public void setAddress3(String address3) {
		Address3 = address3;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPinCode() {
		return PinCode;
	}
	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getPanNo() {
		return PanNo;
	}
	public void setPanNo(String panNo) {
		PanNo = panNo;
	}
	public String getGSTNo() {
		return GSTNo;
	}
	public void setGSTNo(String gSTNo) {
		GSTNo = gSTNo;
	}
	public String getTelephoneNo() {
		return TelephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		TelephoneNo = telephoneNo;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getFaxNo() {
		return FaxNo;
	}
	public void setFaxNo(String faxNo) {
		FaxNo = faxNo;
	}
	public String getVehicleCategory() {
		return VehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		VehicleCategory = vehicleCategory;
	}
	public String getPCCVVehType() {
		return PCCVVehType;
	}
	public void setPCCVVehType(String pCCVVehType) {
		PCCVVehType = pCCVVehType;
	}
	public String getVehicleCode() {
		return VehicleCode;
	}
	public void setVehicleCode(String vehicleCode) {
		VehicleCode = vehicleCode;
	}
	public String getFirstRegDt() {
		return FirstRegDt;
	}
	public void setFirstRegDt(String firstRegDt) {
		FirstRegDt = firstRegDt;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public String getEngineNo() {
		return EngineNo;
	}
	public void setEngineNo(String engineNo) {
		EngineNo = engineNo;
	}
	public String getChassisNo() {
		return ChassisNo;
	}
	public void setChassisNo(String chassisNo) {
		ChassisNo = chassisNo;
	}
	public String getRegNo1() {
		return RegNo1;
	}
	public void setRegNo1(String regNo1) {
		RegNo1 = regNo1;
	}
	public String getRegNo2() {
		return RegNo2;
	}
	public void setRegNo2(String regNo2) {
		RegNo2 = regNo2;
	}
	public String getRegNo3() {
		return RegNo3;
	}
	public void setRegNo3(String regNo3) {
		RegNo3 = regNo3;
	}
	public String getRegNo4() {
		return RegNo4;
	}
	public void setRegNo4(String regNo4) {
		RegNo4 = regNo4;
	}
	public String getRTOCode() {
		return RTOCode;
	}
	public void setRTOCode(String rTOCode) {
		RTOCode = rTOCode;
	}
	public String getIDV_of_Vehicle() {
		return IDV_of_Vehicle;
	}
	public void setIDV_of_Vehicle(String iDV_of_Vehicle) {
		IDV_of_Vehicle = iDV_of_Vehicle;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public String getPreviousInsurer() {
		return PreviousInsurer;
	}
	public void setPreviousInsurer(String previousInsurer) {
		PreviousInsurer = previousInsurer;
	}
	public String getPreviousPolicyNo() {
		return PreviousPolicyNo;
	}
	public void setPreviousPolicyNo(String previousPolicyNo) {
		PreviousPolicyNo = previousPolicyNo;
	}
	public String getPreviousPolicyFromDt() {
		return PreviousPolicyFromDt;
	}
	public void setPreviousPolicyFromDt(String previousPolicyFromDt) {
		PreviousPolicyFromDt = previousPolicyFromDt;
	}
	public String getPreviousPolicyToDt() {
		return PreviousPolicyToDt;
	}
	public void setPreviousPolicyToDt(String previousPolicyToDt) {
		PreviousPolicyToDt = previousPolicyToDt;
	}
	public String getPreviousPolicySI() {
		return PreviousPolicySI;
	}
	public void setPreviousPolicySI(String previousPolicySI) {
		PreviousPolicySI = previousPolicySI;
	}
	public String getPreviousPolicyClaimYN() {
		return PreviousPolicyClaimYN;
	}
	public void setPreviousPolicyClaimYN(String previousPolicyClaimYN) {
		PreviousPolicyClaimYN = previousPolicyClaimYN;
	}
	public String getPreviousPolicyUWYear() {
		return PreviousPolicyUWYear;
	}
	public void setPreviousPolicyUWYear(String previousPolicyUWYear) {
		PreviousPolicyUWYear = previousPolicyUWYear;
	}
	public Integer getPreviousPolicyNCBPerc() {
		return PreviousPolicyNCBPerc;
	}
	public void setPreviousPolicyNCBPerc(Integer previousPolicyNCBPerc) {
		PreviousPolicyNCBPerc = previousPolicyNCBPerc;
	}
	public String getPreviousPolicyType() {
		return PreviousPolicyType;
	}
	public void setPreviousPolicyType(String previousPolicyType) {
		PreviousPolicyType = previousPolicyType;
	}
	public String getNilDepreciationCoverYN() {
		return NilDepreciationCoverYN;
	}
	public void setNilDepreciationCoverYN(String nilDepreciationCoverYN) {
		NilDepreciationCoverYN = nilDepreciationCoverYN;
	}
	public Integer getPreviousNilDepreciation() {
		return PreviousNilDepreciation;
	}
	public void setPreviousNilDepreciation(Integer previousNilDepreciation) {
		PreviousNilDepreciation = previousNilDepreciation;
	}
	public String getPAOwnerDriverExclusion() {
		return PAOwnerDriverExclusion;
	}
	public void setPAOwnerDriverExclusion(String pAOwnerDriverExclusion) {
		PAOwnerDriverExclusion = pAOwnerDriverExclusion;
	}
	public String getPAOwnerDriverExReason() {
		return PAOwnerDriverExReason;
	}
	public void setPAOwnerDriverExReason(String pAOwnerDriverExReason) {
		PAOwnerDriverExReason = pAOwnerDriverExReason;
	}
	public String getNomineeNameforPAOwnerDriver() {
		return NomineeNameforPAOwnerDriver;
	}
	public void setNomineeNameforPAOwnerDriver(String nomineeNameforPAOwnerDriver) {
		NomineeNameforPAOwnerDriver = nomineeNameforPAOwnerDriver;
	}
	public String getNomineeAgeforPAOwnerDriver() {
		return NomineeAgeforPAOwnerDriver;
	}
	public void setNomineeAgeforPAOwnerDriver(String nomineeAgeforPAOwnerDriver) {
		NomineeAgeforPAOwnerDriver = nomineeAgeforPAOwnerDriver;
	}
	public String getNomineeRelationforPAOwnerDriver() {
		return NomineeRelationforPAOwnerDriver;
	}
	public void setNomineeRelationforPAOwnerDriver(String nomineeRelationforPAOwnerDriver) {
		NomineeRelationforPAOwnerDriver = nomineeRelationforPAOwnerDriver;
	}
	public String getAppointeeNameforPAOwnerDriver() {
		return AppointeeNameforPAOwnerDriver;
	}
	public void setAppointeeNameforPAOwnerDriver(String appointeeNameforPAOwnerDriver) {
		AppointeeNameforPAOwnerDriver = appointeeNameforPAOwnerDriver;
	}
	public String getAppointeeRelationforPAOwnerDriver() {
		return AppointeeRelationforPAOwnerDriver;
	}
	public void setAppointeeRelationforPAOwnerDriver(String appointeeRelationforPAOwnerDriver) {
		AppointeeRelationforPAOwnerDriver = appointeeRelationforPAOwnerDriver;
	}
	public String getElectricalaccessYN() {
		return ElectricalaccessYN;
	}
	public void setElectricalaccessYN(String electricalaccessYN) {
		ElectricalaccessYN = electricalaccessYN;
	}
	public String getElectricalaccessSI() {
		return ElectricalaccessSI;
	}
	public void setElectricalaccessSI(String electricalaccessSI) {
		ElectricalaccessSI = electricalaccessSI;
	}
	public String getElectricalaccessRemarks() {
		return ElectricalaccessRemarks;
	}
	public void setElectricalaccessRemarks(String electricalaccessRemarks) {
		ElectricalaccessRemarks = electricalaccessRemarks;
	}
	public String getNonElectricalaccessYN() {
		return NonElectricalaccessYN;
	}
	public void setNonElectricalaccessYN(String nonElectricalaccessYN) {
		NonElectricalaccessYN = nonElectricalaccessYN;
	}
	public String getNonElectricalaccessSI() {
		return NonElectricalaccessSI;
	}
	public void setNonElectricalaccessSI(String nonElectricalaccessSI) {
		NonElectricalaccessSI = nonElectricalaccessSI;
	}
	public String getNonElectricalaccessRemarks() {
		return NonElectricalaccessRemarks;
	}
	public void setNonElectricalaccessRemarks(String nonElectricalaccessRemarks) {
		NonElectricalaccessRemarks = nonElectricalaccessRemarks;
	}
	public String getPAPaidDriverConductorCleanerYN() {
		return PAPaidDriverConductorCleanerYN;
	}
	public void setPAPaidDriverConductorCleanerYN(String pAPaidDriverConductorCleanerYN) {
		PAPaidDriverConductorCleanerYN = pAPaidDriverConductorCleanerYN;
	}
	public String getPAPaidDriverConductorCleanerSI() {
		return PAPaidDriverConductorCleanerSI;
	}
	public void setPAPaidDriverConductorCleanerSI(String pAPaidDriverConductorCleanerSI) {
		PAPaidDriverConductorCleanerSI = pAPaidDriverConductorCleanerSI;
	}
	public String getPAPaidDriverCount() {
		return PAPaidDriverCount;
	}
	public void setPAPaidDriverCount(String pAPaidDriverCount) {
		PAPaidDriverCount = pAPaidDriverCount;
	}
	public String getPAPaidConductorCount() {
		return PAPaidConductorCount;
	}
	public void setPAPaidConductorCount(String pAPaidConductorCount) {
		PAPaidConductorCount = pAPaidConductorCount;
	}
	public String getPAPaidCleanerCount() {
		return PAPaidCleanerCount;
	}
	public void setPAPaidCleanerCount(String pAPaidCleanerCount) {
		PAPaidCleanerCount = pAPaidCleanerCount;
	}
	public String getSHRIMOOTORPROTECTION_YN() {
		return SHRIMOOTORPROTECTION_YN;
	}
	public void setSHRIMOOTORPROTECTION_YN(String sHRIMOOTORPROTECTION_YN) {
		SHRIMOOTORPROTECTION_YN = sHRIMOOTORPROTECTION_YN;
	}
	public String getRSACover() {
		return RSACover;
	}
	public void setRSACover(String rSACover) {
		RSACover = rSACover;
	}
	public Integer getBangladesh() {
		return Bangladesh;
	}
	public void setBangladesh(Integer bangladesh) {
		Bangladesh = bangladesh;
	}
	public Integer getBhutan() {
		return Bhutan;
	}
	public void setBhutan(Integer bhutan) {
		Bhutan = bhutan;
	}
	public Integer getSrilanka() {
		return Srilanka;
	}
	public void setSrilanka(Integer srilanka) {
		Srilanka = srilanka;
	}
	public Integer getNepal() {
		return Nepal;
	}
	public void setNepal(Integer nepal) {
		Nepal = nepal;
	}
	public Integer getPakistan() {
		return Pakistan;
	}
	public void setPakistan(Integer pakistan) {
		Pakistan = pakistan;
	}
	public Integer getMaldives() {
		return Maldives;
	}
	public void setMaldives(Integer maldives) {
		Maldives = maldives;
	}
	public Integer getCNGKitYN() {
		return CNGKitYN;
	}
	public void setCNGKitYN(Integer cNGKitYN) {
		CNGKitYN = cNGKitYN;
	}
	public Integer getCNGKitSI() {
		return CNGKitSI;
	}
	public void setCNGKitSI(Integer cNGKitSI) {
		CNGKitSI = cNGKitSI;
	}
	public Integer getInBuiltCNGKit() {
		return InBuiltCNGKit;
	}
	public void setInBuiltCNGKit(Integer inBuiltCNGKit) {
		InBuiltCNGKit = inBuiltCNGKit;
	}
	public String getNoEmpCoverLL() {
		return NoEmpCoverLL;
	}
	public void setNoEmpCoverLL(String noEmpCoverLL) {
		NoEmpCoverLL = noEmpCoverLL;
	}
	public String getNoOfCleaner() {
		return NoOfCleaner;
	}
	public void setNoOfCleaner(String noOfCleaner) {
		NoOfCleaner = noOfCleaner;
	}
	public String getNoOfDriver() {
		return NoOfDriver;
	}
	public void setNoOfDriver(String noOfDriver) {
		NoOfDriver = noOfDriver;
	}
	public String getNoOfConductor() {
		return NoOfConductor;
	}
	public void setNoOfConductor(String noOfConductor) {
		NoOfConductor = noOfConductor;
	}
	public String getDeTariff() {
		return DeTariff;
	}
	public void setDeTariff(String deTariff) {
		DeTariff = deTariff;
	}
	public String getIMT23YN() {
		return IMT23YN;
	}
	public void setIMT23YN(String iMT23YN) {
		IMT23YN = iMT23YN;
	}
	public String getBreakIn() {
		return BreakIn;
	}
	public void setBreakIn(String breakIn) {
		BreakIn = breakIn;
	}
	public String getPreInspectionReportYN() {
		return PreInspectionReportYN;
	}
	public void setPreInspectionReportYN(String preInspectionReportYN) {
		PreInspectionReportYN = preInspectionReportYN;
	}
	public String getPreInspection() {
		return PreInspection;
	}
	public void setPreInspection(String preInspection) {
		PreInspection = preInspection;
	}
	public String getPOSAgentName() {
		return POSAgentName;
	}
	public void setPOSAgentName(String pOSAgentName) {
		POSAgentName = pOSAgentName;
	}
	public String getPOSAgentPanNo() {
		return POSAgentPanNo;
	}
	public void setPOSAgentPanNo(String pOSAgentPanNo) {
		POSAgentPanNo = pOSAgentPanNo;
	}
	public String getCoverNoteNo() {
		return CoverNoteNo;
	}
	public void setCoverNoteNo(String coverNoteNo) {
		CoverNoteNo = coverNoteNo;
	}
	public String getCoverNoteDt() {
		return CoverNoteDt;
	}
	public void setCoverNoteDt(String coverNoteDt) {
		CoverNoteDt = coverNoteDt;
	}
	public String getVoluntaryExcess() {
		return VoluntaryExcess;
	}
	public void setVoluntaryExcess(String voluntaryExcess) {
		VoluntaryExcess = voluntaryExcess;
	}
	public String getVehicleMadeinindiaYN() {
		return VehicleMadeinindiaYN;
	}
	public void setVehicleMadeinindiaYN(String vehicleMadeinindiaYN) {
		VehicleMadeinindiaYN = vehicleMadeinindiaYN;
	}
	public String getVehiclePurposeYN() {
		return VehiclePurposeYN;
	}
	public void setVehiclePurposeYN(String vehiclePurposeYN) {
		VehiclePurposeYN = vehiclePurposeYN;
	}
	public String getNFPP_Employees() {
		return NFPP_Employees;
	}
	public void setNFPP_Employees(String nFPP_Employees) {
		NFPP_Employees = nFPP_Employees;
	}
	public String getNFPP_OthThanEmp() {
		return NFPP_OthThanEmp;
	}
	public void setNFPP_OthThanEmp(String nFPP_OthThanEmp) {
		NFPP_OthThanEmp = nFPP_OthThanEmp;
	}
	public String getLimitOwnPremiseYN() {
		return LimitOwnPremiseYN;
	}
	public void setLimitOwnPremiseYN(String limitOwnPremiseYN) {
		LimitOwnPremiseYN = limitOwnPremiseYN;
	}
	public Integer getLimitedTPPDYN() {
		return LimitedTPPDYN;
	}
	public void setLimitedTPPDYN(Integer limitedTPPDYN) {
		LimitedTPPDYN = limitedTPPDYN;
	}
	public String getFitnessCertificateno() {
		return FitnessCertificateno;
	}
	public void setFitnessCertificateno(String fitnessCertificateno) {
		FitnessCertificateno = fitnessCertificateno;
	}
	public String getFitnessValidupto() {
		return FitnessValidupto;
	}
	public void setFitnessValidupto(String fitnessValidupto) {
		FitnessValidupto = fitnessValidupto;
	}
	public String getVehPermit() {
		return VehPermit;
	}
	public void setVehPermit(String vehPermit) {
		VehPermit = vehPermit;
	}
	public String getPermitNo() {
		return PermitNo;
	}
	public void setPermitNo(String permitNo) {
		PermitNo = permitNo;
	}
	public String getPAforUnnamedPassengerYN() {
		return PAforUnnamedPassengerYN;
	}
	public void setPAforUnnamedPassengerYN(String pAforUnnamedPassengerYN) {
		PAforUnnamedPassengerYN = pAforUnnamedPassengerYN;
	}
	public String getPAforUnnamedPassengerSI() {
		return PAforUnnamedPassengerSI;
	}
	public void setPAforUnnamedPassengerSI(String pAforUnnamedPassengerSI) {
		PAforUnnamedPassengerSI = pAforUnnamedPassengerSI;
	}
	public Integer getLLtoPaidDriverYN() {
		return LLtoPaidDriverYN;
	}
	public void setLLtoPaidDriverYN(Integer lLtoPaidDriverYN) {
		LLtoPaidDriverYN = lLtoPaidDriverYN;
	}
	public Integer getAntiTheftYN() {
		return AntiTheftYN;
	}
	public void setAntiTheftYN(Integer antiTheftYN) {
		AntiTheftYN = antiTheftYN;
	}
	public String getHypothecationType() {
		return HypothecationType;
	}
	public void setHypothecationType(String hypothecationType) {
		HypothecationType = hypothecationType;
	}
	public String getHypothecationBankName() {
		return HypothecationBankName;
	}
	public void setHypothecationBankName(String hypothecationBankName) {
		HypothecationBankName = hypothecationBankName;
	}
	public String getHypothecationAddress1() {
		return HypothecationAddress1;
	}
	public void setHypothecationAddress1(String hypothecationAddress1) {
		HypothecationAddress1 = hypothecationAddress1;
	}
	public String getHypothecationAddress2() {
		return HypothecationAddress2;
	}
	public void setHypothecationAddress2(String hypothecationAddress2) {
		HypothecationAddress2 = hypothecationAddress2;
	}
	public String getHypothecationAddress3() {
		return HypothecationAddress3;
	}
	public void setHypothecationAddress3(String hypothecationAddress3) {
		HypothecationAddress3 = hypothecationAddress3;
	}
	public String getHypothecationAgreementNo() {
		return HypothecationAgreementNo;
	}
	public void setHypothecationAgreementNo(String hypothecationAgreementNo) {
		HypothecationAgreementNo = hypothecationAgreementNo;
	}
	public String getHypothecationCountry() {
		return HypothecationCountry;
	}
	public void setHypothecationCountry(String hypothecationCountry) {
		HypothecationCountry = hypothecationCountry;
	}
	public String getHypothecationState() {
		return HypothecationState;
	}
	public void setHypothecationState(String hypothecationState) {
		HypothecationState = hypothecationState;
	}
	public String getHypothecationCity() {
		return HypothecationCity;
	}
	public void setHypothecationCity(String hypothecationCity) {
		HypothecationCity = hypothecationCity;
	}
	public String getHypothecationPinCode() {
		return HypothecationPinCode;
	}
	public void setHypothecationPinCode(String hypothecationPinCode) {
		HypothecationPinCode = hypothecationPinCode;
	}
	public String getSpecifiedPersonField() {
		return SpecifiedPersonField;
	}
	public void setSpecifiedPersonField(String specifiedPersonField) {
		SpecifiedPersonField = specifiedPersonField;
	}
	public String getCKYC_NO() {
		return CKYC_NO;
	}
	public void setCKYC_NO(String cKYC_NO) {
		CKYC_NO = cKYC_NO;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPOI_Type() {
		return POI_Type;
	}
	public void setPOI_Type(String pOI_Type) {
		POI_Type = pOI_Type;
	}
	public String getPOI_ID() {
		return POI_ID;
	}
	public void setPOI_ID(String pOI_ID) {
		POI_ID = pOI_ID;
	}
	public String getPOA_Type() {
		return POA_Type;
	}
	public void setPOA_Type(String pOA_Type) {
		POA_Type = pOA_Type;
	}
	public String getPOA_ID() {
		return POA_ID;
	}
	public void setPOA_ID(String pOA_ID) {
		POA_ID = pOA_ID;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getSpouseName() {
		return SpouseName;
	}
	public void setSpouseName(String spouseName) {
		SpouseName = spouseName;
	}
	public String getResidentialStatus() {
		return ResidentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		ResidentialStatus = residentialStatus;
	}
	public String getPOI_DocumentFile() {
		return POI_DocumentFile;
	}
	public void setPOI_DocumentFile(String pOI_DocumentFile) {
		POI_DocumentFile = pOI_DocumentFile;
	}
	public String getPOA_DocumentFile() {
		return POA_DocumentFile;
	}
	public void setPOA_DocumentFile(String pOA_DocumentFile) {
		POA_DocumentFile = pOA_DocumentFile;
	}
	public String getInsured_photo() {
		return Insured_photo;
	}
	public void setInsured_photo(String insured_photo) {
		Insured_photo = insured_photo;
	}
	public String getPOI_DocumentExt() {
		return POI_DocumentExt;
	}
	public void setPOI_DocumentExt(String pOI_DocumentExt) {
		POI_DocumentExt = pOI_DocumentExt;
	}
	public String getPOA_DocumentExt() {
		return POA_DocumentExt;
	}
	public void setPOA_DocumentExt(String pOA_DocumentExt) {
		POA_DocumentExt = pOA_DocumentExt;
	}
	public String getInsured_photoExt() {
		return Insured_photoExt;
	}
	public void setInsured_photoExt(String insured_photoExt) {
		Insured_photoExt = insured_photoExt;
	}
     
     
	
}
