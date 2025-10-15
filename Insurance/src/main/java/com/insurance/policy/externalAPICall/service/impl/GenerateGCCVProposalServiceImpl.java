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

import com.insurance.policy.dto.GenerateGCCVProposalRequestDto;
import com.insurance.policy.dto.GenerateGCCVProposalResponseDto;
import com.insurance.policy.entity.InsuranceMotorEntity;
import com.insurance.policy.externalAPICall.service.GenerateGCCVProposalService;
import com.insurance.policy.repository.InsuranceMotorRepository;

@Service
public class GenerateGCCVProposalServiceImpl implements GenerateGCCVProposalService{

	private static final Logger L   = Logger.getLogger(GenerateGCCVProposalServiceImpl.class.getName());

	private RestTemplate restTemplate = new RestTemplate();
	
	private final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);

	@Autowired
	private InsuranceMotorRepository insuranceMotorRepository;
	
	public GenerateGCCVProposalResponseDto generateGCCVProposal(GenerateGCCVProposalRequestDto requestDto) {
		
		// save data in database
		InsuranceMotorEntity insuranceMotorEntity = new InsuranceMotorEntity();

		insuranceMotorEntity.setRequest_name("gccv_proposal");

		L.info("getReferenceNo>>>" + requestDto.getObjGCCVProposalEntryETT().getReferenceNo());

		insuranceMotorEntity.setReferenceNo(requestDto.getObjGCCVProposalEntryETT().getReferenceNo());
		L.info("getProdCode>>>" + requestDto.getObjGCCVProposalEntryETT().getProdCode());
		insuranceMotorEntity.setProdCode(requestDto.getObjGCCVProposalEntryETT().getProdCode());
		insuranceMotorEntity.setPhysical_policy(requestDto.getObjGCCVProposalEntryETT().getPhysical_policy());

		if (!requestDto.getObjGCCVProposalEntryETT().getPolicyFromDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPolicyFromDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getPolicyFromDt(), inputFormatter);
			L.info("getPolicyFromDt>>>" + localDate);
			insuranceMotorEntity.setPolicyFromDt(localDate);
		}

		if (!requestDto.getObjGCCVProposalEntryETT().getPolicyToDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPolicyToDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getPolicyToDt(), inputFormatter);
			L.info("getPolicyToDt>>>" + localDate);
			insuranceMotorEntity.setPolicyToDt(localDate);
		}

//				insuranceMotorEntity.setPolicyToDt(LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getPolicyToDt(), dateFormatter));

		if (!requestDto.getObjGCCVProposalEntryETT().getPolicyIssueDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPolicyIssueDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getPolicyIssueDt(), inputFormatter);
			L.info("getPolicyIssueDt>>>" + localDate);
			insuranceMotorEntity.setPolicyIssueDt(localDate);
		}

//				insuranceMotorEntity.setPolicyIssueDt(LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getPolicyIssueDt(), dateFormatter));
		insuranceMotorEntity.setInsuredPrefix(requestDto.getObjGCCVProposalEntryETT().getInsuredPrefix());
		insuranceMotorEntity.setInsuredName(requestDto.getObjGCCVProposalEntryETT().getInsuredName());
		insuranceMotorEntity.setGender(requestDto.getObjGCCVProposalEntryETT().getGender());
		insuranceMotorEntity.setAddress1(requestDto.getObjGCCVProposalEntryETT().getAddress1());
		insuranceMotorEntity.setAddress2(requestDto.getObjGCCVProposalEntryETT().getAddress2());
		insuranceMotorEntity.setAddress3(requestDto.getObjGCCVProposalEntryETT().getAddress3());
		insuranceMotorEntity.setState(requestDto.getObjGCCVProposalEntryETT().getState());
		insuranceMotorEntity.setCity(requestDto.getObjGCCVProposalEntryETT().getCity());
		insuranceMotorEntity.setPinCode(requestDto.getObjGCCVProposalEntryETT().getPinCode());
		insuranceMotorEntity.setPanNo(requestDto.getObjGCCVProposalEntryETT().getPanNo());
		insuranceMotorEntity.setGstNo(requestDto.getObjGCCVProposalEntryETT().getGSTNo());
		insuranceMotorEntity.setMobileNo(requestDto.getObjGCCVProposalEntryETT().getMobileNo());
//		insuranceMotorEntity.setTelephoneNo(requestDto.getObjGCCVProposalEntryETT().getTelephoneNo());
		insuranceMotorEntity.setProposalType(requestDto.getObjGCCVProposalEntryETT().getProposalType());
		insuranceMotorEntity.setPolicyType(requestDto.getObjGCCVProposalEntryETT().getPolType());

		if (!requestDto.getObjGCCVProposalEntryETT().getDateOfBirth().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getDateOfBirth() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getDateOfBirth(), inputFormatter);
			L.info("getDateOfBirth>>>" + localDate);
			insuranceMotorEntity.setDateOfBirth(localDate);
		}
//				insuranceMotorEntity.setDateOfBirth(LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getDateOfBirth(), dateFormatter));
		insuranceMotorEntity.setFaxNo("");
		insuranceMotorEntity.setEmailId(requestDto.getObjGCCVProposalEntryETT().getEmailID());
		insuranceMotorEntity.setPosAgentName(requestDto.getObjGCCVProposalEntryETT().getPOSAgentName());
		insuranceMotorEntity.setPosAgentPanNo(requestDto.getObjGCCVProposalEntryETT().getPOSAgentPanNo());
		insuranceMotorEntity.setCoverNoteNo(requestDto.getObjGCCVProposalEntryETT().getCoverNoteNo());

		if (!requestDto.getObjGCCVProposalEntryETT().getCoverNoteDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getCoverNoteDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getCoverNoteDt(), inputFormatter);
			L.info("getCoverNoteDt>>>" + localDate);
			insuranceMotorEntity.setCoverNoteDt(localDate);
		}
