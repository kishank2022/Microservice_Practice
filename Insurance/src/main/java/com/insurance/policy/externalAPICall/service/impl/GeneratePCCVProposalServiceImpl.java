package com.insurance.policy.externalAPICall.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.policy.dto.GeneratePCCVProposalRequestDto;
import com.insurance.policy.dto.GeneratePCCVProposalResponseDto;
import com.insurance.policy.entity.InsuranceMotorEntity;
import com.insurance.policy.externalAPICall.service.GeneratePCCVProposalService;
import com.insurance.policy.repository.InsuranceMotorRepository;


@Service
public class GeneratePCCVProposalServiceImpl implements GeneratePCCVProposalService{

	private static final Logger L   = Logger.getLogger(GeneratePCCVProposalServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	private final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
	
	@Autowired
	private InsuranceMotorRepository insuranceMotorRepository;
	
	public GeneratePCCVProposalResponseDto generatePCCVProposal(GeneratePCCVProposalRequestDto requestDto) {
		
		
		// save data in database
		InsuranceMotorEntity insuranceMotorEntity = new InsuranceMotorEntity();

		insuranceMotorEntity.setRequest_name("pccv_proposal");
		insuranceMotorEntity.setPolicyType(requestDto.getObjPolicyEntryETT().getPolType());
		insuranceMotorEntity.setPhysical_policy(requestDto.getObjPolicyEntryETT().getPhysical_policy());

		L.info("getReferenceNo>>>" + requestDto.getObjPolicyEntryETT().getReferenceNo());

		insuranceMotorEntity.setReferenceNo(requestDto.getObjPolicyEntryETT().getReferenceNo());
		L.info("getProdCode>>>" + requestDto.getObjPolicyEntryETT().getProdCode());
		insuranceMotorEntity.setProdCode(requestDto.getObjPolicyEntryETT().getProdCode());

		if (!requestDto.getObjPolicyEntryETT().getPolicyFromDt().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPolicyFromDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getPolicyFromDt(), inputFormatter);
			L.info("getPolicyFromDt>>>" + localDate);
			insuranceMotorEntity.setPolicyFromDt(localDate);
		}

		if (!requestDto.getObjPolicyEntryETT().getPolicyToDt().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPolicyToDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getPolicyToDt(), inputFormatter);
			L.info("getPolicyToDt>>>" + localDate);
			insuranceMotorEntity.setPolicyToDt(localDate);
		}

//				insuranceMotorEntity.setPolicyToDt(LocalDate.parse(requestDto.getObjPolicyEntryETT().getPolicyToDt(), dateFormatter));

		if (!requestDto.getObjPolicyEntryETT().getPolicyIssueDt().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPolicyIssueDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getPolicyIssueDt(), inputFormatter);
			L.info("getPolicyIssueDt>>>" + localDate);
			insuranceMotorEntity.setPolicyIssueDt(localDate);
		}

//				insuranceMotorEntity.setPolicyIssueDt(LocalDate.parse(requestDto.getObjPolicyEntryETT().getPolicyIssueDt(), dateFormatter));
		insuranceMotorEntity.setInsuredPrefix(requestDto.getObjPolicyEntryETT().getInsuredPrefix());
		insuranceMotorEntity.setInsuredName(requestDto.getObjPolicyEntryETT().getInsuredName());
		insuranceMotorEntity.setGender(requestDto.getObjPolicyEntryETT().getGender());
		insuranceMotorEntity.setAddress1(requestDto.getObjPolicyEntryETT().getAddress1());
		insuranceMotorEntity.setAddress2(requestDto.getObjPolicyEntryETT().getAddress2());
		insuranceMotorEntity.setAddress3(requestDto.getObjPolicyEntryETT().getAddress3());
		insuranceMotorEntity.setState(requestDto.getObjPolicyEntryETT().getState());
		insuranceMotorEntity.setCity(requestDto.getObjPolicyEntryETT().getCity());
		insuranceMotorEntity.setPinCode(requestDto.getObjPolicyEntryETT().getPinCode());
		insuranceMotorEntity.setPanNo(requestDto.getObjPolicyEntryETT().getPanNo());
		insuranceMotorEntity.setGstNo(requestDto.getObjPolicyEntryETT().getGSTNo());
		insuranceMotorEntity.setMobileNo(requestDto.getObjPolicyEntryETT().getMobileNo());
		insuranceMotorEntity.setTelephoneNo(requestDto.getObjPolicyEntryETT().getTelephoneNo());
		insuranceMotorEntity.setProposalType(requestDto.getObjPolicyEntryETT().getProposalType());
//		insuranceMotorEntity.setPolicyType("");

		if (!requestDto.getObjPolicyEntryETT().getDateOfBirth().isBlank()
				&& requestDto.getObjPolicyEntryETT().getDateOfBirth() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getDateOfBirth(), inputFormatter);
			L.info("getDateOfBirth>>>" + localDate);
			insuranceMotorEntity.setDateOfBirth(localDate);
		}
