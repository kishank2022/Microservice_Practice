package com.example.learn.jwtAuthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learn.jwtAuthentication.entity.Role;
import com.example.learn.jwtAuthentication.entity.User;
import java.util.List;
import java.util.Optional;


// Step 2 - creating repository layers, 
// Step 3 - adding jwt token dependency in pom.xml file 

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
	List<User> findByRole(Role role);
}
