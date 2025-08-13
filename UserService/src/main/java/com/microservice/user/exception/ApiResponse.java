package com.microservice.user.exception;

import org.springframework.http.HttpStatus;

public class ApiResponse {

	private String message;
	
	private int errorCode;
	
	private boolean flag;
	
	private HttpStatus status;

	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiResponse(String message, int errorCode, boolean flag, HttpStatus status) {
		super();
		this.message = message;
		this.errorCode = errorCode;
		this.flag = flag;
		this.status = status;
	}

	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", errorCode=" + errorCode + ", flag=" + flag + ", status=" + status
				+ "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	
}
