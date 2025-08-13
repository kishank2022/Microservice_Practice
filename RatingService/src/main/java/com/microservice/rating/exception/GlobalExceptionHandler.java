package com.microservice.rating.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException exception){
		ApiResponse response = new ApiResponse();
		response.setMessage(exception.getMessage());
		response.setStatus_code(HttpStatus.NOT_FOUND.toString());
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}
