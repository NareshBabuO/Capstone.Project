package com.hdfc.ems.entity.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.exception.InValidEmployeeIDException;
import com.hdfc.ems.repository.EmployeeRepository;
import com.hdfc.ems.service.EmployeeService;

/**
 *@author NareshBabu O
 *@created 21-April-2023
*
 */

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
