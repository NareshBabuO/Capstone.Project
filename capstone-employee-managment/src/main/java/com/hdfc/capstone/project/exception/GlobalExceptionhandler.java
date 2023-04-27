package com.hdfc.capstone.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import lombok.extern.slf4j.Slf4j;
@RestControllerAdvice
@Slf4j
public class GlobalExceptionhandler {

	@ExceptionHandler(InValidEmployeeIDException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(InValidEmployeeIDException ex){
		log.info(ex.getMessage());
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex){
		String message = "Please ID in the form of Number";
		log.info(message);
		return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
	}

}
