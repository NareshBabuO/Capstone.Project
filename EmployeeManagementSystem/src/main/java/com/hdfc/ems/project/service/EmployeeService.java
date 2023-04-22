package com.hdfc.ems.project.service;

import com.hdfc.ems.project.entity.Employee;
import com.hdfc.ems.project.exception.InValidEmployeeIDException;

public interface EmployeeService {

	public Employee getByEmployeeID(long employeeID) throws InValidEmployeeIDException;

}