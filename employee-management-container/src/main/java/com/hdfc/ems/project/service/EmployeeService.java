package com.hdfc.ems.project.service;

import com.hdfc.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.ems.project.vo.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException;

}
