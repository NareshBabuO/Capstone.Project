package com.hdfc.ems.project.service;

/**
 *@author NareshBabu O
 *@created 21-Apr-2023
*
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.project.entity.Employee;
import com.hdfc.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.ems.project.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	/*
	 * public Employee getByEmployeeID(long employeeID) throws
	 * InValidEmployeeIDException { Employee employee =
	 * employeeRepository.findById(employeeID).orElse(null); if(employee != null) {
	 * return employee; } else { throw new
	 * InValidEmployeeIDException("No Employee Details Found with Id:"+employeeID);
	 * } }
	 */
	public Employee getByEmployeeID(long employeeId) throws InValidEmployeeIDException {
	    Employee employee = employeeRepository.findById(employeeId).orElse(null);
	    if(employee == null) {
	        throw new InValidEmployeeIDException("Employee with ID " + employeeId + " not found");
	    }
	    return employee;
	}


}
