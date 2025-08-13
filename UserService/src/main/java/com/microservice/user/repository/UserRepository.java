package com.microservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	
	
	
}
