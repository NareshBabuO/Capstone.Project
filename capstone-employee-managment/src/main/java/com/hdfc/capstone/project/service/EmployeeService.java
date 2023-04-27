package com.hdfc.capstone.project.service;

import com.hdfc.capstone.project.exception.InValidEmployeeIDException;
import com.hdfc.capstone.project.vo.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException;

}