//				insuranceMotorEntity.setCoverNoteDt(LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getCoverNoteDt(), dateFormatter));

		insuranceMotorEntity.setVehicleCode(requestDto.getObjGCCVProposalEntryETT().getVehicleCode());

		if (!requestDto.getObjGCCVProposalEntryETT().getFirstRegDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getFirstRegDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getFirstRegDt(), inputFormatter);
			L.info("getCoverNoteDt>>>" + localDate);
			insuranceMotorEntity.setFirstRegDt(localDate);
		}
//				insuranceMotorEntity.setFirstRegDt(requestDto.getObjGCCVProposalEntryETT().getFirstRegDt());

		insuranceMotorEntity.setVehicleType(requestDto.getObjGCCVProposalEntryETT().getVehicleType());
		insuranceMotorEntity.setEngineNo(requestDto.getObjGCCVProposalEntryETT().getEngineNo());
		insuranceMotorEntity.setChassisNo(requestDto.getObjGCCVProposalEntryETT().getChassisNo());
		insuranceMotorEntity.setRegNo1(requestDto.getObjGCCVProposalEntryETT().getRegNo1());
		insuranceMotorEntity.setRegNo2(requestDto.getObjGCCVProposalEntryETT().getRegNo2());
		insuranceMotorEntity.setRegNo3(requestDto.getObjGCCVProposalEntryETT().getRegNo3());
		insuranceMotorEntity.setRegNo4(requestDto.getObjGCCVProposalEntryETT().getRegNo4());
		insuranceMotorEntity.setRtoCode(requestDto.getObjGCCVProposalEntryETT().getRTOCode());

		if (!requestDto.getObjGCCVProposalEntryETT().getIDV_of_Vehicle().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getIDV_of_Vehicle() != null) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getIDV_of_Vehicle().trim());
			L.info("idvOfVehicle>>>" + idvOfVehicle);
			insuranceMotorEntity.setIdvOfVehicle(idvOfVehicle);
		}
//				insuranceMotorEntity.setIdvOfVehicle(requestDto.getObjGCCVProposalEntryETT().getIDV_of_Vehicle());
		insuranceMotorEntity.setColour(requestDto.getObjGCCVProposalEntryETT().getColour());

		if (!requestDto.getObjGCCVProposalEntryETT().getVoluntaryExcess().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getVoluntaryExcess() != null) {
			Integer VoluntaryExcess = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getVoluntaryExcess().trim());
			L.info("VoluntaryExcess>>>" + VoluntaryExcess);
			insuranceMotorEntity.setVoluntaryExcess(VoluntaryExcess);
		}
//				insuranceMotorEntity.setVoluntaryExcess(requestDto.getObjGCCVProposalEntryETT().getVoluntaryExcess());

		if (!requestDto.getObjGCCVProposalEntryETT().getNoEmpCoverLL().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getNoEmpCoverLL() != null) {
			Integer NoEmpCoverLL = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoEmpCoverLL().trim());
			L.info("NoEmpCoverLL>>>" + NoEmpCoverLL);
			insuranceMotorEntity.setNoEmpCoverLL(NoEmpCoverLL);
		}
//				insuranceMotorEntity.setNoEmpCoverLL(requestDto.getObjGCCVProposalEntryETT().getNoEmpCoverLL());

		if (!requestDto.getObjGCCVProposalEntryETT().getNoOfCleaner().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getNoOfCleaner() != null) {
			Integer idvOfVehicle = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfCleaner());
			L.info("getNoOfCleaner>>>" + idvOfVehicle);
			insuranceMotorEntity.setNoOfCleaner(idvOfVehicle);
		}
//				insuranceMotorEntity.setNoOfCleaner(requestDto.getObjGCCVProposalEntryETT().getNoOfCleaner());

		if (!requestDto.getObjGCCVProposalEntryETT().getNoOfDriver().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getNoOfDriver() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfDriver().trim());
			L.info("getNoOfDriver>>>" + getNoOfDriver);
			insuranceMotorEntity.setNoOfDriver(getNoOfDriver);
		}
//				insuranceMotorEntity.setNoOfDriver(requestDto.getObjGCCVProposalEntryETT().getNoOfDriver());

		if (!requestDto.getObjGCCVProposalEntryETT().getNoOfConductor().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getNoOfConductor() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfConductor().trim());
			L.info("getNoOfDriver>>>" + getNoOfDriver);
			insuranceMotorEntity.setNoOfConductor(getNoOfDriver);
		}
//				insuranceMotorEntity.setNoOfConductor(requestDto.getObjGCCVProposalEntryETT().getNoOfConductor());
		insuranceMotorEntity.setVehicleMadeinindiaYN(requestDto.getObjGCCVProposalEntryETT().getVehicleMadeinindiaYN());
		insuranceMotorEntity.setVehiclePurposeYN("");
		insuranceMotorEntity.setNfppEmployees("");
		insuranceMotorEntity.setNfppOthThanEmp(requestDto.getObjGCCVProposalEntryETT().getNFPP_OthThanEmp());
		insuranceMotorEntity.setLimitOwnPremiseYN(requestDto.getObjGCCVProposalEntryETT().getLimitOwnPremiseYN());

		if (!requestDto.getObjGCCVProposalEntryETT().getBangladesh().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getBangladesh() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getBangladesh().trim());
			L.info("getBangladesh>>>" + getNoOfDriver);
			insuranceMotorEntity.setBangladesh(getNoOfDriver);
		}
//				insuranceMotorEntity.setBangladesh(requestDto.getObjGCCVProposalEntryETT().getBangladesh());

		if (!requestDto.getObjGCCVProposalEntryETT().getBhutan().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getBhutan() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getBhutan().trim());
			L.info("getBhutan>>>" + getNoOfDriver);
			insuranceMotorEntity.setBhutan(getNoOfDriver);
		}
