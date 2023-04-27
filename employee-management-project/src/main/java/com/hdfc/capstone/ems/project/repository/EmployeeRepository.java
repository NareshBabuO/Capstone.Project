package com.hdfc.capstone.ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdfc.capstone.ems.project.entity.Employee;

/**
 *@author NareshBabu O
 *@created Date26-Apr-2023
*
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
