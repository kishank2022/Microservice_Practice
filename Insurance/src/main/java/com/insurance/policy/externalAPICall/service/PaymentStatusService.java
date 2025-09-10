package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.PaymentStatusRequestDto;
import com.insurance.policy.dto.PaymentStatusResponseDto;

public interface PaymentStatusService {

	public PaymentStatusResponseDto paymentStatusCheck(PaymentStatusRequestDto requestDto);
}