//				insuranceMotorEntity.setBhutan(requestDto.getObjGCCVProposalEntryETT().getBhutan());

		if (!requestDto.getObjGCCVProposalEntryETT().getSrilanka().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getSrilanka() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getSrilanka().trim());
			L.info("getSriLanka>>>" + getNoOfDriver);
			insuranceMotorEntity.setSriLanka(getNoOfDriver);
		}
//				insuranceMotorEntity.setSriLanka(requestDto.getObjGCCVProposalEntryETT().getSriLanka());

		if (!requestDto.getObjGCCVProposalEntryETT().getNepal().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getNepal() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNepal().trim());
			L.info("getNepal>>>" + getNoOfDriver);
			insuranceMotorEntity.setNepal(getNoOfDriver);
		}
//				insuranceMotorEntity.setNepal(requestDto.getObjGCCVProposalEntryETT().getNepal());

		if (!requestDto.getObjGCCVProposalEntryETT().getPakistan().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPakistan() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPakistan().trim());
			L.info("getPakistan>>>" + getNoOfDriver);
			insuranceMotorEntity.setPakistan(getNoOfDriver);
		}
//				insuranceMotorEntity.setPakistan(requestDto.getObjGCCVProposalEntryETT().getPakistan());

		if (!requestDto.getObjGCCVProposalEntryETT().getMaldives().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getMaldives() != null) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getMaldives().trim());
			L.info("getMaldives>>>" + getNoOfDriver);
			insuranceMotorEntity.setMaldives(getNoOfDriver);
		}
//				insuranceMotorEntity.setMaldives(requestDto.getObjGCCVProposalEntryETT().setMaldives());

		if (!requestDto.getObjGCCVProposalEntryETT().getCNGKitYN().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getCNGKitYN() != null) {
			Integer getCNGKitYN = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getCNGKitYN().trim());
			L.info("getCNGKitYN>>>" + getCNGKitYN);
			insuranceMotorEntity.setCngKitYN(getCNGKitYN);
		}
//		insuranceMotorEntity.setCngKitYN(Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getCNGKitYN()));

		if (requestDto.getObjGCCVProposalEntryETT().getCNGKitSI() != null) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getCNGKitSI());
			L.info("getCNGKitSI>>>" + idvOfVehicle);
			insuranceMotorEntity.setCngKitSI(idvOfVehicle);
		}
//				insuranceMotorEntity.setCngKitSI(requestDto.getObjGCCVProposalEntryETT().getCNGKitSI());

//				if(!requestDto.getObjGCCVProposalEntryETT().getInBuiltCNGKit().isBlank() && requestDto.getObjGCCVProposalEntryETT().getInBuiltCNGKit()!=null) {
//					Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getInBuiltCNGKit().trim());
//					L.info("getInBuiltCNGKit>>>"+getNoOfDriver);
//					insuranceMotorEntity.setInBuiltCNGKit(getNoOfDriver);			
//				}
		insuranceMotorEntity.setInBuiltCNGKit(Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getInBuiltCNGKit()));

		if (!requestDto.getObjGCCVProposalEntryETT().getLimitedTPPDYN().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getLimitedTPPDYN() != null 
				&& requestDto.getObjGCCVProposalEntryETT().getLimitedTPPDYN().length()>0
				) {
			Integer getNoOfDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getLimitedTPPDYN().trim());
			L.info("getLimitedTPPDYN>>>" + getNoOfDriver);
			insuranceMotorEntity.setLimitedTPPDYN(getNoOfDriver);
		}
//				insuranceMotorEntity.setLimitedTPPDYN(requestDto.getObjGCCVProposalEntryETT().getLimitedTPPDYN());
		
		if(!requestDto.getObjGCCVProposalEntryETT().getDeTariff().isBlank() 
				&& requestDto.getObjGCCVProposalEntryETT().getDeTariff()!=null
				&& requestDto.getObjGCCVProposalEntryETT().getDeTariff().length()>0) {
			insuranceMotorEntity.setDeTariff(Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getDeTariff()));
		}
		
		insuranceMotorEntity.setImt23YN(requestDto.getObjGCCVProposalEntryETT().getIMT23YN());
		insuranceMotorEntity.setBreakIn(requestDto.getObjGCCVProposalEntryETT().getBreakIn());
		insuranceMotorEntity.setPreInspectionReportYN(requestDto.getObjGCCVProposalEntryETT().getPreInspectionReportYN());
		insuranceMotorEntity.setPreInspection(requestDto.getObjGCCVProposalEntryETT().getPreInspection());
		insuranceMotorEntity.setFitnessCertificateno("");

//		if (!requestDto.getObjGCCVProposalEntryETT().getFitnessValidupto().isBlank()
//				&& requestDto.getObjGCCVProposalEntryETT().getFitnessValidupto() != null) {
//			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getFitnessValidupto(),
//					inputFormatter);
//			L.info("getFitnessValidupto>>>" + localDate);
//			insuranceMotorEntity.setFitnessValidupto(localDate);
//		}
//				insuranceMotorEntity.setFitnessValidupto(requestDto.getObjGCCVProposalEntryETT().getFitnessValidupto());
		insuranceMotorEntity.setVehPermit(requestDto.getObjGCCVProposalEntryETT().getVehPermit());
		insuranceMotorEntity.setPermitNo(requestDto.getObjGCCVProposalEntryETT().getPermit());
		if(requestDto.getObjGCCVProposalEntryETT().getPAforUnnamedPassengerYN() != null 
				&& requestDto.getObjGCCVProposalEntryETT().getPAforUnnamedPassengerYN().length()>0) {
			Integer getPAforUnnamedPassengerYN = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPAforUnnamedPassengerYN());
			insuranceMotorEntity.setPaForUnnamedPassengerYN(getPAforUnnamedPassengerYN);
		}
		

		if (requestDto.getObjGCCVProposalEntryETT().getPAforUnnamedPassengerSI() != null 
				&& !requestDto.getObjGCCVProposalEntryETT().getPAforUnnamedPassengerSI().isBlank()) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getPAforUnnamedPassengerSI());
			L.info("setPaForUnnamedPassengerSI>>>" + idvOfVehicle);
			insuranceMotorEntity.setPaForUnnamedPassengerSI(idvOfVehicle);
		}
