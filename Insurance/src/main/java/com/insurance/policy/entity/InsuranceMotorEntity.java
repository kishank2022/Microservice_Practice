package com.insurance.policy.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "insurance_motor_data_dump", schema = "Insurance")
public class InsuranceMotorEntity {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference_no")
    private String ReferenceNo;

    @Column(name = "prod_code")
    private String ProdCode;

    @Column(name = "proposal_type")
    private String ProposalType;

    @Column(name = "policy_type")
    private String PolicyType;

    @Column(name = "policy_from_dt")
    private LocalDate policyFromDt;

    @Column(name = "policy_to_dt")
    private LocalDate policyToDt;

    @Column(name = "policy_issue_dt")
    private LocalDate policyIssueDt;

    @Column(name = "insured_prefix")
    private String insuredPrefix;

    @Column(name = "insured_name")
    private String insuredName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "address3")
    private String address3;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "pin_code")
    private String pinCode;

    @Column(name = "pan_no")
    private String panNo;

    @Column(name = "gst_no")
    private String gstNo;

    @Column(name = "telephone_no")
    private String telephoneNo;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "fax_no")
    private String faxNo;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "pos_agent_name")
    private String posAgentName;

    @Column(name = "pos_agent_pan_no")
    private String posAgentPanNo;

    @Column(name = "cover_note_no")
    private String coverNoteNo;

    @Column(name = "cover_note_dt")
    private LocalDate coverNoteDt;

    @Column(name = "vehicle_code")
    private String vehicleCode;

    @Column(name = "first_reg_dt")
    private LocalDate firstRegDt;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "engine_no")
    private String engineNo;

    @Column(name = "chassis_no")
    private String chassisNo;

    @Column(name = "reg_no1")
    private String regNo1;

    @Column(name = "reg_no2")
    private String regNo2;

    @Column(name = "reg_no3")
    private String regNo3;

    @Column(name = "reg_no4")
    private String regNo4;

    @Column(name = "rto_code")
    private String rtoCode;

    @Column(name = "idv_of_vehicle")
    private BigDecimal idvOfVehicle;

    @Column(name = "colour")
    private String colour;

    @Column(name = "voluntary_excess")
    private Integer voluntaryExcess;

    @Column(name = "no_emp_cover_l_l")
    private Integer noEmpCoverLL;

    @Column(name = "no_of_cleaner")
    private Integer noOfCleaner;

    @Column(name = "no_of_driver")
    private Integer noOfDriver;

    @Column(name = "no_of_conductor")
    private Integer noOfConductor;

    @Column(name = "vehicle_madeinindia_y_n")
    private String vehicleMadeinindiaYN;

    @Column(name = "vehicle_purpose_y_n")
    private String vehiclePurposeYN;

    @Column(name = "nfpp_employees")
    private String nfppEmployees;

    @Column(name = "nfpp_oth_than_emp")
    private String nfppOthThanEmp;

    @Column(name = "limit_own_premise_y_n")
    private String limitOwnPremiseYN;

    @Column(name = "bangladesh")
    private Integer bangladesh;

    @Column(name = "bhutan")
    private Integer bhutan;

    @Column(name = "sri_lanka")
    private Integer sriLanka;

    @Column(name = "nepal")
    private Integer nepal;

    @Column(name = "pakistan")
    private Integer pakistan;

    @Column(name = "maldives")
    private Integer maldives;

    @Column(name = "cng_kit_y_n")
    private Integer cngKitYN;

    @Column(name = "cng_kit_s_i")
    private BigDecimal cngKitSI;

    @Column(name = "in_built_cng_kit")
    private Integer inBuiltCNGKit;

    @Column(name = "limited_tppdyn")
    private Integer limitedTPPDYN;

    @Column(name = "de_tariff")
    private Integer deTariff;

    @Column(name = "imt23_y_n")
    private String imt23YN;

    @Column(name = "break_in")
    private String breakIn;

    @Column(name = "pre_inspection_report_y_n")
    private String preInspectionReportYN;

    @Column(name = "pre_inspection")
    private String preInspection;

    @Column(name = "fitness_certificateno")
    private String fitnessCertificateno;

    @Column(name = "fitness_validupto")
    private LocalDate fitnessValidupto;

    @Column(name = "veh_permit")
    private String vehPermit;

    @Column(name = "permit_no")
    private String permitNo;

    @Column(name = "pafor_unnamed_passenger_yn")
    private Integer paForUnnamedPassengerYN;

    @Column(name = "pafor_unnamed_passenger_si")
    private BigDecimal paForUnnamedPassengerSI;

    @Column(name = "electricalaccess_yn")
    private String electricalaccessYN;

    @Column(name = "electricalaccess_si")
    private BigDecimal electricalaccessSI;

    @Column(name = "electricalaccess_remarks")
    private String electricalaccessRemarks;

    @Column(name = "non_electricalaccess_yn")
    private String nonElectricalaccessYN;

    @Column(name = "non_electricalaccess_si")
    private BigDecimal nonElectricalaccessSI;

    @Column(name = "non_electricalaccess_remarks")
    private String nonElectricalaccessRemarks;

    @Column(name = "papaid_driver_conductor_cleaner_yn")
    private Integer paPaidDriverConductorCleanerYN;

    @Column(name = "papaid_driver_conductor_cleaner_si")
    private BigDecimal paPaidDriverConductorCleanerSI;

    @Column(name = "papaid_driver_count")
    private Integer paPaidDriverCount;

    @Column(name = "papaid_conductor_count")
    private Integer paPaidConductorCount;

    @Column(name = "papaid_cleaner_count")
    private Integer paPaidCleanerCount;

    @Column(name = "nominee_namefor_pa_owner_driver")
    private String nomineeNameforPAOwnerDriver;

    @Column(name = "nominee_agefor_pa_owner_driver")
    private Integer nomineeAgeforPAOwnerDriver;

    @Column(name = "nominee_relationfor_pa_owner_driver")
    private String nomineeRelationforPAOwnerDriver;

    @Column(name = "appointee_namefor_pa_owner_driver")
    private String appointeeNameforPAOwnerDriver;

    @Column(name = "appointee_relationfor_pa_owner_driver")
    private String appointeeRelationforPAOwnerDriver;

    @Column(name = "llto_paid_driver_yn")
    private Integer llToPaidDriverYN;

    @Column(name = "anti_theft_yn")
    private Integer antiTheftYN;

    @Column(name = "previous_policy_no")
    private String previousPolicyNo;

    @Column(name = "previous_insurer")
    private String previousInsurer;

    @Column(name = "previous_policy_from_dt")
    private LocalDate previousPolicyFromDt;

    @Column(name = "previous_policy_to_dt")
    private LocalDate previousPolicyToDt;

    @Column(name = "previous_policy_si")
    private BigDecimal previousPolicySI;

    @Column(name = "previous_policy_claim_yn")
    private Integer previousPolicyClaimYN;

    @Column(name = "previous_policy_uw_year")
    private String previousPolicyUWYear;

    @Column(name = "previous_policy_ncb_perc")
    private Integer previousPolicyNCBPerc;

    @Column(name = "previous_policy_type")
    private String previousPolicyType;

    @Column(name = "nil_depreciation_cover_yn")
    private String nilDepreciationCoverYN;

    @Column(name = "previous_nil_depreciation")
    private Integer previousNilDepreciation;

    @Column(name = "rsa_cover")
    private String rsaCover;

    @Column(name = "hypothecation_type")
    private String hypothecationType;

    @Column(name = "hypothecation_bank_name")
    private String hypothecationBankName;

    @Column(name = "hypothecation_address1")
    private String hypothecationAddress1;

    @Column(name = "hypothecation_address2")
    private String hypothecationAddress2;

    @Column(name = "hypothecation_address3")
    private String hypothecationAddress3;

    @Column(name = "hypothecation_agreement_no")
    private String hypothecationAgreementNo;

    @Column(name = "hypothecation_country")
    private String hypothecationCountry;

    @Column(name = "hypothecation_state")
    private String hypothecationState;

    @Column(name = "hypothecation_city")
    private String hypothecationCity;

    @Column(name = "hypothecation_pin_code")
    private String hypothecationPinCode;

    @Column(name = "specified_person_field")
    private String specifiedPersonField;

    @Column(name = "pa_owner_driver_exclusion")
    private String paOwnerDriverExclusion;

    @Column(name = "pa_owner_driver_ex_reason")
    private String paOwnerDriverExReason;

    @Column(name = "cpa_ins_comp")
    private String cpaInsComp;

    @Column(name = "cpa_policy_fm_dt")
    private LocalDate cpaPolicyFmDt;

    @Column(name = "cpa_policy_no")
    private String cpaPolicyNo;

    @Column(name = "cpa_policy_to_dt")
    private LocalDate cpaPolicyToDt;

    @Column(name = "cpa_sum_insured")
    private BigDecimal cpaSumInsured;

    @Column(name = "consumables")
    private String consumables;

    @Column(name = "emergency_tran_hotel_exp_rem_yn")
    private String emergencyTranHotelExpRemYN;

    @Column(name = "eng_protector")
    private String engProtector;

    @Column(name = "key_replacement_yn")
    private String keyReplacementYN;

    @Column(name = "daily_exp_rem_yn")
    private String dailyExpRemYN;

    @Column(name = "tp_pol_addr")
    private String tpPolAddr;

    @Column(name = "tp_pol_comp")
    private String tpPolComp;

    @Column(name = "tp_pol_fmdt")
    private LocalDate tpPolFmdt;

    @Column(name = "tp_pol_no")
    private String tpPolNo;

    @Column(name = "tp_pol_todt")
    private LocalDate tpPolTodt;

    @Column(name = "ckyc_no")
    private String ckycNo;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "poi_type")
    private String poiType;

    @Column(name = "poi_id")
    private String poiId;

    @Column(name = "poa_type")
    private String poaType;

    @Column(name = "poa_id")
    private String poaId;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "spouse_name")
    private String spouseName;

    @Column(name = "residential_status")
    private String residentialStatus;

    @Column(name = "poi_document_file")
    private String poiDocumentFile;

    @Column(name = "poa_document_file")
    private String poaDocumentFile;

    @Column(name = "insured_photo")
    private String insuredPhoto;

    @Column(name = "poi_document_ext")
    private String poiDocumentExt;

    @Column(name = "poa_document_ext")
    private String poaDocumentExt;

    @Column(name = "insured_photo_ext")
    private String insuredPhotoExt;

    @Column(name = "vehicle_category")
    private String vehicleCategory;

    @Column(name = "pccvveh_type")
    private String pccvVehType;

    @Column(name = "gvw")
    private BigDecimal gvw;

    @Column(name = "aadhar_enroll_no")
    private String aadharEnrollNo;

    @Column(name = "aadhar_no")
    private String aadharNo;

    @Column(name = "vehicle_age")
    private Integer vehicleAge;

    @Column(name = "vehicle_manufacture_year")
    private String vehicleManufactureYear;

    @Column(name = "age_of_owner")
    private Integer ageOfOwner;

    @Column(name = "age_of_paid_driver")
    private Integer ageOfPaidDriver;

    @Column(name = "age_of_vehicle")
    private Integer ageOfVehicle;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "amount1")
    private BigDecimal amount1;

    @Column(name = "body_type")
    private String bodyType;

    @Column(name = "cancel_or_refuse_renew")
    private String cancelOrRefuseRenew;

    @Column(name = "captive_use_yn")
    private String captiveUseYN;

    @Column(name = "claims_lodged")
    private String claimsLodged;

    @Column(name = "cover_lamp_tyre_tube_yn")
    private String coverLampTyreTubeYN;

    @Column(name = "de_tariffdis")
    private String deTariffDis;

    @Column(name = "date_of_purchase_of_veh_as_per_inv_or_sale_letter")
    private LocalDate dateOfPurchaseOfVehAsPerInvOrSaleLetter;

    @Column(name = "no_of_coolies")
    private Integer noOfCoolies;

    @Column(name = "no_of_claims")
    private Integer noOfClaims;

    @Column(name = "no_of_claims1")
    private Integer noOfClaims1;

    @Column(name = "no_of_dccfor_pa")
    private Integer noOfDccForPA;

    @Column(name = "no_of_trailers")
    private Integer noOfTrailers;

    @Column(name = "pucc_no")
    private String puccNo;

    @Column(name = "pucc_state")
    private String puccState;

    @Column(name = "pucc_yn")
    private String puccYN;

    @Column(name = "seating_capacity")
    private Integer seatingCapacity;

    @Column(name = "speedometer_reading")
    private String speedometerReading;

    @Column(name = "tdchassis_no")
    private String tdChassisNo;

    @Column(name = "tdreg_no")
    private String tdRegNo;

    @Column(name = "transfer_of_owner")
    private String transferOfOwner;

    @Column(name = "trailer_vehicle_code")
    private String trailerVehicleCode;

    @Column(name = "useof_vehis_limited_own_premises_yn")
    private String useOfVehIsLimitedOwnPremisesYN;

    @Column(name = "validupto")
    private LocalDate validUpto;

    @Column(name = "veh_fit_with_tubless_tyres_yn")
    private String vehFitWithTublessTyresYN;

    @Column(name = "veh_fitted_with_fg_tank_yn")
    private String vehFittedWithFGTankYN;

    @Column(name = "veh_parked_during_night")
    private String vehParkedDuringNight;

    @Column(name = "nature_of_goods")
    private String natureOfGoods;

    @Column(name = "indemnity_to_hirer_yn")
    private String indemnityToHirerYN;

    @Column(name = "shri_motor_protection_yn")
    private String shriMotorProtectionYN;

    @Column(name = "proposal_no")
    private String proposalNo;

    @Column(name = "transaction_number")
    private String transactionNumber;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "cardholder_name")
    private String cardholderName;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_valid_up_to")
    private String cardValidUpTo;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "payment_type")
    private String paymentType;

    @Column(name = "transaction_date")
    private LocalDate transactionDate;

    @Column(name = "cheque_type")
    private String chequeType;

    @Column(name = "cheque_clear_type")
    private String chequeClearType;

    @Column(name = "cash_type")
    private String cashType;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "vehicle_regno")
    private String vehicleRegno;

    @Column(name = "vehicle_request")
    private String vehicleRequest;

    @Column(name = "vehicle_response")
    private String vehicleResponse;
    
    @Column(name = "error_desc")
    private String Error_Desc;
    
    @Column(name = "approve_pol_no")
    private String ApprovePolNo;
    
    @Column(name = "approve_pol_sysid")
    private String ApprovePolSysId;
    
    @Column(name = "error_code")
    private String Err_Code;
    
    @Column(name = "request_name")
    private String request_name;
    
    @Column(name = "vkid")
    private String vkid;    
    
    @Column(name = "policy_status")
    private String policy_status;
    
    @Column(name = "policy_paymnet_response")
    private String policy_paymnet_response;
    
    @Column(name = "physical_policy")
    private String physical_policy;
    
    @Column(name = "payment_status_flag")
    private String payment_status_flag;
    
    @Column(name = "policy_schedule_url_result") 
    private String policy_schedule_url_result;
    
    @Column(name = "payment_transaction_id") 
    private String payment_transaction_id;
    
    @Column(name = "payment_transaction_status") 
    private String payment_transaction_status;
    
    @Column(name = "payment_transaction_remark") 
    private String payment_transaction_remark;
    
    @Column(name = "remark") 
    private String remark;
    
    @Column(name = "payment_transaction_amount") 
    private String payment_transaction_amount;
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getPayment_transaction_id() {
		return payment_transaction_id;
	}
	public void setPayment_transaction_id(String payment_transaction_id) {
		this.payment_transaction_id = payment_transaction_id;
	}
	public String getPayment_transaction_status() {
		return payment_transaction_status;
	}
	public void setPayment_transaction_status(String payment_transaction_status) {
		this.payment_transaction_status = payment_transaction_status;
	}
	public String getPayment_transaction_remark() {
		return payment_transaction_remark;
	}
	public void setPayment_transaction_remark(String payment_transaction_remark) {
		this.payment_transaction_remark = payment_transaction_remark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPayment_transaction_amount() {
		return payment_transaction_amount;
	}
	public void setPayment_transaction_amount(String payment_transaction_amount) {
		this.payment_transaction_amount = payment_transaction_amount;
	}
	public String getPolicy_schedule_url_result() {
		return policy_schedule_url_result;
	}
	public void setPolicy_schedule_url_result(String policy_schedule_url_result) {
		this.policy_schedule_url_result = policy_schedule_url_result;
	}
	public String getPhysical_policy() {
		return physical_policy;
	}





	public void setPhysical_policy(String physical_policy) {
		this.physical_policy = physical_policy;
	}





	public String getPayment_status_flag() {
		return payment_status_flag;
	}





	public void setPayment_status_flag(String payment_status_flag) {
		this.payment_status_flag = payment_status_flag;
	}





	public String getPolicy_status() {
		return policy_status;
	}





	public void setPolicy_status(String policy_status) {
		this.policy_status = policy_status;
	}





	public String getPolicy_paymnet_response() {
		return policy_paymnet_response;
	}





	public void setPolicy_paymnet_response(String policy_paymnet_response) {
		this.policy_paymnet_response = policy_paymnet_response;
	}





	public InsuranceMotorEntity() {
    	
		super();
		// TODO Auto-generated constructor stub
	}

    
    
	
    
	public String getVkid() {
		return vkid;
	}





	public void setVkid(String vkid) {
		this.vkid = vkid;
	}





	public String getRequest_name() {
		return request_name;
	}




	public void setRequest_name(String request_name) {
		this.request_name = request_name;
	}




	@Override
	public String toString() {
		return "InsuranceMotorEntity [id=" + id + ", ReferenceNo=" + ReferenceNo + ", ProdCode=" + ProdCode
				+ ", ProposalType=" + ProposalType + ", PolicyType=" + PolicyType + ", policyFromDt=" + policyFromDt
				+ ", policyToDt=" + policyToDt + ", policyIssueDt=" + policyIssueDt + ", insuredPrefix=" + insuredPrefix
				+ ", insuredName=" + insuredName + ", gender=" + gender + ", address1=" + address1 + ", address2="
				+ address2 + ", address3=" + address3 + ", state=" + state + ", city=" + city + ", pinCode=" + pinCode
				+ ", panNo=" + panNo + ", gstNo=" + gstNo + ", telephoneNo=" + telephoneNo + ", dateOfBirth="
				+ dateOfBirth + ", mobileNo=" + mobileNo + ", faxNo=" + faxNo + ", emailId=" + emailId
				+ ", posAgentName=" + posAgentName + ", posAgentPanNo=" + posAgentPanNo + ", coverNoteNo=" + coverNoteNo
				+ ", coverNoteDt=" + coverNoteDt + ", vehicleCode=" + vehicleCode + ", firstRegDt=" + firstRegDt
				+ ", vehicleType=" + vehicleType + ", engineNo=" + engineNo + ", chassisNo=" + chassisNo + ", regNo1="
				+ regNo1 + ", regNo2=" + regNo2 + ", regNo3=" + regNo3 + ", regNo4=" + regNo4 + ", rtoCode=" + rtoCode
				+ ", idvOfVehicle=" + idvOfVehicle + ", colour=" + colour + ", voluntaryExcess=" + voluntaryExcess
				+ ", noEmpCoverLL=" + noEmpCoverLL + ", noOfCleaner=" + noOfCleaner + ", noOfDriver=" + noOfDriver
				+ ", noOfConductor=" + noOfConductor + ", vehicleMadeinindiaYN=" + vehicleMadeinindiaYN
				+ ", vehiclePurposeYN=" + vehiclePurposeYN + ", nfppEmployees=" + nfppEmployees + ", nfppOthThanEmp="
				+ nfppOthThanEmp + ", limitOwnPremiseYN=" + limitOwnPremiseYN + ", bangladesh=" + bangladesh
				+ ", bhutan=" + bhutan + ", sriLanka=" + sriLanka + ", nepal=" + nepal + ", pakistan=" + pakistan
				+ ", maldives=" + maldives + ", cngKitYN=" + cngKitYN + ", cngKitSI=" + cngKitSI + ", inBuiltCNGKit="
				+ inBuiltCNGKit + ", limitedTPPDYN=" + limitedTPPDYN + ", deTariff=" + deTariff + ", imt23YN=" + imt23YN
				+ ", breakIn=" + breakIn + ", preInspectionReportYN=" + preInspectionReportYN + ", preInspection="
				+ preInspection + ", fitnessCertificateno=" + fitnessCertificateno + ", fitnessValidupto="
				+ fitnessValidupto + ", vehPermit=" + vehPermit + ", permitNo=" + permitNo
				+ ", paForUnnamedPassengerYN=" + paForUnnamedPassengerYN + ", paForUnnamedPassengerSI="
				+ paForUnnamedPassengerSI + ", electricalaccessYN=" + electricalaccessYN + ", electricalaccessSI="
				+ electricalaccessSI + ", electricalaccessRemarks=" + electricalaccessRemarks
				+ ", nonElectricalaccessYN=" + nonElectricalaccessYN + ", nonElectricalaccessSI="
				+ nonElectricalaccessSI + ", nonElectricalaccessRemarks=" + nonElectricalaccessRemarks
				+ ", paPaidDriverConductorCleanerYN=" + paPaidDriverConductorCleanerYN
				+ ", paPaidDriverConductorCleanerSI=" + paPaidDriverConductorCleanerSI + ", paPaidDriverCount="
				+ paPaidDriverCount + ", paPaidConductorCount=" + paPaidConductorCount + ", paPaidCleanerCount="
				+ paPaidCleanerCount + ", nomineeNameforPAOwnerDriver=" + nomineeNameforPAOwnerDriver
				+ ", nomineeAgeforPAOwnerDriver=" + nomineeAgeforPAOwnerDriver + ", nomineeRelationforPAOwnerDriver="
				+ nomineeRelationforPAOwnerDriver + ", appointeeNameforPAOwnerDriver=" + appointeeNameforPAOwnerDriver
				+ ", appointeeRelationforPAOwnerDriver=" + appointeeRelationforPAOwnerDriver + ", llToPaidDriverYN="
				+ llToPaidDriverYN + ", antiTheftYN=" + antiTheftYN + ", previousPolicyNo=" + previousPolicyNo
				+ ", previousInsurer=" + previousInsurer + ", previousPolicyFromDt=" + previousPolicyFromDt
				+ ", previousPolicyToDt=" + previousPolicyToDt + ", previousPolicySI=" + previousPolicySI
				+ ", previousPolicyClaimYN=" + previousPolicyClaimYN + ", previousPolicyUWYear=" + previousPolicyUWYear
				+ ", previousPolicyNCBPerc=" + previousPolicyNCBPerc + ", previousPolicyType=" + previousPolicyType
				+ ", nilDepreciationCoverYN=" + nilDepreciationCoverYN + ", previousNilDepreciation="
				+ previousNilDepreciation + ", rsaCover=" + rsaCover + ", hypothecationType=" + hypothecationType
				+ ", hypothecationBankName=" + hypothecationBankName + ", hypothecationAddress1="
				+ hypothecationAddress1 + ", hypothecationAddress2=" + hypothecationAddress2
				+ ", hypothecationAddress3=" + hypothecationAddress3 + ", hypothecationAgreementNo="
				+ hypothecationAgreementNo + ", hypothecationCountry=" + hypothecationCountry + ", hypothecationState="
				+ hypothecationState + ", hypothecationCity=" + hypothecationCity + ", hypothecationPinCode="
				+ hypothecationPinCode + ", specifiedPersonField=" + specifiedPersonField + ", paOwnerDriverExclusion="
				+ paOwnerDriverExclusion + ", paOwnerDriverExReason=" + paOwnerDriverExReason + ", cpaInsComp="
				+ cpaInsComp + ", cpaPolicyFmDt=" + cpaPolicyFmDt + ", cpaPolicyNo=" + cpaPolicyNo + ", cpaPolicyToDt="
				+ cpaPolicyToDt + ", cpaSumInsured=" + cpaSumInsured + ", consumables=" + consumables
				+ ", emergencyTranHotelExpRemYN=" + emergencyTranHotelExpRemYN + ", engProtector=" + engProtector
				+ ", keyReplacementYN=" + keyReplacementYN + ", dailyExpRemYN=" + dailyExpRemYN + ", tpPolAddr="
				+ tpPolAddr + ", tpPolComp=" + tpPolComp + ", tpPolFmdt=" + tpPolFmdt + ", tpPolNo=" + tpPolNo
				+ ", tpPolTodt=" + tpPolTodt + ", ckycNo=" + ckycNo + ", dob=" + dob + ", poiType=" + poiType
				+ ", poiId=" + poiId + ", poaType=" + poaType + ", poaId=" + poaId + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", maritalStatus=" + maritalStatus + ", spouseName=" + spouseName
				+ ", residentialStatus=" + residentialStatus + ", poiDocumentFile=" + poiDocumentFile
				+ ", poaDocumentFile=" + poaDocumentFile + ", insuredPhoto=" + insuredPhoto + ", poiDocumentExt="
				+ poiDocumentExt + ", poaDocumentExt=" + poaDocumentExt + ", insuredPhotoExt=" + insuredPhotoExt
				+ ", vehicleCategory=" + vehicleCategory + ", pccvVehType=" + pccvVehType + ", gvw=" + gvw
				+ ", aadharEnrollNo=" + aadharEnrollNo + ", aadharNo=" + aadharNo + ", vehicleAge=" + vehicleAge
				+ ", vehicleManufactureYear=" + vehicleManufactureYear + ", ageOfOwner=" + ageOfOwner
				+ ", ageOfPaidDriver=" + ageOfPaidDriver + ", ageOfVehicle=" + ageOfVehicle + ", amount=" + amount
				+ ", amount1=" + amount1 + ", bodyType=" + bodyType + ", cancelOrRefuseRenew=" + cancelOrRefuseRenew
				+ ", captiveUseYN=" + captiveUseYN + ", claimsLodged=" + claimsLodged + ", coverLampTyreTubeYN="
				+ coverLampTyreTubeYN + ", deTariffDis=" + deTariffDis + ", dateOfPurchaseOfVehAsPerInvOrSaleLetter="
				+ dateOfPurchaseOfVehAsPerInvOrSaleLetter + ", noOfCoolies=" + noOfCoolies + ", noOfClaims="
				+ noOfClaims + ", noOfClaims1=" + noOfClaims1 + ", noOfDccForPA=" + noOfDccForPA + ", noOfTrailers="
				+ noOfTrailers + ", puccNo=" + puccNo + ", puccState=" + puccState + ", puccYN=" + puccYN
				+ ", seatingCapacity=" + seatingCapacity + ", speedometerReading=" + speedometerReading
				+ ", tdChassisNo=" + tdChassisNo + ", tdRegNo=" + tdRegNo + ", transferOfOwner=" + transferOfOwner
				+ ", trailerVehicleCode=" + trailerVehicleCode + ", useOfVehIsLimitedOwnPremisesYN="
				+ useOfVehIsLimitedOwnPremisesYN + ", validUpto=" + validUpto + ", vehFitWithTublessTyresYN="
				+ vehFitWithTublessTyresYN + ", vehFittedWithFGTankYN=" + vehFittedWithFGTankYN
				+ ", vehParkedDuringNight=" + vehParkedDuringNight + ", natureOfGoods=" + natureOfGoods
				+ ", indemnityToHirerYN=" + indemnityToHirerYN + ", shriMotorProtectionYN=" + shriMotorProtectionYN
				+ ", proposalNo=" + proposalNo + ", transactionNumber=" + transactionNumber + ", cardNumber="
				+ cardNumber + ", cardholderName=" + cardholderName + ", cardType=" + cardType + ", cardValidUpTo="
				+ cardValidUpTo + ", bankName=" + bankName + ", branchName=" + branchName + ", paymentType="
				+ paymentType + ", transactionDate=" + transactionDate + ", chequeType=" + chequeType
				+ ", chequeClearType=" + chequeClearType + ", cashType=" + cashType + ", policyNumber=" + policyNumber
				+ ", vehicleRegno=" + vehicleRegno + ", vehicleRequest=" + vehicleRequest + ", vehicleResponse="
				+ vehicleResponse + ", Error_Desc=" + Error_Desc + ", ApprovePolNo=" + ApprovePolNo
				+ ", ApprovePolSysId=" + ApprovePolSysId + ", Err_Code=" + Err_Code + "]";
	}


	public Long getId() {
		return id;
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


	public String getErr_Code() {
		return Err_Code;
	}


	public void setErr_Code(String err_Code) {
		Err_Code = err_Code;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getReferenceNo() {
		return ReferenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.ReferenceNo = referenceNo;
	}

	public String getProdCode() {
		return ProdCode;
	}

	public void setProdCode(String prodCode) {
		this.ProdCode = prodCode;
	}

	public String getProposalType() {
		return ProposalType;
	}

	public void setProposalType(String proposalType) {
		this.ProposalType = proposalType;
	}

	public String getPolicyType() {
		return PolicyType;
	}

	public void setPolicyType(String policyType) {
		this.PolicyType = policyType;
	}

	public LocalDate getPolicyFromDt() {
		return policyFromDt;
	}

	public void setPolicyFromDt(LocalDate policyFromDt) {
		this.policyFromDt = policyFromDt;
	}

	public LocalDate getPolicyToDt() {
		return policyToDt;
	}

	public void setPolicyToDt(LocalDate policyToDt) {
		this.policyToDt = policyToDt;
	}

	public LocalDate getPolicyIssueDt() {
		return policyIssueDt;
	}

	public void setPolicyIssueDt(LocalDate policyIssueDt) {
		this.policyIssueDt = policyIssueDt;
	}

	public String getInsuredPrefix() {
		return insuredPrefix;
	}

	public void setInsuredPrefix(String insuredPrefix) {
		this.insuredPrefix = insuredPrefix;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPosAgentName() {
		return posAgentName;
	}

	public void setPosAgentName(String posAgentName) {
		this.posAgentName = posAgentName;
	}

	public String getPosAgentPanNo() {
		return posAgentPanNo;
	}

	public void setPosAgentPanNo(String posAgentPanNo) {
		this.posAgentPanNo = posAgentPanNo;
	}

	public String getCoverNoteNo() {
		return coverNoteNo;
	}

	public void setCoverNoteNo(String coverNoteNo) {
		this.coverNoteNo = coverNoteNo;
	}

	public LocalDate getCoverNoteDt() {
		return coverNoteDt;
	}

	public void setCoverNoteDt(LocalDate coverNoteDt) {
		this.coverNoteDt = coverNoteDt;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public LocalDate getFirstRegDt() {
		return firstRegDt;
	}

	public void setFirstRegDt(LocalDate firstRegDt) {
		this.firstRegDt = firstRegDt;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getRegNo1() {
		return regNo1;
	}

	public void setRegNo1(String regNo1) {
		this.regNo1 = regNo1;
	}

	public String getRegNo2() {
		return regNo2;
	}

	public void setRegNo2(String regNo2) {
		this.regNo2 = regNo2;
	}

	public String getRegNo3() {
		return regNo3;
	}

	public void setRegNo3(String regNo3) {
		this.regNo3 = regNo3;
	}

	public String getRegNo4() {
		return regNo4;
	}

	public void setRegNo4(String regNo4) {
		this.regNo4 = regNo4;
	}

	public String getRtoCode() {
		return rtoCode;
	}

	public void setRtoCode(String rtoCode) {
		this.rtoCode = rtoCode;
	}

	public BigDecimal getIdvOfVehicle() {
		return idvOfVehicle;
	}

	public void setIdvOfVehicle(BigDecimal idvOfVehicle) {
		this.idvOfVehicle = idvOfVehicle;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Integer getVoluntaryExcess() {
		return voluntaryExcess;
	}

	public void setVoluntaryExcess(Integer voluntaryExcess) {
		this.voluntaryExcess = voluntaryExcess;
	}

	public Integer getNoEmpCoverLL() {
		return noEmpCoverLL;
	}

	public void setNoEmpCoverLL(Integer noEmpCoverLL) {
		this.noEmpCoverLL = noEmpCoverLL;
	}

	public Integer getNoOfCleaner() {
		return noOfCleaner;
	}

	public void setNoOfCleaner(Integer noOfCleaner) {
		this.noOfCleaner = noOfCleaner;
	}

	public Integer getNoOfDriver() {
		return noOfDriver;
	}

	public void setNoOfDriver(Integer noOfDriver) {
		this.noOfDriver = noOfDriver;
	}

	public Integer getNoOfConductor() {
		return noOfConductor;
	}

	public void setNoOfConductor(Integer noOfConductor) {
		this.noOfConductor = noOfConductor;
	}

	public String getVehicleMadeinindiaYN() {
		return vehicleMadeinindiaYN;
	}

	public void setVehicleMadeinindiaYN(String vehicleMadeinindiaYN) {
		this.vehicleMadeinindiaYN = vehicleMadeinindiaYN;
	}

	public String getVehiclePurposeYN() {
		return vehiclePurposeYN;
	}

	public void setVehiclePurposeYN(String vehiclePurposeYN) {
		this.vehiclePurposeYN = vehiclePurposeYN;
	}

	public String getNfppEmployees() {
		return nfppEmployees;
	}

	public void setNfppEmployees(String nfppEmployees) {
		this.nfppEmployees = nfppEmployees;
	}

	public String getNfppOthThanEmp() {
		return nfppOthThanEmp;
	}

	public void setNfppOthThanEmp(String nfppOthThanEmp) {
		this.nfppOthThanEmp = nfppOthThanEmp;
	}

	public String getLimitOwnPremiseYN() {
		return limitOwnPremiseYN;
	}

	public void setLimitOwnPremiseYN(String limitOwnPremiseYN) {
		this.limitOwnPremiseYN = limitOwnPremiseYN;
	}

	public Integer getBangladesh() {
		return bangladesh;
	}

	public void setBangladesh(Integer bangladesh) {
		this.bangladesh = bangladesh;
	}

	public Integer getBhutan() {
		return bhutan;
	}

	public void setBhutan(Integer bhutan) {
		this.bhutan = bhutan;
	}

	public Integer getSriLanka() {
		return sriLanka;
	}

	public void setSriLanka(Integer sriLanka) {
		this.sriLanka = sriLanka;
	}

	public Integer getNepal() {
		return nepal;
	}

	public void setNepal(Integer nepal) {
		this.nepal = nepal;
	}

	public Integer getPakistan() {
		return pakistan;
	}

	public void setPakistan(Integer pakistan) {
		this.pakistan = pakistan;
	}

	public Integer getMaldives() {
		return maldives;
	}

	public void setMaldives(Integer maldives) {
		this.maldives = maldives;
	}

	public Integer getCngKitYN() {
		return cngKitYN;
	}

	public void setCngKitYN(Integer cngKitYN) {
		this.cngKitYN = cngKitYN;
	}

	public BigDecimal getCngKitSI() {
		return cngKitSI;
	}

	public void setCngKitSI(BigDecimal cngKitSI) {
		this.cngKitSI = cngKitSI;
	}

	public Integer getInBuiltCNGKit() {
		return inBuiltCNGKit;
	}

	public void setInBuiltCNGKit(Integer inBuiltCNGKit) {
		this.inBuiltCNGKit = inBuiltCNGKit;
	}

	public Integer getLimitedTPPDYN() {
		return limitedTPPDYN;
	}

	public void setLimitedTPPDYN(Integer limitedTPPDYN) {
		this.limitedTPPDYN = limitedTPPDYN;
	}

	public Integer getDeTariff() {
		return deTariff;
	}

	public void setDeTariff(Integer deTariff) {
		this.deTariff = deTariff;
	}

	public String getImt23YN() {
		return imt23YN;
	}

	public void setImt23YN(String imt23yn) {
		imt23YN = imt23yn;
	}

	public String getBreakIn() {
		return breakIn;
	}

	public void setBreakIn(String breakIn) {
		this.breakIn = breakIn;
	}

	public String getPreInspectionReportYN() {
		return preInspectionReportYN;
	}

	public void setPreInspectionReportYN(String preInspectionReportYN) {
		this.preInspectionReportYN = preInspectionReportYN;
	}

	public String getPreInspection() {
		return preInspection;
	}

	public void setPreInspection(String preInspection) {
		this.preInspection = preInspection;
	}

	public String getFitnessCertificateno() {
		return fitnessCertificateno;
	}

	public void setFitnessCertificateno(String fitnessCertificateno) {
		this.fitnessCertificateno = fitnessCertificateno;
	}

	public LocalDate getFitnessValidupto() {
		return fitnessValidupto;
	}

	public void setFitnessValidupto(LocalDate fitnessValidupto) {
		this.fitnessValidupto = fitnessValidupto;
	}

	public String getVehPermit() {
		return vehPermit;
	}

	public void setVehPermit(String vehPermit) {
		this.vehPermit = vehPermit;
	}

	public String getPermitNo() {
		return permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public Integer getPaForUnnamedPassengerYN() {
		return paForUnnamedPassengerYN;
	}

	public void setPaForUnnamedPassengerYN(Integer paForUnnamedPassengerYN) {
		this.paForUnnamedPassengerYN = paForUnnamedPassengerYN;
	}

	public BigDecimal getPaForUnnamedPassengerSI() {
		return paForUnnamedPassengerSI;
	}

	public void setPaForUnnamedPassengerSI(BigDecimal paForUnnamedPassengerSI) {
		this.paForUnnamedPassengerSI = paForUnnamedPassengerSI;
	}

	public String getElectricalaccessYN() {
		return electricalaccessYN;
	}

	public void setElectricalaccessYN(String electricalaccessYN) {
		this.electricalaccessYN = electricalaccessYN;
	}

	public BigDecimal getElectricalaccessSI() {
		return electricalaccessSI;
	}

	public void setElectricalaccessSI(BigDecimal electricalaccessSI) {
		this.electricalaccessSI = electricalaccessSI;
	}

	public String getElectricalaccessRemarks() {
		return electricalaccessRemarks;
	}

	public void setElectricalaccessRemarks(String electricalaccessRemarks) {
		this.electricalaccessRemarks = electricalaccessRemarks;
	}

	public String getNonElectricalaccessYN() {
		return nonElectricalaccessYN;
	}

	public void setNonElectricalaccessYN(String nonElectricalaccessYN) {
		this.nonElectricalaccessYN = nonElectricalaccessYN;
	}

	public BigDecimal getNonElectricalaccessSI() {
		return nonElectricalaccessSI;
	}

	public void setNonElectricalaccessSI(BigDecimal nonElectricalaccessSI) {
		this.nonElectricalaccessSI = nonElectricalaccessSI;
	}

	public String getNonElectricalaccessRemarks() {
		return nonElectricalaccessRemarks;
	}

	public void setNonElectricalaccessRemarks(String nonElectricalaccessRemarks) {
		this.nonElectricalaccessRemarks = nonElectricalaccessRemarks;
	}

	public Integer getPaPaidDriverConductorCleanerYN() {
		return paPaidDriverConductorCleanerYN;
	}

	public void setPaPaidDriverConductorCleanerYN(Integer paPaidDriverConductorCleanerYN) {
		this.paPaidDriverConductorCleanerYN = paPaidDriverConductorCleanerYN;
	}

	public BigDecimal getPaPaidDriverConductorCleanerSI() {
		return paPaidDriverConductorCleanerSI;
	}

	public void setPaPaidDriverConductorCleanerSI(BigDecimal paPaidDriverConductorCleanerSI) {
		this.paPaidDriverConductorCleanerSI = paPaidDriverConductorCleanerSI;
	}

	public Integer getPaPaidDriverCount() {
		return paPaidDriverCount;
	}

	public void setPaPaidDriverCount(Integer paPaidDriverCount) {
		this.paPaidDriverCount = paPaidDriverCount;
	}

	public Integer getPaPaidConductorCount() {
		return paPaidConductorCount;
	}

	public void setPaPaidConductorCount(Integer paPaidConductorCount) {
		this.paPaidConductorCount = paPaidConductorCount;
	}

	public Integer getPaPaidCleanerCount() {
		return paPaidCleanerCount;
	}

	public void setPaPaidCleanerCount(Integer paPaidCleanerCount) {
		this.paPaidCleanerCount = paPaidCleanerCount;
	}

	public String getNomineeNameforPAOwnerDriver() {
		return nomineeNameforPAOwnerDriver;
	}

	public void setNomineeNameforPAOwnerDriver(String nomineeNameforPAOwnerDriver) {
		this.nomineeNameforPAOwnerDriver = nomineeNameforPAOwnerDriver;
	}

	public Integer getNomineeAgeforPAOwnerDriver() {
		return nomineeAgeforPAOwnerDriver;
	}

	public void setNomineeAgeforPAOwnerDriver(Integer nomineeAgeforPAOwnerDriver) {
		this.nomineeAgeforPAOwnerDriver = nomineeAgeforPAOwnerDriver;
	}

	public String getNomineeRelationforPAOwnerDriver() {
		return nomineeRelationforPAOwnerDriver;
	}

	public void setNomineeRelationforPAOwnerDriver(String nomineeRelationforPAOwnerDriver) {
		this.nomineeRelationforPAOwnerDriver = nomineeRelationforPAOwnerDriver;
	}

	public String getAppointeeNameforPAOwnerDriver() {
		return appointeeNameforPAOwnerDriver;
	}

	public void setAppointeeNameforPAOwnerDriver(String appointeeNameforPAOwnerDriver) {
		this.appointeeNameforPAOwnerDriver = appointeeNameforPAOwnerDriver;
	}

	public String getAppointeeRelationforPAOwnerDriver() {
		return appointeeRelationforPAOwnerDriver;
	}

	public void setAppointeeRelationforPAOwnerDriver(String appointeeRelationforPAOwnerDriver) {
		this.appointeeRelationforPAOwnerDriver = appointeeRelationforPAOwnerDriver;
	}

	public Integer getLlToPaidDriverYN() {
		return llToPaidDriverYN;
	}

	public void setLlToPaidDriverYN(Integer llToPaidDriverYN) {
		this.llToPaidDriverYN = llToPaidDriverYN;
	}

	public Integer getAntiTheftYN() {
		return antiTheftYN;
	}

	public void setAntiTheftYN(Integer antiTheftYN) {
		this.antiTheftYN = antiTheftYN;
	}

	public String getPreviousPolicyNo() {
		return previousPolicyNo;
	}

	public void setPreviousPolicyNo(String previousPolicyNo) {
		this.previousPolicyNo = previousPolicyNo;
	}

	public String getPreviousInsurer() {
		return previousInsurer;
	}

	public void setPreviousInsurer(String previousInsurer) {
		this.previousInsurer = previousInsurer;
	}

	public LocalDate getPreviousPolicyFromDt() {
		return previousPolicyFromDt;
	}

	public void setPreviousPolicyFromDt(LocalDate previousPolicyFromDt) {
		this.previousPolicyFromDt = previousPolicyFromDt;
	}

	public LocalDate getPreviousPolicyToDt() {
		return previousPolicyToDt;
	}

	public void setPreviousPolicyToDt(LocalDate previousPolicyToDt) {
		this.previousPolicyToDt = previousPolicyToDt;
	}

	public BigDecimal getPreviousPolicySI() {
		return previousPolicySI;
	}

	public void setPreviousPolicySI(BigDecimal previousPolicySI) {
		this.previousPolicySI = previousPolicySI;
	}

	public Integer getPreviousPolicyClaimYN() {
		return previousPolicyClaimYN;
	}

	public void setPreviousPolicyClaimYN(Integer previousPolicyClaimYN) {
		this.previousPolicyClaimYN = previousPolicyClaimYN;
	}

	public String getPreviousPolicyUWYear() {
		return previousPolicyUWYear;
	}

	public void setPreviousPolicyUWYear(String previousPolicyUWYear) {
		this.previousPolicyUWYear = previousPolicyUWYear;
	}

	public Integer getPreviousPolicyNCBPerc() {
		return previousPolicyNCBPerc;
	}

	public void setPreviousPolicyNCBPerc(Integer previousPolicyNCBPerc) {
		this.previousPolicyNCBPerc = previousPolicyNCBPerc;
	}

	public String getPreviousPolicyType() {
		return previousPolicyType;
	}

	public void setPreviousPolicyType(String previousPolicyType) {
		this.previousPolicyType = previousPolicyType;
	}

	public String getNilDepreciationCoverYN() {
		return nilDepreciationCoverYN;
	}

	public void setNilDepreciationCoverYN(String nilDepreciationCoverYN) {
		this.nilDepreciationCoverYN = nilDepreciationCoverYN;
	}

	public Integer getPreviousNilDepreciation() {
		return previousNilDepreciation;
	}

	public void setPreviousNilDepreciation(Integer previousNilDepreciation) {
		this.previousNilDepreciation = previousNilDepreciation;
	}

	public String getRsaCover() {
		return rsaCover;
	}

	public void setRsaCover(String rsaCover) {
		this.rsaCover = rsaCover;
	}

	public String getHypothecationType() {
		return hypothecationType;
	}

	public void setHypothecationType(String hypothecationType) {
		this.hypothecationType = hypothecationType;
	}

	public String getHypothecationBankName() {
		return hypothecationBankName;
	}

	public void setHypothecationBankName(String hypothecationBankName) {
		this.hypothecationBankName = hypothecationBankName;
	}

	public String getHypothecationAddress1() {
		return hypothecationAddress1;
	}

	public void setHypothecationAddress1(String hypothecationAddress1) {
		this.hypothecationAddress1 = hypothecationAddress1;
	}

	public String getHypothecationAddress2() {
		return hypothecationAddress2;
	}

	public void setHypothecationAddress2(String hypothecationAddress2) {
		this.hypothecationAddress2 = hypothecationAddress2;
	}

	public String getHypothecationAddress3() {
		return hypothecationAddress3;
	}

	public void setHypothecationAddress3(String hypothecationAddress3) {
		this.hypothecationAddress3 = hypothecationAddress3;
	}

	public String getHypothecationAgreementNo() {
		return hypothecationAgreementNo;
	}

	public void setHypothecationAgreementNo(String hypothecationAgreementNo) {
		this.hypothecationAgreementNo = hypothecationAgreementNo;
	}

	public String getHypothecationCountry() {
		return hypothecationCountry;
	}

	public void setHypothecationCountry(String hypothecationCountry) {
		this.hypothecationCountry = hypothecationCountry;
	}

	public String getHypothecationState() {
		return hypothecationState;
	}

	public void setHypothecationState(String hypothecationState) {
		this.hypothecationState = hypothecationState;
	}

	public String getHypothecationCity() {
		return hypothecationCity;
	}

	public void setHypothecationCity(String hypothecationCity) {
		this.hypothecationCity = hypothecationCity;
	}

	public String getHypothecationPinCode() {
		return hypothecationPinCode;
	}

	public void setHypothecationPinCode(String hypothecationPinCode) {
		this.hypothecationPinCode = hypothecationPinCode;
	}

	public String getSpecifiedPersonField() {
		return specifiedPersonField;
	}

	public void setSpecifiedPersonField(String specifiedPersonField) {
		this.specifiedPersonField = specifiedPersonField;
	}

	public String getPaOwnerDriverExclusion() {
		return paOwnerDriverExclusion;
	}

	public void setPaOwnerDriverExclusion(String paOwnerDriverExclusion) {
		this.paOwnerDriverExclusion = paOwnerDriverExclusion;
	}

	public String getPaOwnerDriverExReason() {
		return paOwnerDriverExReason;
	}

	public void setPaOwnerDriverExReason(String paOwnerDriverExReason) {
		this.paOwnerDriverExReason = paOwnerDriverExReason;
	}

	public String getCpaInsComp() {
		return cpaInsComp;
	}

	public void setCpaInsComp(String cpaInsComp) {
		this.cpaInsComp = cpaInsComp;
	}

	public LocalDate getCpaPolicyFmDt() {
		return cpaPolicyFmDt;
	}

	public void setCpaPolicyFmDt(LocalDate cpaPolicyFmDt) {
		this.cpaPolicyFmDt = cpaPolicyFmDt;
	}

	public String getCpaPolicyNo() {
		return cpaPolicyNo;
	}

	public void setCpaPolicyNo(String cpaPolicyNo) {
		this.cpaPolicyNo = cpaPolicyNo;
	}

	public LocalDate getCpaPolicyToDt() {
		return cpaPolicyToDt;
	}

	public void setCpaPolicyToDt(LocalDate cpaPolicyToDt) {
		this.cpaPolicyToDt = cpaPolicyToDt;
	}

	public BigDecimal getCpaSumInsured() {
		return cpaSumInsured;
	}

	public void setCpaSumInsured(BigDecimal cpaSumInsured) {
		this.cpaSumInsured = cpaSumInsured;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getEmergencyTranHotelExpRemYN() {
		return emergencyTranHotelExpRemYN;
	}

	public void setEmergencyTranHotelExpRemYN(String emergencyTranHotelExpRemYN) {
		this.emergencyTranHotelExpRemYN = emergencyTranHotelExpRemYN;
	}

	public String getEngProtector() {
		return engProtector;
	}

	public void setEngProtector(String engProtector) {
		this.engProtector = engProtector;
	}

	public String getKeyReplacementYN() {
		return keyReplacementYN;
	}

	public void setKeyReplacementYN(String keyReplacementYN) {
		this.keyReplacementYN = keyReplacementYN;
	}

	public String getDailyExpRemYN() {
		return dailyExpRemYN;
	}

	public void setDailyExpRemYN(String dailyExpRemYN) {
		this.dailyExpRemYN = dailyExpRemYN;
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

	public LocalDate getTpPolFmdt() {
		return tpPolFmdt;
	}

	public void setTpPolFmdt(LocalDate tpPolFmdt) {
		this.tpPolFmdt = tpPolFmdt;
	}

	public String getTpPolNo() {
		return tpPolNo;
	}

	public void setTpPolNo(String tpPolNo) {
		this.tpPolNo = tpPolNo;
	}

	public LocalDate getTpPolTodt() {
		return tpPolTodt;
	}

	public void setTpPolTodt(LocalDate tpPolTodt) {
		this.tpPolTodt = tpPolTodt;
	}

	public String getCkycNo() {
		return ckycNo;
	}

	public void setCkycNo(String ckycNo) {
		this.ckycNo = ckycNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPoiType() {
		return poiType;
	}

	public void setPoiType(String poiType) {
		this.poiType = poiType;
	}

	public String getPoiId() {
		return poiId;
	}

	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getPoaType() {
		return poaType;
	}

	public void setPoaType(String poaType) {
		this.poaType = poaType;
	}

	public String getPoaId() {
		return poaId;
	}

	public void setPoaId(String poaId) {
		this.poaId = poaId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public String getPoiDocumentFile() {
		return poiDocumentFile;
	}

	public void setPoiDocumentFile(String poiDocumentFile) {
		this.poiDocumentFile = poiDocumentFile;
	}

	public String getPoaDocumentFile() {
		return poaDocumentFile;
	}

	public void setPoaDocumentFile(String poaDocumentFile) {
		this.poaDocumentFile = poaDocumentFile;
	}

	public String getInsuredPhoto() {
		return insuredPhoto;
	}

	public void setInsuredPhoto(String insuredPhoto) {
		this.insuredPhoto = insuredPhoto;
	}

	public String getPoiDocumentExt() {
		return poiDocumentExt;
	}

	public void setPoiDocumentExt(String poiDocumentExt) {
		this.poiDocumentExt = poiDocumentExt;
	}

	public String getPoaDocumentExt() {
		return poaDocumentExt;
	}

	public void setPoaDocumentExt(String poaDocumentExt) {
		this.poaDocumentExt = poaDocumentExt;
	}

	public String getInsuredPhotoExt() {
		return insuredPhotoExt;
	}

	public void setInsuredPhotoExt(String insuredPhotoExt) {
		this.insuredPhotoExt = insuredPhotoExt;
	}

	public String getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public String getPccvVehType() {
		return pccvVehType;
	}

	public void setPccvVehType(String pccvVehType) {
		this.pccvVehType = pccvVehType;
	}

	public BigDecimal getGvw() {
		return gvw;
	}

	public void setGvw(BigDecimal gvw) {
		this.gvw = gvw;
	}

	public String getAadharEnrollNo() {
		return aadharEnrollNo;
	}

	public void setAadharEnrollNo(String aadharEnrollNo) {
		this.aadharEnrollNo = aadharEnrollNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public Integer getVehicleAge() {
		return vehicleAge;
	}

	public void setVehicleAge(Integer vehicleAge) {
		this.vehicleAge = vehicleAge;
	}

	public String getVehicleManufactureYear() {
		return vehicleManufactureYear;
	}

	public void setVehicleManufactureYear(String vehicleManufactureYear) {
		this.vehicleManufactureYear = vehicleManufactureYear;
	}

	public Integer getAgeOfOwner() {
		return ageOfOwner;
	}

	public void setAgeOfOwner(Integer ageOfOwner) {
		this.ageOfOwner = ageOfOwner;
	}

	public Integer getAgeOfPaidDriver() {
		return ageOfPaidDriver;
	}

	public void setAgeOfPaidDriver(Integer ageOfPaidDriver) {
		this.ageOfPaidDriver = ageOfPaidDriver;
	}

	public Integer getAgeOfVehicle() {
		return ageOfVehicle;
	}

	public void setAgeOfVehicle(Integer ageOfVehicle) {
		this.ageOfVehicle = ageOfVehicle;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount1() {
		return amount1;
	}

	public void setAmount1(BigDecimal amount1) {
		this.amount1 = amount1;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getCancelOrRefuseRenew() {
		return cancelOrRefuseRenew;
	}

	public void setCancelOrRefuseRenew(String cancelOrRefuseRenew) {
		this.cancelOrRefuseRenew = cancelOrRefuseRenew;
	}

	public String getCaptiveUseYN() {
		return captiveUseYN;
	}

	public void setCaptiveUseYN(String captiveUseYN) {
		this.captiveUseYN = captiveUseYN;
	}

	public String getClaimsLodged() {
		return claimsLodged;
	}

	public void setClaimsLodged(String claimsLodged) {
		this.claimsLodged = claimsLodged;
	}

	public String getCoverLampTyreTubeYN() {
		return coverLampTyreTubeYN;
	}

	public void setCoverLampTyreTubeYN(String coverLampTyreTubeYN) {
		this.coverLampTyreTubeYN = coverLampTyreTubeYN;
	}

	public String getDeTariffDis() {
		return deTariffDis;
	}

	public void setDeTariffDis(String deTariffDis) {
		this.deTariffDis = deTariffDis;
	}

	public LocalDate getDateOfPurchaseOfVehAsPerInvOrSaleLetter() {
		return dateOfPurchaseOfVehAsPerInvOrSaleLetter;
	}

	public void setDateOfPurchaseOfVehAsPerInvOrSaleLetter(LocalDate dateOfPurchaseOfVehAsPerInvOrSaleLetter) {
		this.dateOfPurchaseOfVehAsPerInvOrSaleLetter = dateOfPurchaseOfVehAsPerInvOrSaleLetter;
	}

	public Integer getNoOfCoolies() {
		return noOfCoolies;
	}

	public void setNoOfCoolies(Integer noOfCoolies) {
		this.noOfCoolies = noOfCoolies;
	}

	public Integer getNoOfClaims() {
		return noOfClaims;
	}

	public void setNoOfClaims(Integer noOfClaims) {
		this.noOfClaims = noOfClaims;
	}

	public Integer getNoOfClaims1() {
		return noOfClaims1;
	}

	public void setNoOfClaims1(Integer noOfClaims1) {
		this.noOfClaims1 = noOfClaims1;
	}

	public Integer getNoOfDccForPA() {
		return noOfDccForPA;
	}

	public void setNoOfDccForPA(Integer noOfDccForPA) {
		this.noOfDccForPA = noOfDccForPA;
	}

	public Integer getNoOfTrailers() {
		return noOfTrailers;
	}

	public void setNoOfTrailers(Integer noOfTrailers) {
		this.noOfTrailers = noOfTrailers;
	}

	public String getPuccNo() {
		return puccNo;
	}

	public void setPuccNo(String puccNo) {
		this.puccNo = puccNo;
	}

	public String getPuccState() {
		return puccState;
	}

	public void setPuccState(String puccState) {
		this.puccState = puccState;
	}

	public String getPuccYN() {
		return puccYN;
	}

	public void setPuccYN(String puccYN) {
		this.puccYN = puccYN;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getSpeedometerReading() {
		return speedometerReading;
	}

	public void setSpeedometerReading(String speedometerReading) {
		this.speedometerReading = speedometerReading;
	}

	public String getTdChassisNo() {
		return tdChassisNo;
	}

	public void setTdChassisNo(String tdChassisNo) {
		this.tdChassisNo = tdChassisNo;
	}

	public String getTdRegNo() {
		return tdRegNo;
	}

	public void setTdRegNo(String tdRegNo) {
		this.tdRegNo = tdRegNo;
	}

	public String getTransferOfOwner() {
		return transferOfOwner;
	}

	public void setTransferOfOwner(String transferOfOwner) {
		this.transferOfOwner = transferOfOwner;
	}

	public String getTrailerVehicleCode() {
		return trailerVehicleCode;
	}

	public void setTrailerVehicleCode(String trailerVehicleCode) {
		this.trailerVehicleCode = trailerVehicleCode;
	}

	public String getUseOfVehIsLimitedOwnPremisesYN() {
		return useOfVehIsLimitedOwnPremisesYN;
	}

	public void setUseOfVehIsLimitedOwnPremisesYN(String useOfVehIsLimitedOwnPremisesYN) {
		this.useOfVehIsLimitedOwnPremisesYN = useOfVehIsLimitedOwnPremisesYN;
	}

	public LocalDate getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}

	public String getVehFitWithTublessTyresYN() {
		return vehFitWithTublessTyresYN;
	}

	public void setVehFitWithTublessTyresYN(String vehFitWithTublessTyresYN) {
		this.vehFitWithTublessTyresYN = vehFitWithTublessTyresYN;
	}

	public String getVehFittedWithFGTankYN() {
		return vehFittedWithFGTankYN;
	}

	public void setVehFittedWithFGTankYN(String vehFittedWithFGTankYN) {
		this.vehFittedWithFGTankYN = vehFittedWithFGTankYN;
	}

	public String getVehParkedDuringNight() {
		return vehParkedDuringNight;
	}

	public void setVehParkedDuringNight(String vehParkedDuringNight) {
		this.vehParkedDuringNight = vehParkedDuringNight;
	}

	public String getNatureOfGoods() {
		return natureOfGoods;
	}

	public void setNatureOfGoods(String natureOfGoods) {
		this.natureOfGoods = natureOfGoods;
	}

	public String getIndemnityToHirerYN() {
		return indemnityToHirerYN;
	}

	public void setIndemnityToHirerYN(String indemnityToHirerYN) {
		this.indemnityToHirerYN = indemnityToHirerYN;
	}

	public String getShriMotorProtectionYN() {
		return shriMotorProtectionYN;
	}

	public void setShriMotorProtectionYN(String shriMotorProtectionYN) {
		this.shriMotorProtectionYN = shriMotorProtectionYN;
	}

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardValidUpTo() {
		return cardValidUpTo;
	}

	public void setCardValidUpTo(String cardValidUpTo) {
		this.cardValidUpTo = cardValidUpTo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

	public String getChequeClearType() {
		return chequeClearType;
	}

	public void setChequeClearType(String chequeClearType) {
		this.chequeClearType = chequeClearType;
	}

	public String getCashType() {
		return cashType;
	}

	public void setCashType(String cashType) {
		this.cashType = cashType;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getVehicleRegno() {
		return vehicleRegno;
	}

	public void setVehicleRegno(String vehicleRegno) {
		this.vehicleRegno = vehicleRegno;
	}

	public String getVehicleRequest() {
		return vehicleRequest;
	}

	public void setVehicleRequest(String vehicleRequest) {
		this.vehicleRequest = vehicleRequest;
	}

	public String getVehicleResponse() {
		return vehicleResponse;
	}

	public void setVehicleResponse(String vehicleResponse) {
		this.vehicleResponse = vehicleResponse;
	}

	public String getError_Desc() {
		return Error_Desc;
	}

	public void setError_Desc(String error_Desc) {
		Error_Desc = error_Desc;
	}
	
   
	
}
