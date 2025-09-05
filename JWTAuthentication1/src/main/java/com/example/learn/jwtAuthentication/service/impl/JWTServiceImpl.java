package com.example.learn.jwtAuthentication.service.impl;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTServiceImpl implements JWTService{

//	Step - 4 Generate token methods,  getSigninKey method
	// step 5 - create extractClaims method and  extractAllClaims methods 
	public String generateToken(UserDetails userDetails) {
		return Jwts.builder().setSubject(userDetails.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000*60*24 ))
				.signWith(getSigninKey(), SignatureAlgorithm.HS256)
				.compact();
	}
	
	
	public String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails) {
		return Jwts.builder().setSubject(userDetails.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 604800000 ))
				.signWith(getSigninKey(), SignatureAlgorithm.HS256)
				.compact();
	}
	
	private Key getSigninKey() {
        String base64Key = "MDEyMzQ1Njc4OWFiY2RlZmdoaWprbG1ub3BxcnN0dXZ3eHl6MDEyMzQ1Njc4OWFiY2RlZg==";
		byte [] key = Decoders.BASE64.decode(base64Key);
		return Keys.hmacShaKeyFor(key);
	}
	
	// step 5 -  create extractClaims method and  extractAllClaims methods 
	private <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}
	
	// step 5 -  create extractClaims method and  extractAllClaims methods 
	private Claims extractAllClaims(String token) {
		return Jwts.parserBuilder()
				.setSigningKey(getSigninKey())
				.build()
				.parseClaimsJws(token)
				.getBody();
	}
	
	// Step 6 - extract userName from token 
	// Step 7 - create JwtAuthenticationFilter.java class
	public String extractUserName(String token) {
		return extractClaim(token, Claims::getSubject);
	}
	
	// // Step 9 - create token expiry and validity
	public boolean isTokenValid(String token, UserDetails userDetails) {
		final String username = extractUserName(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
	//// Step 9 - create token expiry and validity
//	Step 10 vapas JwtAuthenticationFilter.doFilterInternal method ke pass jao
	private boolean isTokenExpired(String token) {
		return extractClaim(token, Claims::getExpiration).before(new Date());
	}
	
}