//				insuranceMotorEntity.setPaForUnnamedPassengerSI(requestDto.getObjGCCVProposalEntryETT().setPaForUnnamedPassengerSI());
		insuranceMotorEntity
				.setElectricalaccessYN(String.valueOf(requestDto.getObjGCCVProposalEntryETT().getElectricalaccessYN()));

		insuranceMotorEntity
				.setElectricalaccessSI(new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getElectricalaccessSI()));
		insuranceMotorEntity.setElectricalaccessRemarks(requestDto.getObjGCCVProposalEntryETT().getElectricalaccessRemarks());
		insuranceMotorEntity
				.setNonElectricalaccessYN(String.valueOf(requestDto.getObjGCCVProposalEntryETT().getNonElectricalaccessYN()));
		insuranceMotorEntity.setNonElectricalaccessSI(
				new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getNonElectricalaccessSI()));
//				insuranceMotorEntity.setNonElectricalaccessSI(requestDto.getObjGCCVProposalEntryETT().getNonElectricalaccessSI());
		insuranceMotorEntity
				.setNonElectricalaccessRemarks(requestDto.getObjGCCVProposalEntryETT().getNonElectricalaccessRemarks());
		
		if(requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverConductorCleanerYN() != null
				&& requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverConductorCleanerYN().length()>0) {
			Integer getPAPaidDriverConductorCleanerYN = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverConductorCleanerYN());
			insuranceMotorEntity.setPaPaidDriverConductorCleanerYN(getPAPaidDriverConductorCleanerYN);
		}
//		insuranceMotorEntity.setPaPaidDriverConductorCleanerYN(requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverConductorCleanerYN());
		insuranceMotorEntity.setPaPaidDriverConductorCleanerSI(	new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverConductorCleanerSI()));
//				insuranceMotorEntity.setPaPaidDriverConductorCleanerSI(requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverConductorCleanerSI());

		if (!requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverCount().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverCount() != null
				&& requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverCount().length()>0
				) {
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverCount());
			L.info("getPAPaidDriverCount>>>" + localDate);
			insuranceMotorEntity.setPaPaidDriverCount(localDate);
		}
//				insuranceMotorEntity.setPaPaidDriverCount(requestDto.getObjGCCVProposalEntryETT().getPAPaidDriverCount());

		if (!requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount());
			L.info("getPAPaidCleanerCount>>>" + localDate);
			insuranceMotorEntity.setPaPaidConductorCount(localDate);
		}
//				insuranceMotorEntity.setPaPaidConductorCount(requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount());

		if (!requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount() != null
			&& requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount().length()>0 ) {
			
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount());
			L.info("getPAPaidCleanerCount>>>" + localDate);
			insuranceMotorEntity.setPaPaidCleanerCount(localDate);
		}
//				insuranceMotorEntity.setPaPaidCleanerCount(requestDto.getObjGCCVProposalEntryETT().getPAPaidCleanerCount());

		insuranceMotorEntity
				.setNomineeNameforPAOwnerDriver(requestDto.getObjGCCVProposalEntryETT().getNomineeNameforPAOwnerDriver());

		if (!requestDto.getObjGCCVProposalEntryETT().getNomineeAgeforPAOwnerDriver().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getNomineeAgeforPAOwnerDriver() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNomineeAgeforPAOwnerDriver());
			L.info("getNomineeAgeforPAOwnerDriver>>>" + localDate);
			insuranceMotorEntity.setNomineeAgeforPAOwnerDriver(localDate);
		}
//				insuranceMotorEntity.setNomineeAgeforPAOwnerDriver(requestDto.getObjGCCVProposalEntryETT().getNomineeAgeforPAOwnerDriver());
		insuranceMotorEntity.setNomineeRelationforPAOwnerDriver(
				requestDto.getObjGCCVProposalEntryETT().getNomineeRelationforPAOwnerDriver());
		insuranceMotorEntity
				.setAppointeeNameforPAOwnerDriver(requestDto.getObjGCCVProposalEntryETT().getAppointeeNameforPAOwnerDriver());
		insuranceMotorEntity.setAppointeeRelationforPAOwnerDriver(
				requestDto.getObjGCCVProposalEntryETT().getAppointeeRelationforPAOwnerDriver());

		if (!requestDto.getObjGCCVProposalEntryETT().getLLtoPaidDriverYN().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getLLtoPaidDriverYN() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getLLtoPaidDriverYN());
			L.info("getNomineeAgeforPAOwnerDriver>>>" + localDate);
			insuranceMotorEntity.setLlToPaidDriverYN(localDate);
		}
//				insuranceMotorEntity.setLlToPaidDriverYN(requestDto.getObjGCCVProposalEntryETT().getLLtoPaidDriverYN());
		if (!requestDto.getObjGCCVProposalEntryETT().getAntiTheftYN().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getAntiTheftYN() != null) {
			Integer getAntiTheftYN = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getAntiTheftYN());
			L.info("getAntiTheftYN>>>" + getAntiTheftYN);
			insuranceMotorEntity.setAntiTheftYN(getAntiTheftYN);
		}
