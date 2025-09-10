package com.insurance.policy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateTwoWheelerProposalPolicyEntryEttRequestDto {

	@JsonProperty("ReferenceNo")
    private String ReferenceNo;
    @JsonProperty("ProdCode")
    private String ProdCode;
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
    @JsonProperty("PanNo")
    private String PanNo;
    @JsonProperty("GSTNo")
    private String GSTNo;
    @JsonProperty("TelephoneNo")
    private String TelephoneNo;
    @JsonProperty("ProposalType")
    private String ProposalType;
    @JsonProperty("PolicyType")
    private String PolicyType;
    @JsonProperty("DateOfBirth")
    private String DateOfBirth;
    @JsonProperty("MobileNo")
    private String MobileNo;
    @JsonProperty("FaxNo")
    private String FaxNo;
    @JsonProperty("EmailID")
    private String EmailID;
    @JsonProperty("POSAgentName")
    private String POSAgentName;
    @JsonProperty("POSAgentPanNo")
    private String POSAgentPanNo;
    @JsonProperty("CoverNoteNo")
    private String CoverNoteNo;
    @JsonProperty("CoverNoteDt")
    private String CoverNoteDt;
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
    @JsonProperty("VoluntaryExcess")
    private String VoluntaryExcess;
    @JsonProperty("NoEmpCoverLL")
    private String NoEmpCoverLL;
    @JsonProperty("NoOfCleaner")
    private String NoOfCleaner;
    @JsonProperty("NoOfDriver")
    private String NoOfDriver;
    @JsonProperty("NoOfConductor")
    private String NoOfConductor;
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
    @JsonProperty("Bangladesh")
    private String Bangladesh;
    @JsonProperty("Bhutan")
    private String Bhutan;
    @JsonProperty("SriLanka")
    private String SriLanka;
    @JsonProperty("Nepal")
    private String Nepal;
    @JsonProperty("Pakistan")
    private String Pakistan;
    @JsonProperty("Maldives")
    private String Maldives;
    @JsonProperty("CNGKitYN")
    private Integer CNGKitYN;
    @JsonProperty("CNGKitSI")
    private Integer CNGKitSI;
    @JsonProperty("InBuiltCNGKit")
    private Integer InBuiltCNGKit;
    @JsonProperty("LimitedTPPDYN")
    private String LimitedTPPDYN;
    @JsonProperty("DeTariff")
    private Integer DeTariff;
    @JsonProperty("IMT23YN")
    private String IMT23YN;
    @JsonProperty("BreakIn")
    private String BreakIn;
    @JsonProperty("PreInspectionReportYN")
    private String PreInspectionReportYN;
    @JsonProperty("PreInspection")
    private String PreInspection;
    @JsonProperty("FitnessCertificateno")
    private String FitnessCertificateno;
    @JsonProperty("FitnessValidupto")
    private String FitnessValidupto;
    @JsonProperty("VehPermit")
    private String VehPermit;
    @JsonProperty("PermitNo")
    private String PermitNo;
    @JsonProperty("PAforUnnamedPassengerYN")
    private Integer PAforUnnamedPassengerYN;
    @JsonProperty("PAforUnnamedPassengerSI")
    private Integer PAforUnnamedPassengerSI;
    @JsonProperty("ElectricalaccessYN")
    private Integer ElectricalaccessYN;
    @JsonProperty("ElectricalaccessSI")
    private Integer ElectricalaccessSI;
    @JsonProperty("ElectricalaccessRemarks")
    private String ElectricalaccessRemarks;
    @JsonProperty("NonElectricalaccessYN")
    private Integer NonElectricalaccessYN;
    @JsonProperty("NonElectricalaccessSI")
    private Integer NonElectricalaccessSI;
    @JsonProperty("NonElectricalaccessRemarks")
    private String NonElectricalaccessRemarks;
    @JsonProperty("PAPaidDriverConductorCleanerYN")
    private Integer PAPaidDriverConductorCleanerYN;
    @JsonProperty("PAPaidDriverConductorCleanerSI")
    private Integer PAPaidDriverConductorCleanerSI;
    @JsonProperty("PAPaidDriverCount")
    private String PAPaidDriverCount;
    @JsonProperty("PAPaidConductorCount")
    private String PAPaidConductorCount;
    @JsonProperty("PAPaidCleanerCount")
    private String PAPaidCleanerCount;
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
    @JsonProperty("LLtoPaidDriverYN")
    private String LLtoPaidDriverYN;
    @JsonProperty("AntiTheftYN")
    private Integer AntiTheftYN;
    @JsonProperty("PreviousPolicyNo")
    private String PreviousPolicyNo;
    @JsonProperty("PreviousInsurer")
    private String PreviousInsurer;
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
    private String PreviousPolicyNCBPerc;
    @JsonProperty("PreviousPolicyType")
    private String PreviousPolicyType;
    @JsonProperty("NilDepreciationCoverYN")
    private String NilDepreciationCoverYN;
    @JsonProperty("PreviousNilDepreciation")
    private String PreviousNilDepreciation;
    @JsonProperty("RSACover")
    private String RSACover;
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
    @JsonProperty("PAOwnerDriverExclusion")
    private String PAOwnerDriverExclusion;
    @JsonProperty("PAOwnerDriverExReason")
    private String PAOwnerDriverExReason;
    @JsonProperty("CPAInsComp")
    private String CPAInsComp;
    @JsonProperty("CPAPolicyFmDt")
    private String CPAPolicyFmDt;
    @JsonProperty("CPAPolicyNo")
    private String CPAPolicyNo;
    @JsonProperty("CPAPolicyToDt")
    private String CPAPolicyToDt;
    @JsonProperty("CPASumInsured")
    private String CPASumInsured;
    @JsonProperty("Consumables")
    private String Consumables;
    @JsonProperty("EmergencyTranHotelExpRemYN")
    private String EmergencyTranHotelExpRemYN;
    @JsonProperty("Eng_Protector")
    private String Eng_Protector;
    @JsonProperty("KeyReplacementYN")
    private String KeyReplacementYN;
    @JsonProperty("DailyExpRemYN")
    private String DailyExpRemYN;
    @JsonProperty("tpPolAddr")
    private String tpPolAddr;
    @JsonProperty("tpPolComp")
    private String tpPolComp;
    @JsonProperty("tpPolFmdt")
    private String tpPolFmdt;
    @JsonProperty("tpPolNo")
    private String tpPolNo;
    @JsonProperty("tpPolTodt")
    private String tpPolTodt;
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
	public GenerateTwoWheelerProposalPolicyEntryEttRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GenerateTwoWheelerProposalPolicyEntryEttRequestDto(String referenceNo, String prodCode, String policyFromDt,
			String policyToDt, String policyIssueDt, String insuredPrefix, String insuredName, String gender,
			String address1, String address2, String address3, String state, String city, String pinCode, String panNo,
			String gSTNo, String telephoneNo, String proposalType, String policyType, String dateOfBirth,
			String mobileNo, String faxNo, String emailID, String pOSAgentName, String pOSAgentPanNo,
			String coverNoteNo, String coverNoteDt, String vehicleCode, String firstRegDt, String vehicleType,
			String engineNo, String chassisNo, String regNo1, String regNo2, String regNo3, String regNo4,
			String rTOCode, String iDV_of_Vehicle, String colour, String voluntaryExcess, String noEmpCoverLL,
			String noOfCleaner, String noOfDriver, String noOfConductor, String vehicleMadeinindiaYN,
			String vehiclePurposeYN, String nFPP_Employees, String nFPP_OthThanEmp, String limitOwnPremiseYN,
			String bangladesh, String bhutan, String sriLanka, String nepal, String pakistan, String maldives,
			Integer cNGKitYN, Integer cNGKitSI, Integer inBuiltCNGKit, String limitedTPPDYN, Integer deTariff,
			String iMT23YN, String breakIn, String preInspectionReportYN, String preInspection,
			String fitnessCertificateno, String fitnessValidupto, String vehPermit, String permitNo,
			Integer pAforUnnamedPassengerYN, Integer pAforUnnamedPassengerSI, Integer electricalaccessYN,
			Integer electricalaccessSI, String electricalaccessRemarks, Integer nonElectricalaccessYN,
			Integer nonElectricalaccessSI, String nonElectricalaccessRemarks, Integer pAPaidDriverConductorCleanerYN,
			Integer pAPaidDriverConductorCleanerSI, String pAPaidDriverCount, String pAPaidConductorCount,
			String pAPaidCleanerCount, String nomineeNameforPAOwnerDriver, String nomineeAgeforPAOwnerDriver,
			String nomineeRelationforPAOwnerDriver, String appointeeNameforPAOwnerDriver,
			String appointeeRelationforPAOwnerDriver, String lLtoPaidDriverYN, Integer antiTheftYN,
			String previousPolicyNo, String previousInsurer, String previousPolicyFromDt, String previousPolicyToDt,
			String previousPolicySI, String previousPolicyClaimYN, String previousPolicyUWYear,
			String previousPolicyNCBPerc, String previousPolicyType, String nilDepreciationCoverYN,
			String previousNilDepreciation, String rSACover, String hypothecationType, String hypothecationBankName,
			String hypothecationAddress1, String hypothecationAddress2, String hypothecationAddress3,
			String hypothecationAgreementNo, String hypothecationCountry, String hypothecationState,
			String hypothecationCity, String hypothecationPinCode, String specifiedPersonField,
			String pAOwnerDriverExclusion, String pAOwnerDriverExReason, String cPAInsComp, String cPAPolicyFmDt,
			String cPAPolicyNo, String cPAPolicyToDt, String cPASumInsured, String consumables,
			String emergencyTranHotelExpRemYN, String eng_Protector, String keyReplacementYN, String dailyExpRemYN,
			String tpPolAddr, String tpPolComp, String tpPolFmdt, String tpPolNo, String tpPolTodt, String cKYC_NO,
			String dOB, String pOI_Type, String pOI_ID, String pOA_Type, String pOA_ID, String fatherName,
			String motherName, String maritalStatus, String spouseName, String residentialStatus,
			String pOI_DocumentFile, String pOA_DocumentFile, String insured_photo, String pOI_DocumentExt,
			String pOA_DocumentExt, String insured_photoExt) {
		super();
		ReferenceNo = referenceNo;
		ProdCode = prodCode;
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
		PanNo = panNo;
		GSTNo = gSTNo;
		TelephoneNo = telephoneNo;
		ProposalType = proposalType;
		PolicyType = policyType;
		DateOfBirth = dateOfBirth;
		MobileNo = mobileNo;
		FaxNo = faxNo;
		EmailID = emailID;
		POSAgentName = pOSAgentName;
		POSAgentPanNo = pOSAgentPanNo;
		CoverNoteNo = coverNoteNo;
		CoverNoteDt = coverNoteDt;
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
		VoluntaryExcess = voluntaryExcess;
		NoEmpCoverLL = noEmpCoverLL;
		NoOfCleaner = noOfCleaner;
		NoOfDriver = noOfDriver;
		NoOfConductor = noOfConductor;
		VehicleMadeinindiaYN = vehicleMadeinindiaYN;
		VehiclePurposeYN = vehiclePurposeYN;
		NFPP_Employees = nFPP_Employees;
		NFPP_OthThanEmp = nFPP_OthThanEmp;
		LimitOwnPremiseYN = limitOwnPremiseYN;
		Bangladesh = bangladesh;
		Bhutan = bhutan;
		SriLanka = sriLanka;
		Nepal = nepal;
		Pakistan = pakistan;
		Maldives = maldives;
		CNGKitYN = cNGKitYN;
		CNGKitSI = cNGKitSI;
		InBuiltCNGKit = inBuiltCNGKit;
		LimitedTPPDYN = limitedTPPDYN;
		DeTariff = deTariff;
		IMT23YN = iMT23YN;
		BreakIn = breakIn;
		PreInspectionReportYN = preInspectionReportYN;
		PreInspection = preInspection;
		FitnessCertificateno = fitnessCertificateno;
		FitnessValidupto = fitnessValidupto;
		VehPermit = vehPermit;
		PermitNo = permitNo;
		PAforUnnamedPassengerYN = pAforUnnamedPassengerYN;
		PAforUnnamedPassengerSI = pAforUnnamedPassengerSI;
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
		NomineeNameforPAOwnerDriver = nomineeNameforPAOwnerDriver;
		NomineeAgeforPAOwnerDriver = nomineeAgeforPAOwnerDriver;
		NomineeRelationforPAOwnerDriver = nomineeRelationforPAOwnerDriver;
		AppointeeNameforPAOwnerDriver = appointeeNameforPAOwnerDriver;
		AppointeeRelationforPAOwnerDriver = appointeeRelationforPAOwnerDriver;
		LLtoPaidDriverYN = lLtoPaidDriverYN;
		AntiTheftYN = antiTheftYN;
		PreviousPolicyNo = previousPolicyNo;
		PreviousInsurer = previousInsurer;
		PreviousPolicyFromDt = previousPolicyFromDt;
		PreviousPolicyToDt = previousPolicyToDt;
		PreviousPolicySI = previousPolicySI;
		PreviousPolicyClaimYN = previousPolicyClaimYN;
		PreviousPolicyUWYear = previousPolicyUWYear;
		PreviousPolicyNCBPerc = previousPolicyNCBPerc;
		PreviousPolicyType = previousPolicyType;
		NilDepreciationCoverYN = nilDepreciationCoverYN;
		PreviousNilDepreciation = previousNilDepreciation;
		RSACover = rSACover;
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
		PAOwnerDriverExclusion = pAOwnerDriverExclusion;
		PAOwnerDriverExReason = pAOwnerDriverExReason;
		CPAInsComp = cPAInsComp;
		CPAPolicyFmDt = cPAPolicyFmDt;
		CPAPolicyNo = cPAPolicyNo;
		CPAPolicyToDt = cPAPolicyToDt;
		CPASumInsured = cPASumInsured;
		Consumables = consumables;
		EmergencyTranHotelExpRemYN = emergencyTranHotelExpRemYN;
		Eng_Protector = eng_Protector;
		KeyReplacementYN = keyReplacementYN;
		DailyExpRemYN = dailyExpRemYN;
		this.tpPolAddr = tpPolAddr;
		this.tpPolComp = tpPolComp;
		this.tpPolFmdt = tpPolFmdt;
		this.tpPolNo = tpPolNo;
		this.tpPolTodt = tpPolTodt;
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
		return "GenerateTwoWheelerProposalPolicyEntryEttRequestDto [ReferenceNo=" + ReferenceNo + ", ProdCode="
				+ ProdCode + ", PolicyFromDt=" + PolicyFromDt + ", PolicyToDt=" + PolicyToDt + ", PolicyIssueDt="
				+ PolicyIssueDt + ", InsuredPrefix=" + InsuredPrefix + ", InsuredName=" + InsuredName + ", Gender="
				+ Gender + ", Address1=" + Address1 + ", Address2=" + Address2 + ", Address3=" + Address3 + ", State="
				+ State + ", City=" + City + ", PinCode=" + PinCode + ", PanNo=" + PanNo + ", GSTNo=" + GSTNo
				+ ", TelephoneNo=" + TelephoneNo + ", ProposalType=" + ProposalType + ", PolicyType=" + PolicyType
				+ ", DateOfBirth=" + DateOfBirth + ", MobileNo=" + MobileNo + ", FaxNo=" + FaxNo + ", EmailID="
				+ EmailID + ", POSAgentName=" + POSAgentName + ", POSAgentPanNo=" + POSAgentPanNo + ", CoverNoteNo="
				+ CoverNoteNo + ", CoverNoteDt=" + CoverNoteDt + ", VehicleCode=" + VehicleCode + ", FirstRegDt="
				+ FirstRegDt + ", VehicleType=" + VehicleType + ", EngineNo=" + EngineNo + ", ChassisNo=" + ChassisNo
				+ ", RegNo1=" + RegNo1 + ", RegNo2=" + RegNo2 + ", RegNo3=" + RegNo3 + ", RegNo4=" + RegNo4
				+ ", RTOCode=" + RTOCode + ", IDV_of_Vehicle=" + IDV_of_Vehicle + ", Colour=" + Colour
				+ ", VoluntaryExcess=" + VoluntaryExcess + ", NoEmpCoverLL=" + NoEmpCoverLL + ", NoOfCleaner="
				+ NoOfCleaner + ", NoOfDriver=" + NoOfDriver + ", NoOfConductor=" + NoOfConductor
				+ ", VehicleMadeinindiaYN=" + VehicleMadeinindiaYN + ", VehiclePurposeYN=" + VehiclePurposeYN
				+ ", NFPP_Employees=" + NFPP_Employees + ", NFPP_OthThanEmp=" + NFPP_OthThanEmp + ", LimitOwnPremiseYN="
				+ LimitOwnPremiseYN + ", Bangladesh=" + Bangladesh + ", Bhutan=" + Bhutan + ", SriLanka=" + SriLanka
				+ ", Nepal=" + Nepal + ", Pakistan=" + Pakistan + ", Maldives=" + Maldives + ", CNGKitYN=" + CNGKitYN
				+ ", CNGKitSI=" + CNGKitSI + ", InBuiltCNGKit=" + InBuiltCNGKit + ", LimitedTPPDYN=" + LimitedTPPDYN
				+ ", DeTariff=" + DeTariff + ", IMT23YN=" + IMT23YN + ", BreakIn=" + BreakIn
				+ ", PreInspectionReportYN=" + PreInspectionReportYN + ", PreInspection=" + PreInspection
				+ ", FitnessCertificateno=" + FitnessCertificateno + ", FitnessValidupto=" + FitnessValidupto
				+ ", VehPermit=" + VehPermit + ", PermitNo=" + PermitNo + ", PAforUnnamedPassengerYN="
				+ PAforUnnamedPassengerYN + ", PAforUnnamedPassengerSI=" + PAforUnnamedPassengerSI
				+ ", ElectricalaccessYN=" + ElectricalaccessYN + ", ElectricalaccessSI=" + ElectricalaccessSI
				+ ", ElectricalaccessRemarks=" + ElectricalaccessRemarks + ", NonElectricalaccessYN="
				+ NonElectricalaccessYN + ", NonElectricalaccessSI=" + NonElectricalaccessSI
				+ ", NonElectricalaccessRemarks=" + NonElectricalaccessRemarks + ", PAPaidDriverConductorCleanerYN="
				+ PAPaidDriverConductorCleanerYN + ", PAPaidDriverConductorCleanerSI=" + PAPaidDriverConductorCleanerSI
				+ ", PAPaidDriverCount=" + PAPaidDriverCount + ", PAPaidConductorCount=" + PAPaidConductorCount
				+ ", PAPaidCleanerCount=" + PAPaidCleanerCount + ", NomineeNameforPAOwnerDriver="
				+ NomineeNameforPAOwnerDriver + ", NomineeAgeforPAOwnerDriver=" + NomineeAgeforPAOwnerDriver
				+ ", NomineeRelationforPAOwnerDriver=" + NomineeRelationforPAOwnerDriver
				+ ", AppointeeNameforPAOwnerDriver=" + AppointeeNameforPAOwnerDriver
				+ ", AppointeeRelationforPAOwnerDriver=" + AppointeeRelationforPAOwnerDriver + ", LLtoPaidDriverYN="
				+ LLtoPaidDriverYN + ", AntiTheftYN=" + AntiTheftYN + ", PreviousPolicyNo=" + PreviousPolicyNo
				+ ", PreviousInsurer=" + PreviousInsurer + ", PreviousPolicyFromDt=" + PreviousPolicyFromDt
				+ ", PreviousPolicyToDt=" + PreviousPolicyToDt + ", PreviousPolicySI=" + PreviousPolicySI
				+ ", PreviousPolicyClaimYN=" + PreviousPolicyClaimYN + ", PreviousPolicyUWYear=" + PreviousPolicyUWYear
				+ ", PreviousPolicyNCBPerc=" + PreviousPolicyNCBPerc + ", PreviousPolicyType=" + PreviousPolicyType
				+ ", NilDepreciationCoverYN=" + NilDepreciationCoverYN + ", PreviousNilDepreciation="
				+ PreviousNilDepreciation + ", RSACover=" + RSACover + ", HypothecationType=" + HypothecationType
				+ ", HypothecationBankName=" + HypothecationBankName + ", HypothecationAddress1="
				+ HypothecationAddress1 + ", HypothecationAddress2=" + HypothecationAddress2
				+ ", HypothecationAddress3=" + HypothecationAddress3 + ", HypothecationAgreementNo="
				+ HypothecationAgreementNo + ", HypothecationCountry=" + HypothecationCountry + ", HypothecationState="
				+ HypothecationState + ", HypothecationCity=" + HypothecationCity + ", HypothecationPinCode="
				+ HypothecationPinCode + ", SpecifiedPersonField=" + SpecifiedPersonField + ", PAOwnerDriverExclusion="
				+ PAOwnerDriverExclusion + ", PAOwnerDriverExReason=" + PAOwnerDriverExReason + ", CPAInsComp="
				+ CPAInsComp + ", CPAPolicyFmDt=" + CPAPolicyFmDt + ", CPAPolicyNo=" + CPAPolicyNo + ", CPAPolicyToDt="
				+ CPAPolicyToDt + ", CPASumInsured=" + CPASumInsured + ", Consumables=" + Consumables
				+ ", EmergencyTranHotelExpRemYN=" + EmergencyTranHotelExpRemYN + ", Eng_Protector=" + Eng_Protector
				+ ", KeyReplacementYN=" + KeyReplacementYN + ", DailyExpRemYN=" + DailyExpRemYN + ", tpPolAddr="
				+ tpPolAddr + ", tpPolComp=" + tpPolComp + ", tpPolFmdt=" + tpPolFmdt + ", tpPolNo=" + tpPolNo
				+ ", tpPolTodt=" + tpPolTodt + ", CKYC_NO=" + CKYC_NO + ", DOB=" + DOB + ", POI_Type=" + POI_Type
				+ ", POI_ID=" + POI_ID + ", POA_Type=" + POA_Type + ", POA_ID=" + POA_ID + ", FatherName=" + FatherName
				+ ", MotherName=" + MotherName + ", MaritalStatus=" + MaritalStatus + ", SpouseName=" + SpouseName
				+ ", ResidentialStatus=" + ResidentialStatus + ", POI_DocumentFile=" + POI_DocumentFile
				+ ", POA_DocumentFile=" + POA_DocumentFile + ", Insured_photo=" + Insured_photo + ", POI_DocumentExt="
				+ POI_DocumentExt + ", POA_DocumentExt=" + POA_DocumentExt + ", Insured_photoExt=" + Insured_photoExt
				+ "]";
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
	public String getProposalType() {
		return ProposalType;
	}
	public void setProposalType(String proposalType) {
		ProposalType = proposalType;
	}
	public String getPolicyType() {
		return PolicyType;
	}
	public void setPolicyType(String policyType) {
		PolicyType = policyType;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getFaxNo() {
		return FaxNo;
	}
	public void setFaxNo(String faxNo) {
		FaxNo = faxNo;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
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
	public String getVoluntaryExcess() {
		return VoluntaryExcess;
	}
	public void setVoluntaryExcess(String voluntaryExcess) {
		VoluntaryExcess = voluntaryExcess;
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
	public String getBangladesh() {
		return Bangladesh;
	}
	public void setBangladesh(String bangladesh) {
		Bangladesh = bangladesh;
	}
	public String getBhutan() {
		return Bhutan;
	}
	public void setBhutan(String bhutan) {
		Bhutan = bhutan;
	}
	public String getSriLanka() {
		return SriLanka;
	}
	public void setSriLanka(String sriLanka) {
		SriLanka = sriLanka;
	}
	public String getNepal() {
		return Nepal;
	}
	public void setNepal(String nepal) {
		Nepal = nepal;
	}
	public String getPakistan() {
		return Pakistan;
	}
	public void setPakistan(String pakistan) {
		Pakistan = pakistan;
	}
	public String getMaldives() {
		return Maldives;
	}
	public void setMaldives(String maldives) {
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
	public String getLimitedTPPDYN() {
		return LimitedTPPDYN;
	}
	public void setLimitedTPPDYN(String limitedTPPDYN) {
		LimitedTPPDYN = limitedTPPDYN;
	}
	public Integer getDeTariff() {
		return DeTariff;
	}
	public void setDeTariff(Integer deTariff) {
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
	public Integer getPAforUnnamedPassengerYN() {
		return PAforUnnamedPassengerYN;
	}
	public void setPAforUnnamedPassengerYN(Integer pAforUnnamedPassengerYN) {
		PAforUnnamedPassengerYN = pAforUnnamedPassengerYN;
	}
	public Integer getPAforUnnamedPassengerSI() {
		return PAforUnnamedPassengerSI;
	}
	public void setPAforUnnamedPassengerSI(Integer pAforUnnamedPassengerSI) {
		PAforUnnamedPassengerSI = pAforUnnamedPassengerSI;
	}
	public Integer getElectricalaccessYN() {
		return ElectricalaccessYN;
	}
	public void setElectricalaccessYN(Integer electricalaccessYN) {
		ElectricalaccessYN = electricalaccessYN;
	}
	public Integer getElectricalaccessSI() {
		return ElectricalaccessSI;
	}
	public void setElectricalaccessSI(Integer electricalaccessSI) {
		ElectricalaccessSI = electricalaccessSI;
	}
	public String getElectricalaccessRemarks() {
		return ElectricalaccessRemarks;
	}
	public void setElectricalaccessRemarks(String electricalaccessRemarks) {
		ElectricalaccessRemarks = electricalaccessRemarks;
	}
	public Integer getNonElectricalaccessYN() {
		return NonElectricalaccessYN;
	}
	public void setNonElectricalaccessYN(Integer nonElectricalaccessYN) {
		NonElectricalaccessYN = nonElectricalaccessYN;
	}
	public Integer getNonElectricalaccessSI() {
		return NonElectricalaccessSI;
	}
	public void setNonElectricalaccessSI(Integer nonElectricalaccessSI) {
		NonElectricalaccessSI = nonElectricalaccessSI;
	}
	public String getNonElectricalaccessRemarks() {
		return NonElectricalaccessRemarks;
	}
	public void setNonElectricalaccessRemarks(String nonElectricalaccessRemarks) {
		NonElectricalaccessRemarks = nonElectricalaccessRemarks;
	}
	public Integer getPAPaidDriverConductorCleanerYN() {
		return PAPaidDriverConductorCleanerYN;
	}
	public void setPAPaidDriverConductorCleanerYN(Integer pAPaidDriverConductorCleanerYN) {
		PAPaidDriverConductorCleanerYN = pAPaidDriverConductorCleanerYN;
	}
	public Integer getPAPaidDriverConductorCleanerSI() {
		return PAPaidDriverConductorCleanerSI;
	}
	public void setPAPaidDriverConductorCleanerSI(Integer pAPaidDriverConductorCleanerSI) {
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
	public String getLLtoPaidDriverYN() {
		return LLtoPaidDriverYN;
	}
	public void setLLtoPaidDriverYN(String lLtoPaidDriverYN) {
		LLtoPaidDriverYN = lLtoPaidDriverYN;
	}
	public Integer getAntiTheftYN() {
		return AntiTheftYN;
	}
	public void setAntiTheftYN(Integer antiTheftYN) {
		AntiTheftYN = antiTheftYN;
	}
	public String getPreviousPolicyNo() {
		return PreviousPolicyNo;
	}
	public void setPreviousPolicyNo(String previousPolicyNo) {
		PreviousPolicyNo = previousPolicyNo;
	}
	public String getPreviousInsurer() {
		return PreviousInsurer;
	}
	public void setPreviousInsurer(String previousInsurer) {
		PreviousInsurer = previousInsurer;
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
	public String getPreviousPolicyNCBPerc() {
		return PreviousPolicyNCBPerc;
	}
	public void setPreviousPolicyNCBPerc(String previousPolicyNCBPerc) {
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
	public String getPreviousNilDepreciation() {
		return PreviousNilDepreciation;
	}
	public void setPreviousNilDepreciation(String previousNilDepreciation) {
		PreviousNilDepreciation = previousNilDepreciation;
	}
	public String getRSACover() {
		return RSACover;
	}
	public void setRSACover(String rSACover) {
		RSACover = rSACover;
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
	public String getCPAInsComp() {
		return CPAInsComp;
	}
	public void setCPAInsComp(String cPAInsComp) {
		CPAInsComp = cPAInsComp;
	}
	public String getCPAPolicyFmDt() {
		return CPAPolicyFmDt;
	}
	public void setCPAPolicyFmDt(String cPAPolicyFmDt) {
		CPAPolicyFmDt = cPAPolicyFmDt;
	}
	public String getCPAPolicyNo() {
		return CPAPolicyNo;
	}
	public void setCPAPolicyNo(String cPAPolicyNo) {
		CPAPolicyNo = cPAPolicyNo;
	}
	public String getCPAPolicyToDt() {
		return CPAPolicyToDt;
	}
	public void setCPAPolicyToDt(String cPAPolicyToDt) {
		CPAPolicyToDt = cPAPolicyToDt;
	}
	public String getCPASumInsured() {
		return CPASumInsured;
	}
	public void setCPASumInsured(String cPASumInsured) {
		CPASumInsured = cPASumInsured;
	}
	public String getConsumables() {
		return Consumables;
	}
	public void setConsumables(String consumables) {
		Consumables = consumables;
	}
	public String getEmergencyTranHotelExpRemYN() {
		return EmergencyTranHotelExpRemYN;
	}
	public void setEmergencyTranHotelExpRemYN(String emergencyTranHotelExpRemYN) {
		EmergencyTranHotelExpRemYN = emergencyTranHotelExpRemYN;
	}
	public String getEng_Protector() {
		return Eng_Protector;
	}
	public void setEng_Protector(String eng_Protector) {
		Eng_Protector = eng_Protector;
	}
	public String getKeyReplacementYN() {
		return KeyReplacementYN;
	}
	public void setKeyReplacementYN(String keyReplacementYN) {
		KeyReplacementYN = keyReplacementYN;
	}
	public String getDailyExpRemYN() {
		return DailyExpRemYN;
	}
	public void setDailyExpRemYN(String dailyExpRemYN) {
		DailyExpRemYN = dailyExpRemYN;
	}
	public String getTpPolAddr() {
		return tpPolAddr;
	}
	public void setTpPolAddr(String tpPolAddr) {
		this.tpPolAddr = tpPolAddr;
	}
	public String getTpPolComp() {
		return tpPolComp;
	}
	public void setTpPolComp(String tpPolComp) {
		this.tpPolComp = tpPolComp;
	}
	public String getTpPolFmdt() {
		return tpPolFmdt;
	}
	public void setTpPolFmdt(String tpPolFmdt) {
		this.tpPolFmdt = tpPolFmdt;
	}
	public String getTpPolNo() {
		return tpPolNo;
	}
	public void setTpPolNo(String tpPolNo) {
		this.tpPolNo = tpPolNo;
	}
	public String getTpPolTodt() {
		return tpPolTodt;
	}
	public void setTpPolTodt(String tpPolTodt) {
		this.tpPolTodt = tpPolTodt;
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
