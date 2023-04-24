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
import com.hdfc.ems.project.vo.EmployeeVO;

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

	@GetMapping("/get/{employeeID}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeID)
			throws EmployeeIDException, InValidEmployeeIDException {
		log.info("Getting user by ID: {}", employeeID + " checking..............");
		
		return employeeService.getEmployeeById(employeeID);
	}

}