//		insuranceMotorEntity.setAntiTheftYN(requestDto.getObjGCCVProposalEntryETT().getAntiTheftYN());
		insuranceMotorEntity.setPreviousPolicyNo(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyNo());
		insuranceMotorEntity.setPreviousInsurer(requestDto.getObjGCCVProposalEntryETT().getPreviousInsurer());

		if (!requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyFromDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyFromDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyFromDt(),
					inputFormatter);
			L.info("getPreviousPolicyFromDt>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyFromDt(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyFromDt(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyFromDt());

		if (!requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyToDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyToDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyToDt(),
					inputFormatter);
			L.info("getPreviousPolicyToDt>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyToDt(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyToDt(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyToDt());

		if (requestDto.getObjGCCVProposalEntryETT().getPreviousPolicySI() != null
				&& !requestDto.getObjGCCVProposalEntryETT().getPreviousPolicySI().isBlank()) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicySI());
			L.info("getPreviousPolicySI>>>" + idvOfVehicle);
			insuranceMotorEntity.setPreviousPolicySI(idvOfVehicle);
		}
//				insuranceMotorEntity.setPreviousPolicySI(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicySI());

		if (!requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyClaimYN().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyClaimYN() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyClaimYN());
			L.info("getPreviousPolicyClaimYN>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyClaimYN(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyClaimYN(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyClaimYN());

		insuranceMotorEntity.setPreviousPolicyUWYear(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyUWYear());

		if (!requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyNCBPerc().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyNCBPerc() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyNCBPerc());
			L.info("getPreviousPolicyNCBPerc>>>" + localDate);
			insuranceMotorEntity.setPreviousPolicyNCBPerc(localDate);
		}
//				insuranceMotorEntity.setPreviousPolicyNCBPerc(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyNCBPerc());
		insuranceMotorEntity.setPreviousPolicyType(requestDto.getObjGCCVProposalEntryETT().getPreviousPolicyType());
		insuranceMotorEntity.setNilDepreciationCoverYN(requestDto.getObjGCCVProposalEntryETT().getNilDepreciationCoverYN());

		if (!requestDto.getObjGCCVProposalEntryETT().getPreviousNilDepreciation().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getPreviousNilDepreciation() != null) {
			Integer localDate = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getPreviousNilDepreciation());
			L.info("getPreviousNilDepreciation>>>" + localDate);
			insuranceMotorEntity.setPreviousNilDepreciation(localDate);
		}
//				insuranceMotorEntity.setPreviousNilDepreciation(requestDto.getObjGCCVProposalEntryETT().getPreviousNilDepreciation());
		insuranceMotorEntity.setRsaCover("");
		insuranceMotorEntity.setHypothecationType(requestDto.getObjGCCVProposalEntryETT().getHypothecationType());
		insuranceMotorEntity.setHypothecationBankName(requestDto.getObjGCCVProposalEntryETT().getHypothecationBankName());
		insuranceMotorEntity.setHypothecationAddress1(requestDto.getObjGCCVProposalEntryETT().getHypothecationAddress1());
		insuranceMotorEntity.setHypothecationAddress2(requestDto.getObjGCCVProposalEntryETT().getHypothecationAddress2());
		insuranceMotorEntity.setHypothecationAddress3(requestDto.getObjGCCVProposalEntryETT().getHypothecationAddress3());
		insuranceMotorEntity.setHypothecationAgreementNo(requestDto.getObjGCCVProposalEntryETT().getHypothecationAgreementNo());
		insuranceMotorEntity.setHypothecationCountry(requestDto.getObjGCCVProposalEntryETT().getHypothecationCountry());
		insuranceMotorEntity.setHypothecationState(requestDto.getObjGCCVProposalEntryETT().getHypothecationState());
		insuranceMotorEntity.setHypothecationCity(requestDto.getObjGCCVProposalEntryETT().getHypothecationCity());
		insuranceMotorEntity.setHypothecationPinCode(requestDto.getObjGCCVProposalEntryETT().getHypothecationPinCode());
		insuranceMotorEntity.setSpecifiedPersonField("");
		insuranceMotorEntity.setPaOwnerDriverExclusion(requestDto.getObjGCCVProposalEntryETT().getPAOwnerDriverExclusion());
		insuranceMotorEntity.setPaOwnerDriverExReason(requestDto.getObjGCCVProposalEntryETT().getPAOwnerDriverExReason());
		insuranceMotorEntity.setCpaInsComp(requestDto.getObjGCCVProposalEntryETT().getCPAInsComp());

		if (!requestDto.getObjGCCVProposalEntryETT().getCPAPolicyFmDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getCPAPolicyFmDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getCPAPolicyFmDt(), inputFormatter);
			L.info("getCPAPolicyFmDt>>>" + localDate);
			insuranceMotorEntity.setCpaPolicyFmDt(localDate);
		}
//				insuranceMotorEntity.setCpaPolicyFmDt(requestDto.getObjGCCVProposalEntryETT().getCPAPolicyFmDt());

		insuranceMotorEntity.setCpaPolicyNo(requestDto.getObjGCCVProposalEntryETT().getCPAPolicyNo());

		if (!requestDto.getObjGCCVProposalEntryETT().getCPAPolicyToDt().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getCPAPolicyToDt() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getCPAPolicyToDt(), inputFormatter);
			L.info("getCPAPolicyToDt>>>" + localDate);
			insuranceMotorEntity.setCpaPolicyToDt(localDate);
		}
//				insuranceMotorEntity.setCpaPolicyToDt(requestDto.getObjGCCVProposalEntryETT().getCPAPolicyToDt());

		if (requestDto.getObjGCCVProposalEntryETT().getCPASumInsured() != null
				&& !requestDto.getObjGCCVProposalEntryETT().getCPASumInsured().isBlank()) {
			BigDecimal idvOfVehicle = new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getCPASumInsured());
			L.info("getCPASumInsured>>>" + idvOfVehicle);
			insuranceMotorEntity.setCpaSumInsured(idvOfVehicle);
		}
