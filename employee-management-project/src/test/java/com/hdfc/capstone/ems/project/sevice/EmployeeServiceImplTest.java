package com.hdfc.capstone.ems.project.sevice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstone.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.capstone.ems.project.repository.EmployeeRepository;
import com.hdfc.capstone.ems.project.vo.EmployeeVO;

/**
 *@author NareshBabu O
 *@created Date26-Apr-2023
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
		EmployeeVO employeeID = employeeService.getEmployeeById(16103);
		
		assertEquals("Nandan",employeeID.getEmployeeName());
		
	}

	

}
