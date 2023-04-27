package com.hdfc.capstone.ems.project.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstone.ems.project.entity.Employee;
import com.hdfc.capstone.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.capstone.ems.project.repository.EmployeeRepository;
import com.hdfc.capstone.ems.project.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	//@Override
	//public EmployeeVO getEmployeeByI(long employeeID) throws InValidEmployeeIDException {
		//Employee employee = employeeRepository.findById(employeeID).orElseThrow(
			//	() -> new InValidEmployeeIDException("Invalid EmployeeId : " + employeeID));
		//EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(), employee.getEmployeeName(), employee.getDateOfBirth());
	//	return employeeVO;
//	}
	
	@Override
	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException  {

		Employee employee = employeeRepository.findById(employeeID).orElseThrow(
				() -> new InValidEmployeeIDException("Invalid EmployeeId : " + employeeID +"   { EmployeeID Starts From 16101}"));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}

}
