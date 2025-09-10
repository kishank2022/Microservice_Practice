package com.insurance.policy.externalAPICall.service;

import com.insurance.policy.dto.GenerateCarProposalRequestDto;
import com.insurance.policy.dto.GenerateCarProposalResponseDto;

public interface GenerateCarProposalService {

	public GenerateCarProposalResponseDto generateCarProposal(GenerateCarProposalRequestDto requestDto);
	
}
