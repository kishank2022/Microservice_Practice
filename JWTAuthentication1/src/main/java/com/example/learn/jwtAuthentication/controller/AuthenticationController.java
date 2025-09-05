package com.example.learn.jwtAuthentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn.jwtAuthentication.dto.JWTAuthenticationResponseDto;
import com.example.learn.jwtAuthentication.dto.RefreshTokenRequestDto;
import com.example.learn.jwtAuthentication.dto.SignInRequestDto;
import com.example.learn.jwtAuthentication.dto.SignUpRequestDto;
import com.example.learn.jwtAuthentication.entity.User;
import com.example.learn.jwtAuthentication.service.impl.AuthenticationService;

// // Step 16 - created authentication controller 
// Step 17 - Created default user with role admin in main method class

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
	
	private AuthenticationService authenticationService;
	
	public AuthenticationController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	
	@PostMapping("/signup")
	public ResponseEntity<User> signup(@RequestBody SignUpRequestDto requestDto){
		return new ResponseEntity<User>(authenticationService.signUp(requestDto), HttpStatus.CREATED);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<JWTAuthenticationResponseDto> signin(@RequestBody SignInRequestDto requestDto){
		return new ResponseEntity<JWTAuthenticationResponseDto>(authenticationService.signIn(requestDto), HttpStatus.OK);
	}
	
	//Step 18 me aaega yh generate refresh token ka code hai yh 
	// Step 19 me Admin controller ka cpde lokho 
	@PostMapping("/refresh")
	public ResponseEntity<JWTAuthenticationResponseDto> refresh(@RequestBody RefreshTokenRequestDto requestDto){
		return new ResponseEntity<JWTAuthenticationResponseDto>(authenticationService.refreshToken(requestDto),
				HttpStatus.OK);
	}
}
