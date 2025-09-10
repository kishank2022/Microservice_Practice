package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.GeneratePCCVProposalRequestDto;
import com.insurance.policy.dto.GeneratePCCVProposalResponseDto;

public interface GeneratePCCVProposalService {

	public GeneratePCCVProposalResponseDto generatePCCVProposal(GeneratePCCVProposalRequestDto requestDto);
}