//				insuranceMotorEntity.setDateOfBirth(LocalDate.parse(requestDto.getObjPolicyEntryETT().getDateOfBirth(), dateFormatter));
		insuranceMotorEntity.setFaxNo(requestDto.getObjPolicyEntryETT().getFaxNo());
		insuranceMotorEntity.setEmailId(requestDto.getObjPolicyEntryETT().getEmailID());
		insuranceMotorEntity.setPosAgentName(requestDto.getObjPolicyEntryETT().getPOSAgentName());
		insuranceMotorEntity.setPosAgentPanNo(requestDto.getObjPolicyEntryETT().getPOSAgentPanNo());
		insuranceMotorEntity.setCoverNoteNo(requestDto.getObjPolicyEntryETT().getCoverNoteNo());

		if (!requestDto.getObjPolicyEntryETT().getCoverNoteDt().isBlank()
				&& requestDto.getObjPolicyEntryETT().getCoverNoteDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getCoverNoteDt(), inputFormatter);
			L.info("getCoverNoteDt>>>" + localDate);
			insuranceMotorEntity.setCoverNoteDt(localDate);
		}
//				insuranceMotorEntity.setCoverNoteDt(LocalDate.parse(requestDto.getObjPolicyEntryETT().getCoverNoteDt(), dateFormatter));

		insuranceMotorEntity.setVehicleCode(requestDto.getObjPolicyEntryETT().getVehicleCode());

		if (!requestDto.getObjPolicyEntryETT().getFirstRegDt().isBlank()
				&& requestDto.getObjPolicyEntryETT().getFirstRegDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getFirstRegDt(), inputFormatter);
			L.info("getCoverNoteDt>>>" + localDate);
			insuranceMotorEntity.setFirstRegDt(localDate);
		}
//				insuranceMotorEntity.setFirstRegDt(requestDto.getObjPolicyEntryETT().getFirstRegDt());

		insuranceMotorEntity.setVehicleType(requestDto.getObjPolicyEntryETT().getVehicleType());
		insuranceMotorEntity.setEngineNo(requestDto.getObjPolicyEntryETT().getEngineNo());
		insuranceMotorEntity.setChassisNo(requestDto.getObjPolicyEntryETT().getChassisNo());
		insuranceMotorEntity.setRegNo1(requestDto.getObjPolicyEntryETT().getRegNo1());
		insuranceMotorEntity.setRegNo2(requestDto.getObjPolicyEntryETT().getRegNo2());
		insuranceMotorEntity.setRegNo3(requestDto.getObjPolicyEntryETT().getRegNo3());
		insuranceMotorEntity.setRegNo4(requestDto.getObjPolicyEntryETT().getRegNo4());
		insuranceMotorEntity.setRtoCode(requestDto.getObjPolicyEntryETT().getRTOCode());

		if (!requestDto.getObjPolicyEntryETT().getIDV_of_Vehicle().isBlank()
				&& requestDto.getObjPolicyEntryETT().getIDV_of_Vehicle() != null) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjPolicyEntryETT().getIDV_of_Vehicle().trim());
			L.info("idvOfVehicle>>>" + idvOfVehicle);
			insuranceMotorEntity.setIdvOfVehicle(idvOfVehicle);
		}
//				insuranceMotorEntity.setIdvOfVehicle(requestDto.getObjPolicyEntryETT().getIDV_of_Vehicle());
		insuranceMotorEntity.setColour(requestDto.getObjPolicyEntryETT().getColour());

		if (!requestDto.getObjPolicyEntryETT().getVoluntaryExcess().isBlank()
				&& requestDto.getObjPolicyEntryETT().getVoluntaryExcess() != null) {
			Integer VoluntaryExcess = Integer.parseInt(requestDto.getObjPolicyEntryETT().getVoluntaryExcess().trim());
			L.info("VoluntaryExcess>>>" + VoluntaryExcess);
			insuranceMotorEntity.setVoluntaryExcess(VoluntaryExcess);
		}
//				insuranceMotorEntity.setVoluntaryExcess(requestDto.getObjPolicyEntryETT().getVoluntaryExcess());

		if (!requestDto.getObjPolicyEntryETT().getNoEmpCoverLL().isBlank()
				&& requestDto.getObjPolicyEntryETT().getNoEmpCoverLL() != null) {
			Integer NoEmpCoverLL = Integer.parseInt(requestDto.getObjPolicyEntryETT().getNoEmpCoverLL().trim());
			L.info("NoEmpCoverLL>>>" + NoEmpCoverLL);
			insuranceMotorEntity.setNoEmpCoverLL(NoEmpCoverLL);
		}
