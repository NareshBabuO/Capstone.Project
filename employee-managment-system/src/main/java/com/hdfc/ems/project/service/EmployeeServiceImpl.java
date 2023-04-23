package com.hdfc.ems.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.project.dto.EmployeeDTO;
import com.hdfc.ems.project.entity.Employee;
import com.hdfc.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.ems.project.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getByEmployeeID(long employeeID) throws InValidEmployeeIDException {
		Employee employee = employeeRepository.findById(employeeID)
				.orElseThrow(() -> new InValidEmployeeIDException("Invalid EmployeeID :" + employeeID));
		return employee;
	}

}
