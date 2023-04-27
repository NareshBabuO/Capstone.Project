package com.hdfc.capstone.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdfc.capstone.project.entity.Employee;

/**
 *@author NareshBabu O
 *@created Date26-Apr-2023
*
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
