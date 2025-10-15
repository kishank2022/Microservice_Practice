package com.insurance.policy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.policy.entity.InsuranceMotorEntity;

@Repository
public interface InsuranceMotorRepository extends JpaRepository<InsuranceMotorEntity, Long>{

	Optional<InsuranceMotorEntity> findByProposalNo(String proposalNo);
}
