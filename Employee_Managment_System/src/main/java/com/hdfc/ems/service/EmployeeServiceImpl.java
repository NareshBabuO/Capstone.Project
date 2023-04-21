package com.hdfc.ems.service;

/**
 *@author NareshBabu O
 *@created 21-Apr-2023
*
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.exception.InValidEmployeeIDException;
import com.hdfc.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getByEmployeeID(long employeeID) throws InValidEmployeeIDException {
		Employee employee = employeeRepository.findById(employeeID).orElse(null);
		if(employee != null) {
			return employee;
		}
		else {
			throw new InValidEmployeeIDException("No Employee Details Found with Id:"+employeeID);
		}
	}

}