//				insuranceMotorEntity.setNoEmpCoverLL(requestDto.getObjPolicyEntryETT().getNoEmpCoverLL());

		if (!requestDto.getObjPolicyEntryETT().getNoOfCleaner().isBlank()
				&& requestDto.getObjPolicyEntryETT().getNoOfCleaner() != null) {
			Integer idvOfVehicle = Integer.parseInt(requestDto.getObjPolicyEntryETT().getNoOfCleaner());
			L.info("getNoOfCleaner>>>" + idvOfVehicle);
			insuranceMotorEntity.setNoOfCleaner(idvOfVehicle);
		}
//				insuranceMotorEntity.setNoOfCleaner(requestDto.getObjPolicyEntryETT().getNoOfCleaner());

		if (!requestDto.getObjPolicyEntryETT().getNoOfDriver().isBlank()
				&& requestDto.getObjPolicyEntryETT().getNoOfDriver() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjPolicyEntryETT().getNoOfDriver().trim());
			L.info("getNoOfDriver>>>" + getNoOfDriver);
			insuranceMotorEntity.setNoOfDriver(getNoOfDriver);
		}
//				insuranceMotorEntity.setNoOfDriver(requestDto.getObjPolicyEntryETT().getNoOfDriver());

		if (!requestDto.getObjPolicyEntryETT().getNoOfConductor().isBlank()
				&& requestDto.getObjPolicyEntryETT().getNoOfConductor() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjPolicyEntryETT().getNoOfConductor().trim());
			L.info("getNoOfDriver>>>" + getNoOfDriver);
			insuranceMotorEntity.setNoOfConductor(getNoOfDriver);
		}
//				insuranceMotorEntity.setNoOfConductor(requestDto.getObjPolicyEntryETT().getNoOfConductor());
		insuranceMotorEntity.setVehicleMadeinindiaYN(requestDto.getObjPolicyEntryETT().getVehicleMadeinindiaYN());
		insuranceMotorEntity.setVehiclePurposeYN(requestDto.getObjPolicyEntryETT().getVehiclePurposeYN());
		insuranceMotorEntity.setNfppEmployees(requestDto.getObjPolicyEntryETT().getNFPP_Employees());
		insuranceMotorEntity.setNfppOthThanEmp(requestDto.getObjPolicyEntryETT().getNFPP_OthThanEmp());
		insuranceMotorEntity.setLimitOwnPremiseYN(requestDto.getObjPolicyEntryETT().getLimitOwnPremiseYN());

		if (requestDto.getObjPolicyEntryETT().getBangladesh() != null) {
			Integer getNoOfDriver = requestDto.getObjPolicyEntryETT().getBangladesh();
			L.info("getBangladesh>>>" + getNoOfDriver);
			insuranceMotorEntity.setBangladesh(getNoOfDriver);
		}
//				insuranceMotorEntity.setBangladesh(requestDto.getObjPolicyEntryETT().getBangladesh());

		if (requestDto.getObjPolicyEntryETT().getBhutan() != null) {
			Integer getNoOfDriver = requestDto.getObjPolicyEntryETT().getBhutan();
			L.info("getBhutan>>>" + getNoOfDriver);
			insuranceMotorEntity.setBhutan(getNoOfDriver);
		}
//				insuranceMotorEntity.setBhutan(requestDto.getObjPolicyEntryETT().getBhutan());

		if (requestDto.getObjPolicyEntryETT().getSrilanka() != null) {
			Integer getNoOfDriver = requestDto.getObjPolicyEntryETT().getSrilanka();
			L.info("getSriLanka>>>" + getNoOfDriver);
			insuranceMotorEntity.setSriLanka(getNoOfDriver);
		}
//				insuranceMotorEntity.setSriLanka(requestDto.getObjPolicyEntryETT().getSriLanka());

		if (requestDto.getObjPolicyEntryETT().getNepal() != null) {
			Integer getNoOfDriver = requestDto.getObjPolicyEntryETT().getNepal();
			L.info("getNepal>>>" + getNoOfDriver);
			insuranceMotorEntity.setNepal(getNoOfDriver);
		}
//				insuranceMotorEntity.setNepal(requestDto.getObjPolicyEntryETT().getNepal());

		if (requestDto.getObjPolicyEntryETT().getPakistan() != null) {
			Integer getNoOfDriver = requestDto.getObjPolicyEntryETT().getPakistan();
			L.info("getPakistan>>>" + getNoOfDriver);
			insuranceMotorEntity.setPakistan(getNoOfDriver);
		}
//				insuranceMotorEntity.setPakistan(requestDto.getObjPolicyEntryETT().getPakistan());

		if (requestDto.getObjPolicyEntryETT().getMaldives() != null) {
			Integer getNoOfDriver = requestDto.getObjPolicyEntryETT().getMaldives();
			L.info("getMaldives>>>" + getNoOfDriver);
			insuranceMotorEntity.setMaldives(getNoOfDriver);
		}
