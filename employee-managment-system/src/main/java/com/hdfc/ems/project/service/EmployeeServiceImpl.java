package com.hdfc.ems.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.project.entity.Employee;
import com.hdfc.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.ems.project.repository.EmployeeRepository;
import com.hdfc.ems.project.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	/*
	 * @Override public EmployeeVO getByEmployeeID(long employeeID) throws
	 * InValidEmployeeIDException { Employee employee =
	 * employeeRepository.findById(employeeID) .orElseThrow(() -> new
	 * InValidEmployeeIDException("Invalid EmployeeID :" + employeeID));
	 * 
	 * EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(),
	 * employee.getEmployeeName(), employee.getDateOfBirth()); return employeeVO;
	 * 
	 * }
	 */

	@Override
	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException {
		Employee employee = employeeRepository.findById(employeeID).orElseThrow(
				() -> new InValidEmployeeIDException("Invalid EmployeeId : " + employeeID));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}
	

}
