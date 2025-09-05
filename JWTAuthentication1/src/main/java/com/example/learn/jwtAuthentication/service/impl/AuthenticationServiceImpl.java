package com.example.learn.jwtAuthentication.service.impl;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.learn.jwtAuthentication.dto.JWTAuthenticationResponseDto;
import com.example.learn.jwtAuthentication.dto.RefreshTokenRequestDto;
import com.example.learn.jwtAuthentication.dto.SignInRequestDto;
import com.example.learn.jwtAuthentication.dto.SignUpRequestDto;
import com.example.learn.jwtAuthentication.entity.Role;
import com.example.learn.jwtAuthentication.entity.User;
import com.example.learn.jwtAuthentication.repository.UserRepository;

// Step 15 - Create SignupRequest Dto and contrroller and service layers , 
// created AuthenticationServiceImpl to save signup reuest data.
// Step 16 - created authentication controller 


@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	private UserRepository userRepository;
	
	private PasswordEncoder passwordEncoder;
	
	private AuthenticationManager authenticationManager;
	
	private JWTService jWTService;
	
	

	public AuthenticationServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder,
			AuthenticationManager authenticationManager, JWTService jWTService) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.authenticationManager = authenticationManager;
		this.jWTService = jWTService;
	}

	public User signUp(SignUpRequestDto requestDto) {
		User user = new User();
		user.setUserEmail(requestDto.getUserEmail());
		user.setUserName(requestDto.getUserName());
		user.setRole(Role.ADMIN);
		user.setPassword(passwordEncoder.encode(requestDto.getPassword()));
		return userRepository.save(user);
	}
	
	// Step 17 create Siginrequest Dto and then check the request is present or not 
	// create token and refresh token accordingly 
	// Step 18 - jwtService Impl class me refresh token ka code likho 
	public JWTAuthenticationResponseDto signIn(SignInRequestDto signInRequestDto)
	{
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(signInRequestDto.getUserName(), signInRequestDto.getPassword()));
		Optional<User> user1 = userRepository.findByUserName(signInRequestDto.getUserName());
		if(!user1.isPresent()) {
			throw new IllegalArgumentException("User is not present!!");
		}
		String jwtToken = jWTService.generateToken(user1.get());
		String refreshJwtToken = jWTService.generateRefreshToken(new HashMap<>(), user1.get());
		
		JWTAuthenticationResponseDto responseDto = new JWTAuthenticationResponseDto(jwtToken, refreshJwtToken);
		return responseDto;		
	}
	
	// Step 18 - refresh token ka code likho 
	public JWTAuthenticationResponseDto refreshToken(RefreshTokenRequestDto requestDto) {
		String refreshTokenReuqest = requestDto.getRefreshToken();
		String userName = jWTService.extractUserName(refreshTokenReuqest);
		Optional<User> user1 = userRepository.findByUserName(userName);
		if(!user1.isPresent()) {
			throw new IllegalArgumentException("User is not present!!");
		}
		if(jWTService.isTokenValid(refreshTokenReuqest, user1.get())) {
			String jwtToken = jWTService.generateToken(user1.get());
			String refreshJwtToken = jWTService.generateRefreshToken(new HashMap<>(), user1.get());
			
			JWTAuthenticationResponseDto responseDto = new JWTAuthenticationResponseDto(jwtToken, refreshTokenReuqest);
			return responseDto;	
		}else {
			return null;
		}
		
	}
}