//				insuranceMotorEntity.setMaldives(requestDto.getObjPolicyEntryETT().setMaldives());

		insuranceMotorEntity.setCngKitYN(requestDto.getObjPolicyEntryETT().getCNGKitYN());

		if (requestDto.getObjPolicyEntryETT().getCNGKitSI() != null) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjPolicyEntryETT().getCNGKitSI());
			L.info("getCNGKitSI>>>" + idvOfVehicle);
			insuranceMotorEntity.setCngKitSI(idvOfVehicle);
		}
//				insuranceMotorEntity.setCngKitSI(requestDto.getObjPolicyEntryETT().getCNGKitSI());

//				if(!requestDto.getObjPolicyEntryETT().getInBuiltCNGKit().isBlank() && requestDto.getObjPolicyEntryETT().getInBuiltCNGKit()!=null) {
//					Integer getNoOfDriver = Integer.parseInt(requestDto.getObjPolicyEntryETT().getInBuiltCNGKit().trim());
//					L.info("getInBuiltCNGKit>>>"+getNoOfDriver);
//					insuranceMotorEntity.setInBuiltCNGKit(getNoOfDriver);			
//				}
		insuranceMotorEntity.setInBuiltCNGKit(requestDto.getObjPolicyEntryETT().getInBuiltCNGKit());

		if (requestDto.getObjPolicyEntryETT().getLimitedTPPDYN() != null) {
			Integer getNoOfDriver = requestDto.getObjPolicyEntryETT().getLimitedTPPDYN();
			L.info("getLimitedTPPDYN>>>" + getNoOfDriver);
			insuranceMotorEntity.setLimitedTPPDYN(getNoOfDriver);
		}
//				insuranceMotorEntity.setLimitedTPPDYN(requestDto.getObjPolicyEntryETT().getLimitedTPPDYN());
		if (requestDto.getObjPolicyEntryETT().getDeTariff() != null && !requestDto.getObjPolicyEntryETT().getDeTariff().isBlank()) {
			String getDeTariff = requestDto.getObjPolicyEntryETT().getDeTariff();
			L.info("getDeTariff>>>" + getDeTariff);
			insuranceMotorEntity.setDeTariff(Integer.parseInt(getDeTariff));
		}
//		insuranceMotorEntity.setDeTariff(requestDto.getObjPolicyEntryETT().getDeTariff());
		insuranceMotorEntity.setImt23YN(requestDto.getObjPolicyEntryETT().getIMT23YN());
		insuranceMotorEntity.setBreakIn(requestDto.getObjPolicyEntryETT().getBreakIn());
		insuranceMotorEntity.setPreInspectionReportYN(requestDto.getObjPolicyEntryETT().getPreInspectionReportYN());
		insuranceMotorEntity.setPreInspection(requestDto.getObjPolicyEntryETT().getPreInspection());
		insuranceMotorEntity.setFitnessCertificateno(requestDto.getObjPolicyEntryETT().getFitnessCertificateno());

		if (!requestDto.getObjPolicyEntryETT().getFitnessValidupto().isBlank()
				&& requestDto.getObjPolicyEntryETT().getFitnessValidupto() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getFitnessValidupto(),
					inputFormatter);
			L.info("getFitnessValidupto>>>" + localDate);
			insuranceMotorEntity.setFitnessValidupto(localDate);
		}
//				insuranceMotorEntity.setFitnessValidupto(requestDto.getObjPolicyEntryETT().getFitnessValidupto());
		insuranceMotorEntity.setVehPermit(requestDto.getObjPolicyEntryETT().getVehPermit());
		insuranceMotorEntity.setPermitNo(requestDto.getObjPolicyEntryETT().getPermitNo());
		
		if (requestDto.getObjPolicyEntryETT().getPAforUnnamedPassengerYN() != null && !requestDto.getObjPolicyEntryETT().getPAforUnnamedPassengerYN().isBlank()) {
			Integer getPAforUnnamedPassengerYN = Integer.parseInt(requestDto.getObjPolicyEntryETT().getPAforUnnamedPassengerYN());
			L.info("getPAforUnnamedPassengerYN>>>" + getPAforUnnamedPassengerYN);
			insuranceMotorEntity.setPaForUnnamedPassengerYN(getPAforUnnamedPassengerYN);
		}
//		insuranceMotorEntity.setPaForUnnamedPassengerYN(requestDto.getObjPolicyEntryETT().getPAforUnnamedPassengerYN());

		if (requestDto.getObjPolicyEntryETT().getPAforUnnamedPassengerSI() != null && !requestDto.getObjPolicyEntryETT().getPAforUnnamedPassengerSI().isBlank()) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjPolicyEntryETT().getPAforUnnamedPassengerSI());
			L.info("setPaForUnnamedPassengerSI>>>" + idvOfVehicle);
			insuranceMotorEntity.setPaForUnnamedPassengerSI(idvOfVehicle);
		}
