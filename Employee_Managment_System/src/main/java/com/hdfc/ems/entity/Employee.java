package com.hdfc.ems.entity;

/**
 *@author NareshBabu O
 *@created 21-April-2023
*
 */

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Employee")
public class Employee {

	
	@Id
	@NotNull
	@Column(name = "Employee_ID")
	private long employeeID;

	@Column(name = "Employee_Name")
	@NotBlank(message = "Please enter the name")
	@NotNull(message = "Please enter the name")
	@Pattern(regexp = "^[A-Z][a-z]*([ ][A-Z][a-z]*)*$", message = "New word in name should start with uppercase")
	private String employeeName;

	@Column(name = "Date_Of_Birth")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;

}