//				insuranceMotorEntity.setCpaSumInsured(requestDto.getObjGCCVProposalEntryETT().getCPASumInsured());
		insuranceMotorEntity.setConsumables(requestDto.getObjGCCVProposalEntryETT().getConsumables());
//		insuranceMotorEntity.setEmergencyTranHotelExpRemYN(requestDto.getObjGCCVProposalEntryETT().getEmergencyTranHotelExpRemYN());
//		insuranceMotorEntity.setEngProtector(requestDto.getObjGCCVProposalEntryETT().getEng_Protector());
//		insuranceMotorEntity.setKeyReplacementYN(requestDto.getObjGCCVProposalEntryETT().getKeyReplacementYN());
//		insuranceMotorEntity.setDailyExpRemYN(requestDto.getObjGCCVProposalEntryETT().getDailyExpRemYN());
//		insuranceMotorEntity.setTpPolAddr(requestDto.getObjGCCVProposalEntryETT().getTpPolAddr());
//		insuranceMotorEntity.setTpPolComp(requestDto.getObjGCCVProposalEntryETT().getTpPolComp());

//		if (!requestDto.getObjGCCVProposalEntryETT().getTpPolFmdt().isBlank()
//				&& requestDto.getObjGCCVProposalEntryETT().getTpPolFmdt() != null) {
//			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getTpPolFmdt(), inputFormatter);
//			L.info("getTpPolFmdt>>>" + localDate);
//			insuranceMotorEntity.setTpPolFmdt(localDate);
//		}
//				insuranceMotorEntity.setTpPolFmdt(requestDto.getObjGCCVProposalEntryETT().getTpPolFmdt());

//		insuranceMotorEntity.setTpPolNo(requestDto.getObjGCCVProposalEntryETT().getTpPolNo());

//		if (!requestDto.getObjGCCVProposalEntryETT().getTpPolTodt().isBlank()
//				&& requestDto.getObjGCCVProposalEntryETT().getTpPolTodt() != null) {
//			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getTpPolTodt(), inputFormatter);
//			L.info("getTpPolTodt>>>" + localDate);
//			insuranceMotorEntity.setTpPolTodt(localDate);
//		}
//				insuranceMotorEntity.setTpPolTodt(requestDto.getObjGCCVProposalEntryETT().getTpPolTodt());

		insuranceMotorEntity.setCkycNo(requestDto.getObjGCCVProposalEntryETT().getCKYC_NO());

		if (!requestDto.getObjGCCVProposalEntryETT().getDateOfBirth().isBlank()
				&& requestDto.getObjGCCVProposalEntryETT().getDateOfBirth() != null) {
			LocalDate localDate = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getDateOfBirth(), inputFormatter);
			L.info("getDateOfBirth>>>" + localDate);
			insuranceMotorEntity.setDateOfBirth(localDate);
		}
//				insuranceMotorEntity.setDateOfBirth(requestDto.getObjGCCVProposalEntryETT().getDateOfBirth());

		insuranceMotorEntity.setPoiType(requestDto.getObjGCCVProposalEntryETT().getPOI_Type());
		insuranceMotorEntity.setPoiId(requestDto.getObjGCCVProposalEntryETT().getPOI_ID());
		insuranceMotorEntity.setPoaType(requestDto.getObjGCCVProposalEntryETT().getPOA_Type());
		insuranceMotorEntity.setPoaId(requestDto.getObjGCCVProposalEntryETT().getPOA_ID());
		insuranceMotorEntity.setFatherName(requestDto.getObjGCCVProposalEntryETT().getFatherName());
		insuranceMotorEntity.setMotherName(requestDto.getObjGCCVProposalEntryETT().getMotherName());
		insuranceMotorEntity.setMaritalStatus(requestDto.getObjGCCVProposalEntryETT().getMaritalStatus());
		insuranceMotorEntity.setSpouseName(requestDto.getObjGCCVProposalEntryETT().getSpouseName());
		insuranceMotorEntity.setResidentialStatus(requestDto.getObjGCCVProposalEntryETT().getResidentialStatus());
		insuranceMotorEntity.setPoiDocumentFile(requestDto.getObjGCCVProposalEntryETT().getPOI_DocumentFile());
		insuranceMotorEntity.setPoaDocumentFile(requestDto.getObjGCCVProposalEntryETT().getPOA_DocumentFile());
		insuranceMotorEntity.setInsuredPhoto(requestDto.getObjGCCVProposalEntryETT().getInsured_photo());
		insuranceMotorEntity.setPoiDocumentExt(requestDto.getObjGCCVProposalEntryETT().getPOI_DocumentExt());
		insuranceMotorEntity.setPoaDocumentExt(requestDto.getObjGCCVProposalEntryETT().getPOA_DocumentExt());
		insuranceMotorEntity.setInsuredPhotoExt(requestDto.getObjGCCVProposalEntryETT().getInsured_photoExt());
		
		
	//	-- GCCV Values 
		insuranceMotorEntity.setVehicleCategory(requestDto.getObjGCCVProposalEntryETT().getVehicleCategory());
		insuranceMotorEntity.setGvw(new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getGVW()));
		insuranceMotorEntity.setAadharEnrollNo(requestDto.getObjGCCVProposalEntryETT().getAadharEnrollNo());
		insuranceMotorEntity.setAadharNo(requestDto.getObjGCCVProposalEntryETT().getAadharNo());
		
		if(requestDto.getObjGCCVProposalEntryETT().getVehicleAge() != null && !requestDto.getObjGCCVProposalEntryETT().getVehicleAge().isBlank()) {
			Integer vehicleAge = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getVehicleAge());
			insuranceMotorEntity.setVehicleAge(vehicleAge);
		}
