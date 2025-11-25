package com.SpringBootApp.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@Query("select d.dname, e.ename from Department d inner join d.employees e")
	List<Object[]> findDepartmentEmployeeName();

}
