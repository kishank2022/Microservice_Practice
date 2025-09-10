package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.GetQuoteRequestDto;
import com.insurance.policy.dto.GetQuoteResponseDto;

public interface GetQuoteAPICallService {

	public GetQuoteResponseDto getQuote(GetQuoteRequestDto requestDto);
}
