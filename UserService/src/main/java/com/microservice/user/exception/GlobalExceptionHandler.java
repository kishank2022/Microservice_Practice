package com.microservice.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ApiResponse> handleUserNotFoundException(UserNotFoundException exception){
		ApiResponse response = new ApiResponse();
		response.setErrorCode(0);
		response.setMessage(exception.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setFlag(false);
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
}
