package com.insurance.policy.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

import com.insurance.policy.dto.GeneratePolicyReceiptRequestDto;
import com.insurance.policy.dto.GeneratePolicyReceiptResponseDto;
import com.insurance.policy.dto.GenerateProposalMessageResultResponseDto;
import com.insurance.policy.dto.GetQuoteRequestDto;
import com.insurance.policy.dto.GetQuoteResponseDto;
import com.insurance.policy.dto.GetRenewCoverDtlResponseDto;
import com.insurance.policy.dto.GetRenewalDetailsResultRequestDto;
import com.insurance.policy.dto.PaymentRequestDto;
import com.insurance.policy.dto.PaymentResponse;
import com.insurance.policy.dto.PaymentResponseDto;
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
import com.insurance.policy.externalAPICall.service.PolicyScheduleURLService;
import com.insurance.policy.repository.InsuranceMotorRepository;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/insurance/other-api/")
@Slf4j
public class InsuranceDetailsController {

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

	@Autowired
	private PolicyScheduleURLService policyScheduleURLService;

	@PostMapping("/vehicle-details")
	public Map<String, Object> vehicleDetails(@RequestBody Map<String, Object> request) {
		String rc_number = (String) request.get("rc_number");
		String refid = (String) request.get("refid");

		log.info("Request Details : rc_number :: {} , refid :: {}", rc_number, refid);
		return vahanAPIService.getVehicleDetails(rc_number, refid);
	}

	@PostMapping("/getQuote")
	public ResponseEntity<GetQuoteResponseDto> getQuote(@RequestBody GetQuoteRequestDto requestDto) {
		log.info("GetQuoteRequestDto :: {}", requestDto.toString());
		GetQuoteResponseDto responseDto = getQuoteAPICallService.getQuote(requestDto);
		return new ResponseEntity<GetQuoteResponseDto>(responseDto, HttpStatus.OK);
	}

