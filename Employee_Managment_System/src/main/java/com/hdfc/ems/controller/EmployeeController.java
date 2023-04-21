package com.hdfc.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.entity.exception.InValidEmployeeIDException;
import com.hdfc.ems.entity.service.EmployeeService;

/**
 * @author NareshBabu O
 * @created 21-April-2023
 *
 */

@RestController
@RequestMapping("/capstone/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<Object> getEmployeeById(long employeeId) {
		try {
			Employee employee = employeeService.getByEmployeeID(employeeId);
			return ResponseEntity.ok().body(employee);
		} catch (InValidEmployeeIDException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body(new InValidEmployeeIDException(e.getMessage(), HttpStatus.NOT_FOUND.value()));
		}
	}

}
