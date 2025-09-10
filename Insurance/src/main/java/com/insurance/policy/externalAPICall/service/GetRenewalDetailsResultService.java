package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.GetRenewalDetailsResultRequestDto;
import com.insurance.policy.dto.RenewalDetailsResultResponseDto;

public interface GetRenewalDetailsResultService {

	public RenewalDetailsResultResponseDto getRenewalDetailsResult(GetRenewalDetailsResultRequestDto requestDto);
}
