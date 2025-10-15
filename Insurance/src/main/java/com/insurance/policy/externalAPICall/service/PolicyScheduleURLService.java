package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.GeneratePolicyReceiptRequestDto;
import com.insurance.policy.dto.GeneratePolicyReceiptResponseDto;

public interface PolicyScheduleURLService {

	public GeneratePolicyReceiptResponseDto generateReceiptUrl(GeneratePolicyReceiptRequestDto requestDto);
	
}
