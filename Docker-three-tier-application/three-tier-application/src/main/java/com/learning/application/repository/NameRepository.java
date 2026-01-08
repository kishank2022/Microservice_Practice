package com.learning.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.application.entity.Name;

@Repository
public interface NameRepository extends JpaRepository<Name, Long>{

	public Optional<String> findByName(String name);
}
