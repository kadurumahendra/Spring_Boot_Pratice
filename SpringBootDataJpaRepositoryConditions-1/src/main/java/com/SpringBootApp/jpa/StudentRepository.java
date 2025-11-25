package com.SpringBootApp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface StudentRepository  extends JpaRepository<Student, Integer>{
	
	List<Student> findByDepartmentAndMarks(String department, Double marks);
	
	List<Student> findByNameLike(String pattern);
	
	List<Student> findByMarksBetween(Double startMarks, Double endMarks);
	
	List<Student> findByDepartmentIsNull();
	
	List<Student> findByDepartmentNotLike(String pattern);
	
	List<Student> findByMarksGreaterThanEqual(Double marks);
	
	List<Student> findByAdmissionDateBetween(Date start, Date end);
	
	
	List<Student> findByNameEndsWith(String name);
	
	List<Student> findByMarksLessThanOrMarksIsNull(Double marks);
	
	List<Student> findByDepartmentIn(List<String> departments);

	

}
