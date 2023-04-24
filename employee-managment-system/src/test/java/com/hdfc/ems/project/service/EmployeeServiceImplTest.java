package com.hdfc.ems.project.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.ems.project.repository.EmployeeRepository;
import com.hdfc.ems.project.vo.EmployeeVO;

@SpringBootTest
class EmployeeServiceImplTest {

	
	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void testGetByEmployeeID() throws InValidEmployeeIDException {
		EmployeeVO employeeID = employeeService.getEmployeeById(1002);
		
		assertEquals("Mahesh",employeeID.getEmployeeName());
		
	}
	

}