//		insuranceMotorEntity.setVehicleAge(requestDto.getObjGCCVProposalEntryETT().getVehicleAge());
		insuranceMotorEntity.setVehicleManufactureYear(requestDto.getObjGCCVProposalEntryETT().getVehicleManufactureYear());
		if(requestDto.getObjGCCVProposalEntryETT().getAgeOfOwner() != null && !requestDto.getObjGCCVProposalEntryETT().getAgeOfOwner().isBlank()) {
			Integer getAgeOfOwner = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getAgeOfOwner());
			insuranceMotorEntity.setAgeOfOwner(getAgeOfOwner);
		}
//		insuranceMotorEntity.setAgeOfOwner(requestDto.getObjGCCVProposalEntryETT().getAgeOfOwner());
		
		if(requestDto.getObjGCCVProposalEntryETT().getAgeOfPaidDriver() != null && !requestDto.getObjGCCVProposalEntryETT().getAgeOfPaidDriver().isBlank()) {
			Integer getAgeOfPaidDriver = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getAgeOfPaidDriver());
			insuranceMotorEntity.setAgeOfPaidDriver(getAgeOfPaidDriver);
		}
//		insuranceMotorEntity.setAgeOfPaidDriver(requestDto.getObjGCCVProposalEntryETT().getAgeOfPaidDriver());
		
		if(requestDto.getObjGCCVProposalEntryETT().getAgeOfVehicle() != null && !requestDto.getObjGCCVProposalEntryETT().getAgeOfVehicle().isBlank()) {
			Integer getAgeOfVehicle = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getAgeOfVehicle());
			insuranceMotorEntity.setAgeOfVehicle(getAgeOfVehicle);
		}
//		insuranceMotorEntity.setAgeOfVehicle(requestDto.getObjGCCVProposalEntryETT().getAgeOfVehicle());
		
		if(requestDto.getObjGCCVProposalEntryETT().getAmount() != null && !requestDto.getObjGCCVProposalEntryETT().getAmount().isBlank()) {
//			Integer getAmount = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getAmount());
			insuranceMotorEntity.setAmount(new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getAmount()));
		}
//		insuranceMotorEntity.setAmount(requestDto.getObjGCCVProposalEntryETT().getAmount());
		insuranceMotorEntity.setAmount1(new BigDecimal(requestDto.getObjGCCVProposalEntryETT().getAmount1()));
		insuranceMotorEntity.setBodyType(requestDto.getObjGCCVProposalEntryETT().getBodyType());
		insuranceMotorEntity.setCancelOrRefuseRenew(requestDto.getObjGCCVProposalEntryETT().getCancelOrRefuseRenew());
		insuranceMotorEntity.setCaptiveUseYN(requestDto.getObjGCCVProposalEntryETT().getCaptiveUseYN());
		insuranceMotorEntity.setClaimsLodged(requestDto.getObjGCCVProposalEntryETT().getClaimsLodged());
		insuranceMotorEntity.setCoverLampTyreTubeYN(requestDto.getObjGCCVProposalEntryETT().getCoverLampTyreTubeYN());
		insuranceMotorEntity.setDeTariffDis(requestDto.getObjGCCVProposalEntryETT().getDE_TARIFFDIS());
		
		if (!requestDto.getObjGCCVProposalEntryETT().getDateOfPurchaseOfVehAsPerInvOrSaleLetter().isBlank()	&& requestDto.getObjGCCVProposalEntryETT().getDateOfPurchaseOfVehAsPerInvOrSaleLetter() != null) {
			LocalDate getDateOfPurchaseOfVehAsPerInvOrSaleLetter = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getDateOfPurchaseOfVehAsPerInvOrSaleLetter(), inputFormatter);
			L.info("getDateOfPurchaseOfVehAsPerInvOrSaleLetter>>>" + getDateOfPurchaseOfVehAsPerInvOrSaleLetter);
			insuranceMotorEntity.setDateOfPurchaseOfVehAsPerInvOrSaleLetter(getDateOfPurchaseOfVehAsPerInvOrSaleLetter);
		}
//		insuranceMotorEntity.setDateOfPurchaseOfVehAsPerInvOrSaleLetter(requestDto.getObjGCCVProposalEntryETT().getDateOfPurchaseOfVehAsPerInvOrSaleLetter());
		
		if(requestDto.getObjGCCVProposalEntryETT().getNoOfCoolies() != null && !requestDto.getObjGCCVProposalEntryETT().getNoOfCoolies().isBlank()) {
			Integer getNoOfCoolies = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfCoolies());
			insuranceMotorEntity.setNoOfCoolies(getNoOfCoolies);
		}
		
		if(requestDto.getObjGCCVProposalEntryETT().getNoOfClaims() != null && !requestDto.getObjGCCVProposalEntryETT().getNoOfClaims().isBlank()) {
			Integer getNoOfClaims = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfClaims());
			insuranceMotorEntity.setNoOfClaims(getNoOfClaims);
		}
//		insuranceMotorEntity.setNoOfClaims(requestDto.getObjGCCVProposalEntryETT().getNoOfClaims());
		
		if(requestDto.getObjGCCVProposalEntryETT().getNoOfClaims1() != null && !requestDto.getObjGCCVProposalEntryETT().getNoOfClaims1().isBlank()) {
			Integer getNoOfClaims1 = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfClaims1());
			insuranceMotorEntity.setNoOfClaims1(getNoOfClaims1);
		}
//		insuranceMotorEntity.setNoOfClaims1(requestDto.getObjGCCVProposalEntryETT().getNoOfClaims1());
		
		if(requestDto.getObjGCCVProposalEntryETT().getNoOfDCCforPA() != null && !requestDto.getObjGCCVProposalEntryETT().getNoOfDCCforPA().isBlank()) {
			Integer getNoOfDCCforPA = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfDCCforPA());
			insuranceMotorEntity.setNoOfDccForPA(getNoOfDCCforPA);
		}
