package com.SpringBootApp.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("select s from Student s where s.course.duration > :duration")
	List<Student> findStudentsByCourseDurationGreaterThan(int duration);
}
