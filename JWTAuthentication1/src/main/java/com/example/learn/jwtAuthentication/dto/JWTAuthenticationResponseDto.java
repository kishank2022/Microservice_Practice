package com.example.learn.jwtAuthentication.dto;

public class JWTAuthenticationResponseDto {

	private String token;
	private String refreshToken;
	public JWTAuthenticationResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JWTAuthenticationResponseDto(String token, String refreshToken) {
		super();
		this.token = token;
		this.refreshToken = refreshToken;
	}
	@Override
	public String toString() {
		return "JWTAuthenticationResponseDto [token=" + token + ", refreshToken=" + refreshToken + "]";
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
	
}
