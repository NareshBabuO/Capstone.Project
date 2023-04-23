package com.hdfc.ems.project.entity;

/**
 *@author NareshBabu O
 *@created 23-April-2023
*
 */

import java.time.LocalDate;


public class Employee {

	
	private long employeeID;

	private String employeeName;

	private LocalDate dateOfBirth;

	public Employee(long employeeID, String employeeName, LocalDate dateOfBirth) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

	
	
	
}