//				insuranceMotorEntity.setPaForUnnamedPassengerSI(requestDto.getObjPolicyEntryETT().setPaForUnnamedPassengerSI());
		insuranceMotorEntity
				.setElectricalaccessYN(String.valueOf(requestDto.getObjPolicyEntryETT().getElectricalaccessYN()));

		if(requestDto.getObjPolicyEntryETT().getElectricalaccessSI()!=null && !requestDto.getObjPolicyEntryETT().getElectricalaccessSI().isBlank()) {
			insuranceMotorEntity.setElectricalaccessSI(new BigDecimal(requestDto.getObjPolicyEntryETT().getElectricalaccessSI()));
		}	
		
		insuranceMotorEntity.setElectricalaccessRemarks(requestDto.getObjPolicyEntryETT().getElectricalaccessRemarks());
		insuranceMotorEntity
				.setNonElectricalaccessYN(String.valueOf(requestDto.getObjPolicyEntryETT().getNonElectricalaccessYN()));
		insuranceMotorEntity.setNonElectricalaccessSI(  
				new BigDecimal(requestDto.getObjPolicyEntryETT().getNonElectricalaccessSI()));
//				insuranceMotorEntity.setNonElectricalaccessSI(requestDto.getObjPolicyEntryETT().getNonElectricalaccessSI());
		insuranceMotorEntity
				.setNonElectricalaccessRemarks(requestDto.getObjPolicyEntryETT().getNonElectricalaccessRemarks());
		
		if (requestDto.getObjPolicyEntryETT().getPAPaidDriverConductorCleanerYN() != null && !requestDto.getObjPolicyEntryETT().getPAPaidDriverConductorCleanerYN().isBlank()) {
			Integer getPAPaidDriverConductorCleanerYN = Integer.parseInt(requestDto.getObjPolicyEntryETT().getPAPaidDriverConductorCleanerYN());
			L.info("getPAPaidDriverConductorCleanerYN>>>" + getPAPaidDriverConductorCleanerYN);
			insuranceMotorEntity.setPaPaidDriverConductorCleanerYN(getPAPaidDriverConductorCleanerYN);
		}
//		insuranceMotorEntity.setPaPaidDriverConductorCleanerYN(	requestDto.getObjPolicyEntryETT().getPAPaidDriverConductorCleanerYN());
		insuranceMotorEntity.setPaPaidDriverConductorCleanerSI(
				new BigDecimal(requestDto.getObjPolicyEntryETT().getPAPaidDriverConductorCleanerSI()));
//				insuranceMotorEntity.setPaPaidDriverConductorCleanerSI(requestDto.getObjPolicyEntryETT().getPAPaidDriverConductorCleanerSI());

		if (!requestDto.getObjPolicyEntryETT().getPAPaidDriverCount().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPAPaidDriverCount() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjPolicyEntryETT().getPAPaidDriverCount());
			L.info("getPAPaidDriverCount>>>" + localDate);
			insuranceMotorEntity.setPaPaidDriverCount(localDate);
		}
//				insuranceMotorEntity.setPaPaidDriverCount(requestDto.getObjPolicyEntryETT().getPAPaidDriverCount());

		if (!requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount());
			L.info("getPAPaidCleanerCount>>>" + localDate);
			insuranceMotorEntity.setPaPaidConductorCount(localDate);
		}
//				insuranceMotorEntity.setPaPaidConductorCount(requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount());

		if (!requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount());
			L.info("getPAPaidCleanerCount>>>" + localDate);
			insuranceMotorEntity.setPaPaidCleanerCount(localDate);
		}
//				insuranceMotorEntity.setPaPaidCleanerCount(requestDto.getObjPolicyEntryETT().getPAPaidCleanerCount());

		insuranceMotorEntity
				.setNomineeNameforPAOwnerDriver(requestDto.getObjPolicyEntryETT().getNomineeNameforPAOwnerDriver());

		if (!requestDto.getObjPolicyEntryETT().getNomineeAgeforPAOwnerDriver().isBlank()
				&& requestDto.getObjPolicyEntryETT().getNomineeAgeforPAOwnerDriver() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjPolicyEntryETT().getNomineeAgeforPAOwnerDriver());
			L.info("getNomineeAgeforPAOwnerDriver>>>" + localDate);
			insuranceMotorEntity.setNomineeAgeforPAOwnerDriver(localDate);
		}
//				insuranceMotorEntity.setNomineeAgeforPAOwnerDriver(requestDto.getObjPolicyEntryETT().getNomineeAgeforPAOwnerDriver());
		insuranceMotorEntity.setNomineeRelationforPAOwnerDriver(
				requestDto.getObjPolicyEntryETT().getNomineeRelationforPAOwnerDriver());
		insuranceMotorEntity
				.setAppointeeNameforPAOwnerDriver(requestDto.getObjPolicyEntryETT().getAppointeeNameforPAOwnerDriver());
		insuranceMotorEntity.setAppointeeRelationforPAOwnerDriver(
				requestDto.getObjPolicyEntryETT().getAppointeeRelationforPAOwnerDriver());

		if (requestDto.getObjPolicyEntryETT().getLLtoPaidDriverYN() != null) {
			Integer localDate = requestDto.getObjPolicyEntryETT().getLLtoPaidDriverYN();
			L.info("getNomineeAgeforPAOwnerDriver>>>" + localDate);
			insuranceMotorEntity.setLlToPaidDriverYN(localDate);
		}