//		insuranceMotorEntity.setNoOfDccForPA(requestDto.getObjGCCVProposalEntryETT().getNoOfDCCforPA());
		
		if(requestDto.getObjGCCVProposalEntryETT().getNoOfTrailers() != null && !requestDto.getObjGCCVProposalEntryETT().getNoOfTrailers().isBlank()) {
			Integer getNoOfTrailers = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getNoOfTrailers());
			insuranceMotorEntity.setNoOfTrailers(getNoOfTrailers);
		}
//		insuranceMotorEntity.setNoOfTrailers(requestDto.getObjGCCVProposalEntryETT().getNoOfTrailers());
		insuranceMotorEntity.setPuccNo(requestDto.getObjGCCVProposalEntryETT().getPuccNo());
		insuranceMotorEntity.setPuccState(requestDto.getObjGCCVProposalEntryETT().getPuccState());
		insuranceMotorEntity.setPuccYN(requestDto.getObjGCCVProposalEntryETT().getPuccYN());
		
		if(requestDto.getObjGCCVProposalEntryETT().getSeatingCapacity() != null && !requestDto.getObjGCCVProposalEntryETT().getSeatingCapacity().isBlank()) {
			Integer getSeatingCapacity = Integer.parseInt(requestDto.getObjGCCVProposalEntryETT().getSeatingCapacity());
			insuranceMotorEntity.setSeatingCapacity(getSeatingCapacity);
		}
//		insuranceMotorEntity.setSeatingCapacity(requestDto.getObjGCCVProposalEntryETT().getSeatingCapacity());
		insuranceMotorEntity.setSpeedometerReading(requestDto.getObjGCCVProposalEntryETT().getSpeedometerReading());
		insuranceMotorEntity.setTdChassisNo(requestDto.getObjGCCVProposalEntryETT().getTDChassisNo());
		insuranceMotorEntity.setTdRegNo(requestDto.getObjGCCVProposalEntryETT().getTDRegNo());
		insuranceMotorEntity.setTransferOfOwner(requestDto.getObjGCCVProposalEntryETT().getTRANSFEROFOWNER());
		insuranceMotorEntity.setTrailerVehicleCode(requestDto.getObjGCCVProposalEntryETT().getTrailerVehicleCode());
		insuranceMotorEntity.setUseOfVehIsLimitedOwnPremisesYN(requestDto.getObjGCCVProposalEntryETT().getUseofVehisLimitedOwnPremisesYN());
		
		if (!requestDto.getObjGCCVProposalEntryETT().getValidupto().isBlank()	&& requestDto.getObjGCCVProposalEntryETT().getValidupto() != null) {
			LocalDate getValidupto = LocalDate.parse(requestDto.getObjGCCVProposalEntryETT().getValidupto(), inputFormatter);
			L.info("getValidupto>>>" + getValidupto);
			insuranceMotorEntity.setValidUpto(getValidupto);
		}
//		insuranceMotorEntity.setValidUpto(requestDto.getObjGCCVProposalEntryETT().getValidupto());
		insuranceMotorEntity.setVehFitWithTublessTyresYN(requestDto.getObjGCCVProposalEntryETT().getVehFitWithTublessTyresYN());
		insuranceMotorEntity.setVehFittedWithFGTankYN(requestDto.getObjGCCVProposalEntryETT().getVehFittedWithFGTankYN());
		insuranceMotorEntity.setVehParkedDuringNight(requestDto.getObjGCCVProposalEntryETT().getVehParkedDuringNight());
		insuranceMotorEntity.setNatureOfGoods(requestDto.getObjGCCVProposalEntryETT().getNatureOfGoods());
		insuranceMotorEntity.setIndemnityToHirerYN(requestDto.getObjGCCVProposalEntryETT().getIndemnityToHirerYN());
		
		InsuranceMotorEntity savedGCCVProposalRequest = this.insuranceMotorRepository.save(insuranceMotorEntity);
		L.info("savedGCCVProposalRequest>>>" + savedGCCVProposalRequest.toString());
		
		GenerateGCCVProposalResponseDto responseDto = new GenerateGCCVProposalResponseDto();
		String generateGCCVProposalURL = "https://novaapiuat.shriramgi.com/UATNOVADIGITAL/SVS_Services/PolicyGeneration.svc/RestService/GenerateGCCVProposal";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Username", "NiveshIns");
			headers.set("Password", "shriram@1");
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<GenerateGCCVProposalRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
			L.info("GenerateGCCVProposalRequestDto RequestEntity: "+requestEntity.toString());
			ResponseEntity<GenerateGCCVProposalResponseDto> responseEntity = restTemplate.exchange(
								generateGCCVProposalURL,
			                    HttpMethod.POST,
			                    requestEntity,
			                    GenerateGCCVProposalResponseDto.class
            );			
			L.info("GenerateGCCVProposalResponseDto Response Entity:"+responseEntity.toString());			
			responseDto =responseEntity.getBody();
			L.info("GenerateGCCVProposalResponseDto Response Body:"+responseDto.toString());
			
			String proposalNo = responseDto.getGenerateGCCVProposalResult().getpROPOSAL_NO() != null ? responseDto.getGenerateGCCVProposalResult().getpROPOSAL_NO() : "";
			L.info("proposalNo: "+proposalNo);
			String Error_Desc = responseDto.getGenerateGCCVProposalResult().geteRROR_DESC() != null ? responseDto.getGenerateGCCVProposalResult().geteRROR_DESC() : "";
			L.info("Error_Desc: "+Error_Desc);
			savedGCCVProposalRequest.setProposalNo(proposalNo);
			savedGCCVProposalRequest.setError_Desc(Error_Desc);
			savedGCCVProposalRequest = this.insuranceMotorRepository.save(savedGCCVProposalRequest);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
		return responseDto;
	}
	
}
