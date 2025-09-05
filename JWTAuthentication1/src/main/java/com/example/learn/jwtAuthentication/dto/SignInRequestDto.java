package com.example.learn.jwtAuthentication.dto;

public class SignInRequestDto {

	private String userName;
	private String password;
	public SignInRequestDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public SignInRequestDto() {
		super();
	}
	@Override
	public String toString() {
		return "SignInRequestDto [userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
