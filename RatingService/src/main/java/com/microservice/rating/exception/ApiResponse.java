package com.microservice.rating.exception;

public class ApiResponse {

	private String message;
	private String status_code;
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponse(String message, String status_code) {
		super();
		this.message = message;
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", status_code=" + status_code + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	
	
	
}
