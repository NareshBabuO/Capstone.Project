package com.hdfc.ems.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.ems.project.entity.Employee;
import com.hdfc.ems.project.exception.EmployeeIDException;
import com.hdfc.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.ems.project.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author NareshBabu O
 * @created 21-April-2023
 *
 */
@RestController
@Slf4j
@RequestMapping("/capstone/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/get/{employeeId}")
	public Employee getEmployeeById(@PathVariable long employeeId)
			throws EmployeeIDException, InValidEmployeeIDException {
		log.info("Getting user by ID: {}", employeeId+"checking..............");
		Employee employee = employeeService.getByEmployeeID(employeeId);

		if (employee == null) {
			throw new EmployeeIDException("Employee not found with ID: " + employeeId);
		}
		return employee;
	}

}
