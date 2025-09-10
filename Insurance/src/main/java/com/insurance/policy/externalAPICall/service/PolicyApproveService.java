package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.PolicyApproveRequestDto;
import com.insurance.policy.dto.PolicyApproveResponseDto;

public interface PolicyApproveService {

	public PolicyApproveResponseDto palicyApprove(PolicyApproveRequestDto requestDto);
}
