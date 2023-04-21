package com.hdfc.ems.service;
/**
 *@author NareshBabu O
 *@created 21-Apr-2023
*
 */
import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.exception.InValidEmployeeIDException;

public interface EmployeeService {
	
	
	public Employee getByEmployeeID(long employeeID) throws InValidEmployeeIDException;

}