package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.GenerateCarProposalResponseDto;
import com.insurance.policy.dto.GenerateTwoWheelerProposalRequestDto;

public interface GenerateTwoWheelerProposalService {

	public GenerateCarProposalResponseDto generateTwoWheelerProposal(GenerateTwoWheelerProposalRequestDto requestDto);
}
