package com.hdfc.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.exception.InValidEmployeeIDException;
import com.hdfc.ems.service.EmployeeService;

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
	public Employee getEmployeeById(long employeeId) throws InValidEmployeeIDException {
		return employeeService.getByEmployeeID(employeeId);

	}
}
