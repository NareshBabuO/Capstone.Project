package com.hdfc.ems.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdfc.ems.project.entity.Employee;

@RestController
@RequestMapping("/Client/Employee")
public class ClientController {

	@Autowired
	RestTemplate template;

	String baseUrl = "https://localhost:8484/capstone/Employee/get/";

	/*
	 * @GetMapping("/{employeeID}") public Employee getEmployeeById(@PathVariable
	 * int employeeID) throws EmployeeIDException { Employee employee =
	 * template.getForObject(baseUrl + employeeID, Employee.class); if (employee ==
	 * null) { throw new EmployeeIDException("Employee not found with ID: " +
	 * employeeID); } return employee; }
	 */
	@GetMapping("/get/{employeeID}")
	public Employee getEmployeeByID(@PathVariable long employeeID) {
		return template.getForObject(baseUrl + employeeID, Employee.class);

	}
}
