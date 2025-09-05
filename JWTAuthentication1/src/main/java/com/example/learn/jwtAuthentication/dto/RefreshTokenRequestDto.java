package com.example.learn.jwtAuthentication.dto;

public class RefreshTokenRequestDto {

	private String refreshToken;

	public RefreshTokenRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RefreshTokenRequestDto(String refreshToken) {
		super();
		this.refreshToken = refreshToken;
	}

	@Override
	public String toString() {
		return "RefreshTokenRequestDto [refreshToken=" + refreshToken + "]";
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
	
}