//				insuranceMotorEntity.setLlToPaidDriverYN(requestDto.getObjPolicyEntryETT().getLLtoPaidDriverYN());
		insuranceMotorEntity.setAntiTheftYN(requestDto.getObjPolicyEntryETT().getAntiTheftYN());
		insuranceMotorEntity.setPreviousPolicyNo(requestDto.getObjPolicyEntryETT().getPreviousPolicyNo());
		insuranceMotorEntity.setPreviousInsurer(requestDto.getObjPolicyEntryETT().getPreviousInsurer());

		if (!requestDto.getObjPolicyEntryETT().getPreviousPolicyFromDt().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPreviousPolicyFromDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getPreviousPolicyFromDt(),
					inputFormatter);
			L.info("getPreviousPolicyFromDt>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyFromDt(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyFromDt(requestDto.getObjPolicyEntryETT().getPreviousPolicyFromDt());

		if (!requestDto.getObjPolicyEntryETT().getPreviousPolicyToDt().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPreviousPolicyToDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getPreviousPolicyToDt(),
					inputFormatter);
			L.info("getPreviousPolicyToDt>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyToDt(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyToDt(requestDto.getObjPolicyEntryETT().getPreviousPolicyToDt());

		if (requestDto.getObjPolicyEntryETT().getPreviousPolicySI() != null
				&& !requestDto.getObjPolicyEntryETT().getPreviousPolicySI().isBlank()) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjPolicyEntryETT().getPreviousPolicySI());
			L.info("getPreviousPolicySI>>>" + idvOfVehicle);
			insuranceMotorEntity.setPreviousPolicySI(idvOfVehicle);
		}
