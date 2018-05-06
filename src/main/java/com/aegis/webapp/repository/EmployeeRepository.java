package com.aegis.webapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aegis.webapp.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	Employee findByUserId(Long userId);
}
