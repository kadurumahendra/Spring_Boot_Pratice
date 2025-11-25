package com.SpringBootApp.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	
	@Query("select e from Employee e where e.location = :loc")
	List<Employee> findByLocation(@Param("loc") String location);
	 
	
	@Query("select e from Employee e")
	List<Employee> getAllEmployees();

	@Query("select e from Employee e where e.name =:name and e.salary =:salary")
	List<Employee> findByNameAndSalary(String name, Double salary);
	
	@Query("select e from Employee e where e.name =:name or e.location =:location")
	List<Employee> findByNameOrLocation(String name, String location);
	
	@Query("select e.name, e.role from Employee e")
	List<Object[]> findEmployeeNameAndRole();
	
	
	List<Employee> findByNameAndRole(String name, String role);
	
	
	
}
