package com.hdfc.ems.project.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.ems.project.entity.Employee;
import com.hdfc.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.ems.project.repository.EmployeeRepository;

@SpringBootTest

class EmployeeServiceImplTest {


	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void testGetByEmployeeID() throws InValidEmployeeIDException {
		// Employee employee = new Employee();
		Employee employeeID = employeeService.getByEmployeeID(1002);
		
		assertNotNull(employeeID);
		
	//	assertEquals(employee, employeeID);
	}

}
