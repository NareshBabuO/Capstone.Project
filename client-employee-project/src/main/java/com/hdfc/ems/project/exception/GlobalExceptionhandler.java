package com.hdfc.ems.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
@RestControllerAdvice	
public class GlobalExceptionhandler {

	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<String> handleHttpClientErrorException(HttpClientErrorException ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex){
		String message = "Please Check ID it will be number ";
		return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
	}
}
