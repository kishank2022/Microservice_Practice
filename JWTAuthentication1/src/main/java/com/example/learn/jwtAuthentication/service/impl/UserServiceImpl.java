package com.example.learn.jwtAuthentication.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.learn.jwtAuthentication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	// Step 8 - this is method to get the username from repository layer this is our service layer 
	// created userDetailsService method 
	// Step 9 - create token expiry and validity
	public UserDetailsService userDetailsService() {
		return new UserDetailsService() {
			
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				return userRepository.findByUserName(username)
						.orElseThrow( () -> new UsernameNotFoundException(username+" not found!!"));
			}
		};
	}
	
}
