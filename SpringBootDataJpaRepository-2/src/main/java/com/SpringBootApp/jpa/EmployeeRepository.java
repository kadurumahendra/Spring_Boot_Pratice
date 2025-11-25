package com.SpringBootApp.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByDepartment(String dept);
	
	List<Employee> findBySalaryGreaterThan(Double salary);
	
	
	List<Employee> findByDateBetween(Date start, Date end);

	
	List<Employee> findByNameContaining(String keyword);

}