//				insuranceMotorEntity.setPreviousPolicySI(requestDto.getObjPolicyEntryETT().getPreviousPolicySI());

		if (!requestDto.getObjPolicyEntryETT().getPreviousPolicyClaimYN().isBlank()
				&& requestDto.getObjPolicyEntryETT().getPreviousPolicyClaimYN() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjPolicyEntryETT().getPreviousPolicyClaimYN());
			L.info("getPreviousPolicyClaimYN>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyClaimYN(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyClaimYN(requestDto.getObjPolicyEntryETT().getPreviousPolicyClaimYN());

		insuranceMotorEntity.setPreviousPolicyUWYear(requestDto.getObjPolicyEntryETT().getPreviousPolicyUWYear());

		if (requestDto.getObjPolicyEntryETT().getPreviousPolicyNCBPerc() != null) {
			Integer localDate = requestDto.getObjPolicyEntryETT().getPreviousPolicyNCBPerc();
			L.info("getPreviousPolicyNCBPerc>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyNCBPerc(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyNCBPerc(requestDto.getObjPolicyEntryETT().getPreviousPolicyNCBPerc());
		insuranceMotorEntity.setPreviousPolicyType(requestDto.getObjPolicyEntryETT().getPreviousPolicyType());
		insuranceMotorEntity.setNilDepreciationCoverYN(requestDto.getObjPolicyEntryETT().getNilDepreciationCoverYN());

		if (requestDto.getObjPolicyEntryETT().getPreviousNilDepreciation() != null) {
			Integer localDate = requestDto.getObjPolicyEntryETT().getPreviousNilDepreciation();
			L.info("getPreviousNilDepreciation>>>" + localDate);
			insuranceMotorEntity.setPreviousNilDepreciation(localDate);
		}
//				insuranceMotorEntity.setPreviousNilDepreciation(requestDto.getObjPolicyEntryETT().getPreviousNilDepreciation());
		insuranceMotorEntity.setRsaCover(requestDto.getObjPolicyEntryETT().getRSACover());
		insuranceMotorEntity.setHypothecationType(requestDto.getObjPolicyEntryETT().getHypothecationType());
		insuranceMotorEntity.setHypothecationBankName(requestDto.getObjPolicyEntryETT().getHypothecationBankName());
		insuranceMotorEntity.setHypothecationAddress1(requestDto.getObjPolicyEntryETT().getHypothecationAddress1());
		insuranceMotorEntity.setHypothecationAddress2(requestDto.getObjPolicyEntryETT().getHypothecationAddress2());
		insuranceMotorEntity.setHypothecationAddress3(requestDto.getObjPolicyEntryETT().getHypothecationAddress3());
		insuranceMotorEntity
				.setHypothecationAgreementNo(requestDto.getObjPolicyEntryETT().getHypothecationAgreementNo());
		insuranceMotorEntity.setHypothecationCountry(requestDto.getObjPolicyEntryETT().getHypothecationCountry());
		insuranceMotorEntity.setHypothecationState(requestDto.getObjPolicyEntryETT().getHypothecationState());
		insuranceMotorEntity.setHypothecationCity(requestDto.getObjPolicyEntryETT().getHypothecationCity());
		insuranceMotorEntity.setHypothecationPinCode(requestDto.getObjPolicyEntryETT().getHypothecationPinCode());
		insuranceMotorEntity.setSpecifiedPersonField(requestDto.getObjPolicyEntryETT().getSpecifiedPersonField());
		insuranceMotorEntity.setPaOwnerDriverExclusion(requestDto.getObjPolicyEntryETT().getPAOwnerDriverExclusion());
		insuranceMotorEntity.setPaOwnerDriverExReason(requestDto.getObjPolicyEntryETT().getPAOwnerDriverExReason());
		insuranceMotorEntity.setCpaInsComp("");

		// getCPAPolicyFmDt is not present in PCCV Proposal
//		if (!requestDto.getObjPolicyEntryETT().getCPAPolicyFmDt().isBlank()
//				&& requestDto.getObjPolicyEntryETT().getCPAPolicyFmDt() != null) {
//			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getCPAPolicyFmDt(), inputFormatter);
//			L.info("getCPAPolicyFmDt>>>" + localDate);
//			insuranceMotorEntity.setCpaPolicyFmDt(localDate);
//		}
//				insuranceMotorEntity.setCpaPolicyFmDt(requestDto.getObjPolicyEntryETT().getCPAPolicyFmDt());

		// getCPAPolicyNo is not present in PCCV Proposal
//		insuranceMotorEntity.setCpaPolicyNo(requestDto.getObjPolicyEntryETT().getCPAPolicyNo());

		// getCPAPolicyToDt is not present in PCCV Proposal
//		if (!requestDto.getObjPolicyEntryETT().getCPAPolicyToDt().isBlank()
//				&& requestDto.getObjPolicyEntryETT().getCPAPolicyToDt() != null) {
//			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getCPAPolicyToDt(), inputFormatter);
//			L.info("getCPAPolicyToDt>>>" + localDate);
//			insuranceMotorEntity.setCpaPolicyToDt(localDate);
//		}
//				insuranceMotorEntity.setCpaPolicyToDt(requestDto.getObjPolicyEntryETT().getCPAPolicyToDt());

		// getCPASumInsured is not present in PCCV Proposal
//		if (requestDto.getObjPolicyEntryETT().getCPASumInsured() != null
//				&& !requestDto.getObjPolicyEntryETT().getCPASumInsured().isBlank()) {
//			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjPolicyEntryETT().getCPASumInsured());
//			L.info("getCPASumInsured>>>" + idvOfVehicle);
//			insuranceMotorEntity.setCpaSumInsured(idvOfVehicle);
//		}
//				insuranceMotorEntity.setCpaSumInsured(requestDto.getObjPolicyEntryETT().getCPASumInsured());
//		insuranceMotorEntity.setConsumables(requestDto.getObjPolicyEntryETT().getConsumables());
//		insuranceMotorEntity.setEmergencyTranHotelExpRemYN(requestDto.getObjPolicyEntryETT().getEmergencyTranHotelExpRemYN());
//		insuranceMotorEntity.setEngProtector(requestDto.getObjPolicyEntryETT().getEng_Protector());
//		insuranceMotorEntity.setKeyReplacementYN(requestDto.getObjPolicyEntryETT().getKeyReplacementYN());
//		insuranceMotorEntity.setDailyExpRemYN(requestDto.getObjPolicyEntryETT().getDailyExpRemYN());
//		insuranceMotorEntity.setTpPolAddr(requestDto.getObjPolicyEntryETT().getTpPolAddr());
//		insuranceMotorEntity.setTpPolComp(requestDto.getObjPolicyEntryETT().getTpPolComp());

//		if (!requestDto.getObjPolicyEntryETT().getTpPolFmdt().isBlank()
//				&& requestDto.getObjPolicyEntryETT().getTpPolFmdt() != null) {
//			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getTpPolFmdt(), inputFormatter);
//			L.info("getTpPolFmdt>>>" + localDate);
//			insuranceMotorEntity.setTpPolFmdt(localDate);
//		}
//				insuranceMotorEntity.setTpPolFmdt(requestDto.getObjPolicyEntryETT().getTpPolFmdt());

//		insuranceMotorEntity.setTpPolNo(requestDto.getObjPolicyEntryETT().getTpPolNo());

//		if (!requestDto.getObjPolicyEntryETT().getTpPolTodt().isBlank()
//				&& requestDto.getObjPolicyEntryETT().getTpPolTodt() != null) {
//			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getTpPolTodt(), inputFormatter);
//			L.info("getTpPolTodt>>>" + localDate);
//			insuranceMotorEntity.setTpPolTodt(localDate);
//		}
//				insuranceMotorEntity.setTpPolTodt(requestDto.getObjPolicyEntryETT().getTpPolTodt());

		insuranceMotorEntity.setCkycNo(requestDto.getObjPolicyEntryETT().getCKYC_NO());

		if (!requestDto.getObjPolicyEntryETT().getDateOfBirth().isBlank()
				&& requestDto.getObjPolicyEntryETT().getDateOfBirth() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjPolicyEntryETT().getDateOfBirth(), inputFormatter);
			L.info("getDateOfBirth>>>" + localDate);
			insuranceMotorEntity.setDateOfBirth(localDate);
		}
//				insuranceMotorEntity.setDateOfBirth(requestDto.getObjPolicyEntryETT().getDateOfBirth());

		insuranceMotorEntity.setPoiType(requestDto.getObjPolicyEntryETT().getPOI_Type());
		insuranceMotorEntity.setPoiId(requestDto.getObjPolicyEntryETT().getPOI_ID());
		insuranceMotorEntity.setPoaType(requestDto.getObjPolicyEntryETT().getPOA_Type());
		insuranceMotorEntity.setPoaId(requestDto.getObjPolicyEntryETT().getPOA_ID());
		insuranceMotorEntity.setFatherName(requestDto.getObjPolicyEntryETT().getFatherName());
		insuranceMotorEntity.setMotherName(requestDto.getObjPolicyEntryETT().getMotherName());
		insuranceMotorEntity.setMaritalStatus(requestDto.getObjPolicyEntryETT().getMaritalStatus());
		insuranceMotorEntity.setSpouseName(requestDto.getObjPolicyEntryETT().getSpouseName());
		insuranceMotorEntity.setResidentialStatus(requestDto.getObjPolicyEntryETT().getResidentialStatus());
		insuranceMotorEntity.setPoiDocumentFile(requestDto.getObjPolicyEntryETT().getPOI_DocumentFile());
		insuranceMotorEntity.setPoaDocumentFile(requestDto.getObjPolicyEntryETT().getPOA_DocumentFile());
		insuranceMotorEntity.setInsuredPhoto(requestDto.getObjPolicyEntryETT().getInsured_photo());
		insuranceMotorEntity.setPoiDocumentExt(requestDto.getObjPolicyEntryETT().getPOI_DocumentExt());
		insuranceMotorEntity.setPoaDocumentExt(requestDto.getObjPolicyEntryETT().getPOA_DocumentExt());
		insuranceMotorEntity.setInsuredPhotoExt(requestDto.getObjPolicyEntryETT().getInsured_photoExt());
		
		// PCCV proposal ka data 
		insuranceMotorEntity.setVehicleCategory(requestDto.getObjPolicyEntryETT().getVehicleCategory());
		insuranceMotorEntity.setPccvVehType(requestDto.getObjPolicyEntryETT().getPCCVVehType());
		insuranceMotorEntity.setShriMotorProtectionYN(requestDto.getObjPolicyEntryETT().getSHRIMOOTORPROTECTION_YN());

		InsuranceMotorEntity savedPCCVProposalRequest = this.insuranceMotorRepository.save(insuranceMotorEntity);
		L.info("savedPCCVProposalRequest>>>" + savedPCCVProposalRequest.toString());
		
		
		
		GeneratePCCVProposalResponseDto responseDto = new GeneratePCCVProposalResponseDto();
		String generatePCCVProposalURL = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/GeneratePCCVProposal";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<GeneratePCCVProposalRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("GeneratePCCVProposalRequestDto RequestEntity: "+requestEntity.toString());
			ResponseEntity<GeneratePCCVProposalResponseDto> responseEntity = restTemplate.exchange(
								generatePCCVProposalURL,
			                    HttpMethod.POST,
			                    requestEntity,
			                    GeneratePCCVProposalResponseDto.class
            );			
			L.info("GeneratePCCVProposalResponseDto Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("GeneratePCCVProposalResponseDto Response Body:"+responseDto.toString());
			
			String proposalNo = responseDto.getGeneratePCCVProposalResult().getpROPOSAL_NO() != null ? responseDto.getGeneratePCCVProposalResult().getpROPOSAL_NO() : "";
			L.info("proposalNo: "+proposalNo);
			String Error_Desc = responseDto.getGeneratePCCVProposalResult().geteRROR_DESC() != null ? responseDto.getGeneratePCCVProposalResult().geteRROR_DESC() : "";
			L.info("Error_Desc: "+Error_Desc);
			savedPCCVProposalRequest.setProposalNo(proposalNo);
			savedPCCVProposalRequest.setError_Desc(Error_Desc);
			savedPCCVProposalRequest = this.insuranceMotorRepository.save(savedPCCVProposalRequest);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}
}
