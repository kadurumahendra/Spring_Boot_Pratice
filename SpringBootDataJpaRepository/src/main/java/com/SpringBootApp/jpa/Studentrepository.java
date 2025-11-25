package com.SpringBootApp.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;


public interface Studentrepository extends JpaRepository<Student, Integer> {
	
	List<Student> findByName(String name);
	
	List<Student> findByDeptIs(String dept);
	
	List<Student> findByYearEquals(int year);
	
	List<Student> findByIdIs(Integer id);
	
	List<Student> findByDate(Date date);
	
//	List<Student> findByDateis(Date date);

	
}
