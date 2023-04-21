package com.hdfc.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author NareshBabu O
 * @created 21-Apr-2023
 *
 */

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(InValidEmployeeIDException.class)
	public ResponseEntity<String> handleEmployeeIDException(InValidEmployeeIDException ex) {
		return new ResponseEntity<String>("Invalid Employee ID", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception ex) {
		return new ResponseEntity<String>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	/*
	 * @ExceptionHandler(ConstraintViolationException.class) public
	 * ResponseEntity<List<String>>
	 * handleValidationException(ConstraintViolationException ex) { List<String>
	 * errors = new ArrayList<>(); Set<ConstraintViolation<?>> violations =
	 * ex.getConstraintViolations(); for (ConstraintViolation<?> violation :
	 * violations) { errors.add(violation.getMessage()); } return new
	 * ResponseEntity<>(errors, HttpStatus.BAD_REQUEST); }
	 */
}
