package com.hdfc.capstone.ems.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.capstone.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.capstone.ems.project.sevice.EmployeeService;
import com.hdfc.capstone.ems.project.vo.EmployeeVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author NareshBabu O
 * @created 21-April-2023
 *
 */
@RestController
@Slf4j
@RequestMapping("/Capstone/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/get/{employeeID}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeID) throws InValidEmployeeIDException {
		log.info("Getting user by ID: {}  ", employeeID + " checking..............");

		return employeeService.getEmployeeById(employeeID);
	}

}
