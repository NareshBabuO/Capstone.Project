package com.hdfc.ems.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *@author NareshBabu O
 *@created 21-Apr-2023
*
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmployeeDTO {
	
	private long employeeID;
	private String employeeName;
	private LocalDate dateOfBirth;

}
