package com.example.learn.jwtAuthentication.service.impl;

import com.example.learn.jwtAuthentication.dto.JWTAuthenticationResponseDto;
import com.example.learn.jwtAuthentication.dto.RefreshTokenRequestDto;
import com.example.learn.jwtAuthentication.dto.SignInRequestDto;
import com.example.learn.jwtAuthentication.dto.SignUpRequestDto;
import com.example.learn.jwtAuthentication.entity.User;

public interface AuthenticationService {

	public User signUp(SignUpRequestDto requestDto);
	
	public JWTAuthenticationResponseDto signIn(SignInRequestDto signInRequestDto);
	
	public JWTAuthenticationResponseDto refreshToken(RefreshTokenRequestDto requestDto);
}
