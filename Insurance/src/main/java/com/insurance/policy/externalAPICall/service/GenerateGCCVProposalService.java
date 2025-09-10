package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.GenerateGCCVProposalRequestDto;
import com.insurance.policy.dto.GenerateGCCVProposalResponseDto;

public interface GenerateGCCVProposalService {

	public GenerateGCCVProposalResponseDto generateGCCVProposal(GenerateGCCVProposalRequestDto requestDto);
}
