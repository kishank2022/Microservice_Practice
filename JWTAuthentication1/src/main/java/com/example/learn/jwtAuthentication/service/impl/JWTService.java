package com.example.learn.jwtAuthentication.service.impl;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {

	public String extractUserName(String token);
	
	public String generateToken(UserDetails userDetails);
	
	public boolean isTokenValid(String token, UserDetails userDetails);
	
	public String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);
}