	@PostMapping("/policyApprove")
	public ResponseEntity<PolicyApproveResponseDto> policyApprove(@RequestBody PolicyApproveRequestDto requestDto) {

		PolicyApproveResponseDto responseDto = new PolicyApproveResponseDto();
		if (requestDto.getProposalNo().isBlank() || requestDto.getProposalNo() == null
				|| requestDto.getProposalNo().length() <= 0) {
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
		log.info("PolicyApproveRequestDto :: {}", requestDto.toString());

		InsuranceMotorEntity existing = new InsuranceMotorEntity();
		Optional<InsuranceMotorEntity> opt = this.insuranceMotorRepository.findByProposalNo(requestDto.getProposalNo());
		if (!opt.isPresent()) {
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
		if (!"1".equalsIgnoreCase(existing.getPayment_status_flag())) {
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
	public ResponseEntity<PaymentStatusResponseDto> getPaymentStatus(@RequestBody PaymentStatusRequestDto requestDto) {
		log.info("PaymentStatusRequestDto :: {}", requestDto.toString());
		PaymentStatusResponseDto responseDto = paymentStatusService.paymentStatusCheck(requestDto);
		return new ResponseEntity<PaymentStatusResponseDto>(responseDto, HttpStatus.OK);
	}

	@PostMapping("/getRenewalDetail")
	public ResponseEntity<RenewalDetailsResultResponseDto> getQuote(
			@RequestBody GetRenewalDetailsResultRequestDto requestDto) {
		log.info("GetRenewalDetailsResultRequestDto :: {}", requestDto.toString());
		RenewalDetailsResultResponseDto responseDto = getRenewalDetailsResultService
				.getRenewalDetailsResult(requestDto);
		if (responseDto.getMessageResult() == null) {
			responseDto.setMessageResult("");
		}
		RenewalDtlListResponseDto res1 = responseDto.getRenewalDtlList().get(0);
		if (res1.getGetRenewCoverDtl().size() == 0) {
			GetRenewCoverDtlResponseDto res2 = new GetRenewCoverDtlResponseDto();
			res2.setCoverDesc("");
			res2.setPremium("");
			List<GetRenewCoverDtlResponseDto> list1 = new ArrayList<>();
			list1.add(res2);
			res1.setGetRenewCoverDtl(list1);
		}
		return new ResponseEntity<RenewalDetailsResultResponseDto>(responseDto, HttpStatus.OK);
	}

	@PostMapping("/generateReceiptUrl")
	public ResponseEntity<GeneratePolicyReceiptResponseDto> generateReceiptUrl(
			@RequestBody GeneratePolicyReceiptRequestDto requestDto) {
		log.info("GeneratePolicyReceiptRequestDto :: {}", requestDto.toString());
		GeneratePolicyReceiptResponseDto responseDto = new GeneratePolicyReceiptResponseDto();
		InsuranceMotorEntity entity1 = new InsuranceMotorEntity();
		try {
			Optional<InsuranceMotorEntity> opt1 = this.insuranceMotorRepository
					.findByProposalNo(requestDto.getProposalNo());
			if (opt1.isEmpty()) {
				responseDto.setProposalNo("");
				responseDto.setReceiptUrl("");
				responseDto.setMessage("Enter valid proposal number!");
				return new ResponseEntity<GeneratePolicyReceiptResponseDto>(responseDto, HttpStatus.OK);
			} else if (opt1.isPresent()) {
				entity1 = opt1.get();
				log.info("InsuranceMotorEntity in generate Receipt>>" + requestDto.toString());
				if ("0".equalsIgnoreCase(entity1.getPayment_status_flag())) {
					responseDto.setProposalNo("");
					responseDto.setReceiptUrl("");
					responseDto.setMessage("Please make payment of this proposal number ");
					return new ResponseEntity<GeneratePolicyReceiptResponseDto>(responseDto, HttpStatus.OK);
				}
				responseDto = this.policyScheduleURLService.generateReceiptUrl(requestDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
		}
		log.info("GeneratePolicyReceiptResponseDto in controller>>" + responseDto.toString());
		return new ResponseEntity<GeneratePolicyReceiptResponseDto>(responseDto, HttpStatus.OK);
	}

	// make payment part start's

	private static int count = -1;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PostMapping("/pay")
	public ResponseEntity<PaymentResponseDto> makePayment(@RequestBody PaymentRequestDto requestDto) {
		
		log.info("PaymentRequest Dto for Motor Insurance>>" + requestDto.toString());
		PaymentResponseDto response = new PaymentResponseDto();
		if(requestDto.getProposalNumber().isBlank() || requestDto.getProposalNumber() == null 
				|| requestDto.getProposalNumber().length()<=0 ) {
			response.setResult("Failed");
			response.setErrorMessage("Please enter Proposal Number!!");
			response.setSuccessMessage("Please enter Proposal Number!!");
			response.setApprovePolNo("");
			response.setApprovePolSysId("");
			response.setErr_Desc("Please enter Proposal Number!!");
			response.setErr_Code("");
			response.setPolicyScheduleURLResult("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else if(requestDto.getVkid().isBlank() || requestDto.getVkid() == null 
				|| requestDto.getVkid().length()<=0) {
			response.setResult("Failed");
			response.setErrorMessage("Please enter vkid !!");
			response.setSuccessMessage("Please enter vkid !!");
			response.setApprovePolNo("");
			response.setApprovePolSysId("");
			response.setErr_Desc("Please enter vkid !!");
			response.setErr_Code("");
			response.setPolicyScheduleURLResult("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else if(requestDto.getAmount().isBlank() || requestDto.getAmount() == null 
				|| requestDto.getAmount().length()<=0) {
			response.setResult("Failed");
			response.setErrorMessage("Please enter amount !!");
			response.setSuccessMessage("Please enter amount !!");
			response.setApprovePolNo("");
			response.setApprovePolSysId("");
			response.setErr_Desc("Please enter amount !!");
			response.setErr_Code("");			
			response.setPolicyScheduleURLResult("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}else if(requestDto.getProdCode().isBlank() || requestDto.getProdCode() == null
				|| requestDto.getProdCode().length()<=0) {
			response.setResult("Failed");
			response.setErrorMessage("Please enter ProdCode !!");
			response.setSuccessMessage("Please enter ProdCode !!");
			response.setApprovePolNo("");
			response.setApprovePolSysId("");
			response.setErr_Desc("Please enter ProdCode !!");
			response.setErr_Code("");			
			response.setPolicyScheduleURLResult("");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		Optional<InsuranceMotorEntity> existingEntity = this.insuranceMotorRepository.findByProposalNo(requestDto.getProposalNumber().trim());
		InsuranceMotorEntity entity1 = new InsuranceMotorEntity();
		if(existingEntity.isEmpty()) {			
			response.setResult("Failed");
			response.setErrorMessage("Please enter a valid Proposal Number!!");
			response.setSuccessMessage("Please enter a valid Proposal Number!!");
			response.setApprovePolNo("");
			response.setApprovePolSysId("");
			response.setErr_Desc("Please enter a valid Proposal Number!!");
			response.setErr_Code("");			
			response.setPolicyScheduleURLResult("");			
			return new ResponseEntity<>(response, HttpStatus.OK);
		}else if(existingEntity.isPresent()) {
		entity1 = existingEntity.get();
		
		if("1".equalsIgnoreCase(entity1.getPayment_status_flag()) 
				&& entity1.getPolicy_schedule_url_result()!=null) {
			response.setResult("Success");
			response.setErrorMessage("Policy approved for this proposal no.");
			response.setSuccessMessage("Policy approved for this proposal no.");
			response.setApprovePolNo(entity1.getApprovePolNo());
			response.setApprovePolSysId(entity1.getApprovePolSysId());
			response.setErr_Desc(entity1.getError_Desc());
			response.setErr_Code(entity1.getErr_Code());
			response.setPayStatus("5");
			response.setPolicyScheduleURLResult(entity1.getPolicy_schedule_url_result());
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		String proposalNo = requestDto.getProposalNumber();
		String policy_name = entity1.getRequest_name();
		String premium = requestDto.getAmount();
		String vkId = requestDto.getVkid();
		
		String txnId = generateRRN("4"); // Shriram motor insurance ka rrn generate karne ke liye 4 paas karo
        log.info("txnId generated using generateRRN()>for Shriram motor insurance>" + txnId);  
        String pFlag = "";
        String service_id = "";
		String sub_service_id = "";
		String sub_sub_service_id = "";
		String sub_sub_sub_service_id = "";
		String service_rate = "";
		String update_status = ""; 
		String opening_Balance = "";
		String closing_Balance = "";
		
		String c_update_status = ""; 
		String c_opening_Balance = "";
		String c_closing_Balance = "";
        
        /*
         // for testing purpose we are commenting payment part
		try {
			
			// checking the wallet balance  
        	JSONArray jas = new JSONArray();
        	String query1 = "{ CALL BankingKarnataka.WalletAccountBalance (?, ?) }";
			List<Map<String, Object>> output = new ArrayList();
			output = jdbcTemplate.queryForList(query1, new Object[] { vkId, premium });
			log.info("output of check wallet balance>>"+output);
			
						
			for(Map<String, Object> row : output) {
				pFlag = (String) row.get("status");
	    		log.info("pFlag>>>:" + pFlag);
	    		if(pFlag.startsWith("0")) {
	    			response.setResult("Failed");
	    			response.setErrorMessage("Insufficient Wallet Balance!!");
	    			response.setSuccessMessage("Insufficient Wallet Balance!!");
	    			response.setApprovePolNo("");
	    			response.setApprovePolSysId("");
	    			response.setErr_Desc("Insufficient Wallet Balance!!");
	    			response.setErr_Code("");
	    			response.setPayStatus("0");
	    			response.setPolicyScheduleURLResult("");
	    			return new ResponseEntity<>(response, HttpStatus.OK);
	    		}
	    	  }	        	
	        } catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				response.setResult("Failed");
				response.setErrorMessage("Something went wrong, unable to fetch wallet balance!!");
				response.setSuccessMessage("Something went wrong, unable to fetch wallet balance!!");
				response.setApprovePolNo("");
				response.setApprovePolSysId("");
				response.setErr_Desc("Something went wrong, unable to fetch wallet balance!!");
				response.setErr_Code("");
				response.setPayStatus("0");
				response.setPolicyScheduleURLResult("");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		
		// vakrangee wallet ko debit karo 
        // calling [CCAvenue].[getServiceDetails] to get the service id, sub service id, subsubsubServiceId
		//  and calling VLPaymentGateway.DebitTransaction to do the payment 
		try {			
			log.info("Calling SP to get serviceId, SubServiceId, SubSubServiceId etc..");
			String s1 = getDbConstantValues("KAVACH_GET_SERVICE_DETAILS");
			log.info("GET SERVICE SUB SERVICE SUB SUB SERIICE NAME for Motor insurance >>"+s1);
			String query1 = "{ CALL CCAvenue.getServiceDetails (?) }";
			List<Map<String, Object>> output = new ArrayList();
			output = jdbcTemplate.queryForList(query1, new Object[] { s1 });
			log.info("output of check wallet balance>>"+output);
			
			for(Map<String, Object> row : output) {
				service_id = row.containsKey("service_id") ? (String) row.get("service_id") : ""; 
				sub_service_id = row.containsKey("sub_service_id") ? (String) row.get("sub_service_id") : ""; 
				sub_sub_service_id = row.containsKey("sub_sub_service_id") ? (String) row.get("sub_sub_service_id") : ""; 
				sub_sub_sub_service_id = row.containsKey("sub_sub_sub_service_id") ? (String) row.get("sub_sub_sub_service_id") : "";
				service_rate = row.containsKey("service_rate") ? (String) row.get("service_rate") : "";
	    	  }	 
			log.info("service_id>>" + service_id);
			log.info("sub_service_id>>" + sub_service_id);
			log.info("sub_sub_service_id>>" + sub_sub_service_id);
			log.info("sub_sub_sub_service_id>>" + sub_sub_sub_service_id);
			log.info("service_rate>>" + service_rate);
			
			////////////////////////////////////////////////////
			
			// [VLPaymentGateway].[DebitTransaction] @transactionId, @particular, @serviceId, @subServiceId, @subSubServiceId, @subSubSubServiceId
			// @vkid, @walletId, @transactionAmount, @bcid, @rrnnumber, @transactionauthenticationtype, @transaction_type
			
			log.info("Calling SP to dbit the wallet, we are dong Motor insurance Payment...");
			String particular = "Shriram Motor";
			String walletId = "1";
			String query2 = "{ CALL VLPaymentGateway.DebitTransaction (?,?,?,?,?,?,?,?,?) }";
			List<Map<String, Object>> output2 = new ArrayList();
			output2 = jdbcTemplate.queryForList(query2, new Object[] { txnId, particular, service_id, sub_service_id,
					sub_sub_service_id, sub_sub_sub_service_id, vkId, walletId, premium });
			log.info("output of check wallet balance>>"+output);
			
			
			
			for(Map<String, Object> row : output2) {
				log.info("row.containsKey(\"Status\") in debit wallet time" + row.containsKey("Status"));
				
				if(row.containsKey("Status")) {					
					response.setResult("Failed");
					response.setErrorMessage(row.containsKey("Status") ? (String) row.get("Status") : "");
					response.setSuccessMessage(row.containsKey("Status") ? (String) row.get("Status") : "");
					response.setApprovePolNo("");
					response.setApprovePolSysId("");
					response.setErr_Desc(row.containsKey("Status") ? (String) row.get("Status") : "");
					response.setErr_Code("");
					response.setPayStatus("1");
					response.setPolicyScheduleURLResult("");
					return new ResponseEntity<>(response, HttpStatus.OK);					
				}
				
				update_status = row.containsKey("update_status") ? (String) row.get("update_status") : ""; 
				opening_Balance = row.containsKey("opening_Balance") ? (String) row.get("opening_Balance") : ""; 
				closing_Balance = row.containsKey("closing_Balance") ? (String) row.get("closing_Balance") : ""; 
	    	  }	 
			log.info("update_status>>" + update_status);
			log.info("opening_Balance>>" + opening_Balance);
			log.info("closing_Balance>>" + closing_Balance);
			
			
			//////////////////////////////////
			// provide commission for doing the payment ///
			
			log.info("Calling SP to provide comission we are providing comission for motor insurance payment...");
			log.info("policy_name>>" + policy_name);
			log.info("vkId>>" + vkId);
			log.info("txnId generated using generateRRN()>>" + txnId);
			String query3 = "{ CALL AdityaBirla.GET_SET_AdityaBirla_Commission_Transactions (?, ?, ?, ?) }";
			List<Map<String, Object>> output3 = new ArrayList();
			output3 = jdbcTemplate.queryForList(query3, new Object[] { policy_name, vkId, txnId, premium });
			log.info("output>>"+output);
			String paymentStatus = "";
			String policy_number = "";
			
			for(Map<String, Object> row : output3) {
				log.info("row.containsKey(\"Status\")>>commission ke time pe>:" + row.containsKey("Status"));
				if(row.containsKey("Status")) {					
					response.setResult("Failed");
					response.setErrorMessage(row.containsKey("Status") ? (String) row.get("Status") : "");
					response.setSuccessMessage(row.containsKey("Status") ? (String) row.get("Status") : "");
					response.setApprovePolNo("");
					response.setApprovePolSysId("");
					response.setErr_Desc(row.containsKey("Status") ? (String) row.get("Status") : "");
					response.setErr_Code("");
					response.setPayStatus("2");
					response.setPolicyScheduleURLResult("");
					return new ResponseEntity<>(response, HttpStatus.OK);					
				}
				else if(row.containsKey("updateStatus")) {
	    				 
	    				 c_update_status = (String) row.get("updateStatus");
	    				 c_opening_Balance = (String) row.get("openingBalance");
	    				 c_closing_Balance = (String) row.get("closingBalance");
	    			 }
				log.info("jasObject has c_update_status " + c_update_status);
				log.info("jasObject has c_opening_Balance " + c_opening_Balance);
				log.info("jasObject has c_closing_Balance " + c_closing_Balance);
				
				entity1.setPayment_status_flag("1");
				entity1.setPayment_transaction_amount(premium);
				entity1.setPayment_transaction_id(txnId);
				entity1.setPayment_transaction_remark("Payment done successfully, with comission!!");
				entity1.setPayment_transaction_status("1");
				entity1.setPaymentType("CD");
				
				entity1 = this.insuranceMotorRepository.save(entity1);
				
			}	
			
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				response.setResult("Failed");
				response.setErrorMessage("Something went wrong, unable to fetch wallet balance!!");
				response.setSuccessMessage("Something went wrong, unable to fetch wallet balance!!");
				response.setApprovePolNo("");
				response.setApprovePolSysId("");
				response.setErr_Desc("Something went wrong, unable to fetch wallet balance!!");
				response.setErr_Code("");			
				response.setPolicyScheduleURLResult("");
				response.setPayStatus("0");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		         // for testing purpose we are commenting payment part
		
		*/
		
		try {
					entity1.setPayment_status_flag("1");
	    			entity1.setTransactionNumber(txnId);
	    			entity1.setCardNumber("");
	    			entity1.setCardholderName("");
	    			entity1.setCardType("");
	    			entity1.setCardValidUpTo("");
	    			entity1.setBankName("");
	    			entity1.setBranchName("");
	    			entity1.setPaymentType("CD");
	    			LocalDate today = LocalDate.now();
	    			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    			String formattedDate = today.format(formatter);
	    			log.info("formattedDate = TransactionDate ==" + formattedDate);
	    			LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
	    			log.info("Parsed LocalDate: " + parsedDate);
	    			entity1.setTransactionDate(parsedDate);
	    			entity1.setChequeType("");
	    			entity1.setChequeClearType("");
	    			entity1.setCashType("");
	    			entity1.setAmount(new BigDecimal(requestDto.getAmount()));
	    			entity1.setAmount1(new BigDecimal(requestDto.getAmount()));
	    			
	    			entity1 = this.insuranceMotorRepository.save(entity1);
	    			
	    			PolicyApproveRequestDto pardrequest = new PolicyApproveRequestDto();
	    			
	    			pardrequest.setProposalNo(entity1.getProposalNo());
	    			pardrequest.setTransactionNumber(entity1.getTransactionNumber());
	    			pardrequest.setCardNumber("");
	    			pardrequest.setCardholderName("");
	    			pardrequest.setCardType("");
	    			pardrequest.setCardValidUpTo("");
	    			pardrequest.setBankName("");
	    			pardrequest.setBranchName("");
	    			pardrequest.setPaymentType(entity1.getPaymentType());
	    	        pardrequest.setChequeType("");
	    	        pardrequest.setChequeClearType("");
	    	        pardrequest.setCashType("");
	    	        pardrequest.setPremiumAmt(requestDto.getAmount());
	    	        LocalDate ld1 = LocalDate.parse(entity1.getTransactionDate().toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	    	        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	    	        String fd1 = ld1.format(df1);
	    	        log.info("fd1==" + fd1);
	    	        pardrequest.setTransactionDate(fd1);
	    	        
	    	        ResponseEntity<PolicyApproveResponseDto> pardResponse =  policyApprove(pardrequest);
	    	        PolicyApproveResponseDto responseDto1 = pardResponse.getBody();
	    	        log.info("PolicyApprove Response ==" + responseDto1.toString());
	    	        
	    	        if(!"Success".equalsIgnoreCase(responseDto1.getMessageResult().getResult()) 
	    	        		|| responseDto1.getPolicyApproveResult().getApprovePolNo().isEmpty() 
	    	        		|| responseDto1.getPolicyApproveResult().getAprovePolSysId().isEmpty()) 
	    	        {	    	        	
	    	        	response.setResult(responseDto1.getMessageResult().getResult());
	    				response.setErrorMessage(responseDto1.getMessageResult().getErrorMessage());
	    				response.setSuccessMessage(responseDto1.getMessageResult().getSuccessMessage());
	    				response.setApprovePolNo(responseDto1.getPolicyApproveResult().getApprovePolNo());
	    				response.setApprovePolSysId(responseDto1.getPolicyApproveResult().getAprovePolSysId());
	    				response.setErr_Desc(responseDto1.getPolicyApproveResult().getErr_Desc());
	    				response.setErr_Code(responseDto1.getPolicyApproveResult().getErr_Code());			
	    				response.setPolicyScheduleURLResult("");
	    				response.setPayStatus("3");
	    				return new ResponseEntity<>(response, HttpStatus.OK);	    				
	    	        }
	    	        
	    	        
	    	        
	    	        response.setResult(responseDto1.getMessageResult().getResult());
	    	        response.setErrorMessage(responseDto1.getMessageResult().getErrorMessage());
	    	        response.setSuccessMessage(responseDto1.getMessageResult().getSuccessMessage());
	    	        response.setApprovePolNo(responseDto1.getPolicyApproveResult().getApprovePolNo());
	    	        response.setApprovePolSysId(responseDto1.getPolicyApproveResult().getAprovePolSysId());
	    	        response.setErr_Desc(responseDto1.getPolicyApproveResult().getErr_Desc());
	    	        response.setErr_Code(responseDto1.getPolicyApproveResult().getErr_Code());
	    	        response.setPolicyScheduleURLResult("");
	    	        
	    	        response.setPayStatus("4");
	    	        GeneratePolicyReceiptResponseDto receiptResponse = new GeneratePolicyReceiptResponseDto();
	    	        if(responseDto1.getPolicyApproveResult().getAprovePolSysId() != null 
	    	        		&& !responseDto1.getPolicyApproveResult().getAprovePolSysId().isEmpty()) {	    	        	
	    	        	GeneratePolicyReceiptRequestDto receiptRequestDto = new GeneratePolicyReceiptRequestDto();
	    	        	receiptRequestDto.setProposalNo(entity1.getProposalNo());
	    	        	ResponseEntity<GeneratePolicyReceiptResponseDto> receipt = generateReceiptUrl(receiptRequestDto);
	    	        	log.info("receipt>>"+receipt.toString());
	    	        	receiptResponse = receipt.getBody();
	    	        	log.info("receiptResponse>>"+receiptResponse.toString());	    	        	
	    	        	response.setPolicyScheduleURLResult(receiptResponse.getReceiptUrl());
	    	        	if(receiptResponse.getReceiptUrl().length()>2) {
	    	        	response.setPayStatus("10");
	    	        	}
	    	        }
	    	        
		
		}catch(Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());			
			response.setResult("Failed");
			response.setErrorMessage(e.getMessage());
			response.setSuccessMessage(e.getMessage());
			response.setApprovePolNo("");
			response.setApprovePolSysId("");
			response.setErr_Desc(e.getMessage());
			response.setErr_Code("");			
			response.setPolicyScheduleURLResult("");
			response.setPayStatus("3");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		
		}
		log.info("response of pay motor insurance>>"+response.toString());
		
		return new ResponseEntity<>(response,HttpStatus.OK);

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

	public String getDbConstantValues(String key) {
		String response = "";
		log.info("DB Key:"+key);
		try {// select * from vkms.vkms_properties_master where vkms_property_key = 'CHOICECONNECTSECRETKEY';
			String query = "select vkms_property_value from vkms.vkms_properties_master where vkms_property_key = '"+key+"'";
    		List<Map<String, Object>> constantValue = jdbcTemplate.queryForList(query);
    		Map<String, Object> map1 = constantValue.get(0);
    		response =   map1.get("vkms_property_value").toString().trim();
		}catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
		}
		log.info("DB Value:"+response);
		return response;
	}

}
