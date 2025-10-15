/*
package com.insurance.policy.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.policy.dto.GenerateProposalMessageResultResponseDto;
import com.insurance.policy.dto.GetQuoteRequestDto;
import com.insurance.policy.dto.GetQuoteResponseDto;
import com.insurance.policy.dto.GetRenewCoverDtlResponseDto;
import com.insurance.policy.dto.GetRenewalDetailsResultRequestDto;
import com.insurance.policy.dto.PaymentRequestDto;
import com.insurance.policy.dto.PaymentResponse;
import com.insurance.policy.dto.PaymentStatusRequestDto;
import com.insurance.policy.dto.PaymentStatusResponseDto;
import com.insurance.policy.dto.PolicyApproveRequestDto;
import com.insurance.policy.dto.PolicyApproveResponseDto;
import com.insurance.policy.dto.PolicyApproveResultResponseDto;
import com.insurance.policy.dto.RenewalDetailsResultResponseDto;
import com.insurance.policy.dto.RenewalDtlListResponseDto;
import com.insurance.policy.entity.InsuranceMotorEntity;
import com.insurance.policy.externalAPICall.service.GetQuoteAPICallService;
import com.insurance.policy.externalAPICall.service.GetRenewalDetailsResultService;
import com.insurance.policy.externalAPICall.service.InsuranceService;
import com.insurance.policy.externalAPICall.service.PaymentStatusService;
import com.insurance.policy.externalAPICall.service.PolicyApproveService;
import com.insurance.policy.repository.InsuranceMotorRepository;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@RestController
@RequestMapping("/insurance/other-api/")
@Slf4j
public class InsuranceDetailsController_bkp {
	
	@Autowired
	private InsuranceService vahanAPIService;
	
	@Autowired
	private GetQuoteAPICallService getQuoteAPICallService;
	
	@Autowired
	private PolicyApproveService policyApproveService;
	
	@Autowired
	private PaymentStatusService paymentStatusService;
	
	@Autowired
	private GetRenewalDetailsResultService getRenewalDetailsResultService;
	
	@Autowired
	private InsuranceMotorRepository insuranceMotorRepository;
	
	@PostMapping("/vehicle-details")
	public Map<String, Object> vehicleDetails(@RequestBody Map<String, Object> request){
		String rc_number = (String) request.get("rc_number");
		String refid = (String) request.get("refid");
		
		log.info("Request Details : rc_number :: {} , refid :: {}", rc_number, refid);
		return vahanAPIService.getVehicleDetails(rc_number, refid);
	}
	
	
	
	
	@PostMapping("/getQuote")
	public ResponseEntity<GetQuoteResponseDto> getQuote(@RequestBody GetQuoteRequestDto requestDto){
		log.info("GetQuoteRequestDto :: {}",requestDto.toString());
		GetQuoteResponseDto responseDto = getQuoteAPICallService.getQuote(requestDto);
		return new ResponseEntity<GetQuoteResponseDto>(responseDto, HttpStatus.OK);
	}
	
	@PostMapping("/policyApprove")
	public ResponseEntity<PolicyApproveResponseDto> policyApprove(@RequestBody PolicyApproveRequestDto requestDto){
		
		PolicyApproveResponseDto responseDto = new PolicyApproveResponseDto();
		if( requestDto.getProposalNo().isBlank() || requestDto.getProposalNo() == null 
				|| requestDto.getProposalNo().length() <= 0 ) {
			GenerateProposalMessageResultResponseDto dto1 = new GenerateProposalMessageResultResponseDto();
			dto1.setErrorMessage("Please enter ProposalNo");
			dto1.setSuccessMessage("");
			dto1.setResult("");
			PolicyApproveResultResponseDto dto2 = new PolicyApproveResultResponseDto();
			dto2.setErr_Desc("Please enter ProposalNo");
			dto2.setErr_Code("");
			dto2.setApprovePolNo("");
			dto2.setAprovePolSysId("");
			responseDto.setMessageResult(dto1);
			responseDto.setPolicyApproveResult(dto2);
			return new ResponseEntity<PolicyApproveResponseDto>(responseDto, HttpStatus.OK);
		}
		log.info("PolicyApproveRequestDto :: {}",requestDto.toString());
		
		InsuranceMotorEntity existing = new InsuranceMotorEntity();
		Optional<InsuranceMotorEntity> opt = this.insuranceMotorRepository.findByProposalNo(requestDto.getProposalNo());
		if(!opt.isPresent()) {
			GenerateProposalMessageResultResponseDto dto1 = new GenerateProposalMessageResultResponseDto();
			dto1.setErrorMessage("Please enter a valid ProposalNo");
			dto1.setSuccessMessage("");
			dto1.setResult("");
			PolicyApproveResultResponseDto dto2 = new PolicyApproveResultResponseDto();
			dto2.setErr_Desc("Please enter a valid ProposalNo");
			dto2.setErr_Code("");
			dto2.setApprovePolNo("");
			dto2.setAprovePolSysId("");
			responseDto.setMessageResult(dto1);
			responseDto.setPolicyApproveResult(dto2);
			return new ResponseEntity<PolicyApproveResponseDto>(responseDto, HttpStatus.OK);
		}
			existing = opt.get();
			if(!"1".equalsIgnoreCase(existing.getPayment_status_flag())) {
				GenerateProposalMessageResultResponseDto dto1 = new GenerateProposalMessageResultResponseDto();
				dto1.setErrorMessage("Please make payment of this ProposalNo");
				dto1.setSuccessMessage("");
				dto1.setResult("");
				PolicyApproveResultResponseDto dto2 = new PolicyApproveResultResponseDto();
				dto2.setErr_Desc("Please make payment of this ProposalNo");
				dto2.setErr_Code("");
				dto2.setApprovePolNo("");
				dto2.setAprovePolSysId("");
				responseDto.setMessageResult(dto1);
				responseDto.setPolicyApproveResult(dto2);
				return new ResponseEntity<PolicyApproveResponseDto>(responseDto, HttpStatus.OK);
			}
		
		
		responseDto = policyApproveService.palicyApprove(requestDto);
		return new ResponseEntity<PolicyApproveResponseDto>(responseDto, HttpStatus.OK);
	}
	
	
	
	@PostMapping("/paymentStatus")
	public ResponseEntity<PaymentStatusResponseDto> getPaymentStatus(@RequestBody PaymentStatusRequestDto requestDto){
		log.info("PaymentStatusRequestDto :: {}",requestDto.toString());
		PaymentStatusResponseDto responseDto = paymentStatusService.paymentStatusCheck(requestDto);	
		return new ResponseEntity<PaymentStatusResponseDto>(responseDto, HttpStatus.OK);
	}
	
	@PostMapping("/getRenewalDetail")
	public ResponseEntity<RenewalDetailsResultResponseDto> getQuote(@RequestBody GetRenewalDetailsResultRequestDto requestDto){
		log.info("GetRenewalDetailsResultRequestDto :: {}",requestDto.toString());
		RenewalDetailsResultResponseDto responseDto = getRenewalDetailsResultService.getRenewalDetailsResult(requestDto);
		if(responseDto.getMessageResult() == null) {
			responseDto.setMessageResult("");
		}
		RenewalDtlListResponseDto res1 = responseDto.getRenewalDtlList().get(0);
		if(res1.getGetRenewCoverDtl().size()==0) {
			GetRenewCoverDtlResponseDto res2 = new GetRenewCoverDtlResponseDto();
			res2.setCoverDesc("");
			res2.setPremium("");
			List<GetRenewCoverDtlResponseDto> list1 = new ArrayList<>();
			list1.add(res2);
			res1.setGetRenewCoverDtl(list1);
		}
		return new ResponseEntity<RenewalDetailsResultResponseDto>(responseDto, HttpStatus.OK);
	}
	
	
	
	// make payment part start's
	
	private static int count = -1;
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@PostMapping("/pay")
	public ResponseEntity<PaymentResponse> makePayment(@RequestBody PaymentRequestDto requestDto) {
		
		log.info("PaymentRequest Dto for Motor Insurance>>" + requestDto.toString());
		PaymentResponse response = new PaymentResponse();
		if(requestDto.getProposalNumber().isBlank() || requestDto.getProposalNumber() == null 
				|| requestDto.getProposalNumber().length()<=0 ) {
			response.setResponseStatus("Please enter Proposal Number!!");
			response.setPolicyNumber("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else if(requestDto.getVkid().isBlank() || requestDto.getVkid() == null 
				|| requestDto.getVkid().length()<=0) {
			response.setResponseStatus("Please enter vkid !!");
			response.setPolicyNumber("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else if(requestDto.getAmount().isBlank() || requestDto.getAmount() == null 
				|| requestDto.getAmount().length()<=0) {
			response.setResponseStatus("Please enter amount !!");
			response.setPolicyNumber("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}else if(requestDto.getProdCode().isBlank() || requestDto.getProdCode() == null
				|| requestDto.getProdCode().length()<=0) {
			response.setResponseStatus("Please enter ProdCode !!");
			response.setPolicyNumber("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		Optional<InsuranceMotorEntity> existingEntity = this.insuranceMotorRepository.findByProposalNo(requestDto.getProposalNumber().trim());
		InsuranceMotorEntity entity1 = new InsuranceMotorEntity();
		if(existingEntity.isEmpty()) {
			response.setResponseStatus("Please enter a valid Proposal Number!!");
			response.setPolicyNumber("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}else if(existingEntity.isPresent()) {
		entity1 = existingEntity.get();
		String proposalNo = requestDto.getProposalNumber();
		String policy_name = entity1.getRequest_name();
		String premium = requestDto.getAmount();
		String vkId = requestDto.getVkid();
		
		
		try {
        	JSONArray jas = new JSONArray();
        	String query1 = "{ CALL BankingKarnataka.WalletAccountBalance (?, ?) }";
			List<Map<String, Object>> output = new ArrayList();
			output = jdbcTemplate.queryForList(query1, new Object[] { vkId, premium });
			log.info("output of check wallet balance>>"+output);
			String pFlag = "";
						
			for(Map<String, Object> row : output) {
				pFlag = (String) row.get("status");
	    		log.info("pFlag>>>:" + pFlag);
	    		if(pFlag.startsWith("0")) {
	    			response.setPolicyNumber("");
	    			response.setResponseStatus("Insufficient Wallet Balance");
	    			return new ResponseEntity<>(response, HttpStatus.OK);
	    		}
	    	  }	        	
        } catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		
		try {

			JSONArray jas = new JSONArray();
			String txnId = generateRRN("4");// Motor Insurance ka rrn generate karne ke liye 4 paas karo
			log.info("txnId for motor insurance generated using generateRRN()>>" + txnId);
			log.info("policy_name>>" + policy_name);
			log.info("vkId>>" + vkId);
			log.info("txnId generated using generateRRN()>>" + txnId);
			log.info("txnId generated using generateRRN()>>" + txnId);
			String query1 = "{ CALL AdityaBirla.GET_SET_AdityaBirla_Commission_Transactions (?, ?, ?, ?) }";
			List<Map<String, Object>> output = new ArrayList();
//			output = jdbcTemplate.queryForList(query1, new Object[] { policy_name, vkId	, txnId, premium, proposalNo });
			output = jdbcTemplate.queryForList(query1, new Object[] { policy_name, vkId	, txnId, premium });
			log.info("output>>"+output);
			String paymentStatus = "";
			String policy_number = "";
						
			for(Map<String, Object> row : output) {
				paymentStatus = (String) row.get("Status");
	    		log.info("paymentStatus>>>:" + paymentStatus);
	    		
	    		if(row.containsKey("Status")) {
	    			
	    			paymentStatus = (String) row.get("Status");
	    			response.setPolicyNumber(requestDto.getProposalNumber());
	    			response.setResponseStatus(paymentStatus);
	    			return new ResponseEntity<>(response, HttpStatus.OK);
	    			
	    			 }else if(row.containsKey("updateStatus")) {
	    				 entity1 = existingEntity.get();
	    			String updateStatus = "";
	    			String openingBalance = "";
	    			String closingBalance = "";
	    			log.info("jasObject has updateStatus " + (String) row.get("updateStatus"));
	    			log.info("jasObject has openingBalance " + (String) row.get("openingBalance"));
	    			log.info("jasObject has closingBalance " + (String) row.get("closingBalance"));
	    			
	    			response.setResponseStatus(updateStatus);
	    			response.setPolicyNumber(requestDto.getProposalNumber());
	    			}
	    	  }
		
		}catch(Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
			response.setPolicyNumber("");
			response.setResponseStatus("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public String generateRRN(String partner) {
		try {
			long count1 = generateStan(partner);
			String stan = "111111" + count1;
			log.info("stan :" + stan);
			stan = stan.substring(stan.length() - 6, stan.length());
			log.info("stan value :--->" + stan);

			StringBuilder sb = new StringBuilder();
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			String hour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
			if (hour.length() == 1) {
				hour = "0" + hour;
			}
			// LOG.info("hour :" + hour);
			String doy = String.valueOf(cal.get(Calendar.DAY_OF_YEAR));
			if (doy.length() == 1) {
				doy = "00" + doy;
			} else if (doy.length() == 2) {
				doy = "0" + doy;
			}
			// LOG.info("doy :" + doy);
			String RRN = sb.append(Integer.toString(cal.get(Calendar.YEAR)).substring(3, 4)).append(doy).append(hour)
					.toString();
			log.info("RRN :" + RRN);
			return RRN + stan;
		} catch (Exception e) {
			log.error("Exception generateRRN :" + e);
			return "";
		}
	}

	private synchronized long generateStan(String partner) {
		if (count == -1) {

			long firstRRN = getFirstRRN(partner);
			log.info("firstRRN :" + firstRRN);
		}
		if (++count > 999999) {
			count = 1;
		}
		return count;
	}

	private Long getFirstRRN(String partner) {
		String procedure = "";

		procedure = "[AEPS].[getFPAEPSTXNMAXRRN]";

		Long count = 0L;
		try {
			log.info("Static block is starting " + new Date());

			String sql = "EXEC " + procedure;

			List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

			log.info("result value :----> " + resultList.size());

			if (resultList.isEmpty()) {
				log.info("RRN empty condition");
			} else {
				log.info("RRN true condition");
				Object rrnObj = resultList.get(0).get("vakrangee_reference_no");
				if (rrnObj == null || rrnObj.toString().trim().isEmpty()) {
					count = 0L;
				} else {
					String rrn = rrnObj.toString();
					log.info("rrn :" + rrn);
					String count1 = rrn.substring(rrn.length() - 6);
					log.info("count1 value :-->" + count1);
					count = Long.parseLong(count1);
				}
			}

		} catch (Exception e) {
			log.error("Exception inside AEPS BankingStan static block: ", e);
			count = 0L;
		}

		return count;
	}

	// make payment part end's
	
}



*/
