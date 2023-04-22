package com.hdfc.ems.project.repository;
/**
 *@author NareshBabu O
 *@created 21-Apr-2023
*
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.ems.project.dto.EmployeeDTO;
import com.hdfc.ems.project.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee save(EmployeeDTO employeeDTO);

}
