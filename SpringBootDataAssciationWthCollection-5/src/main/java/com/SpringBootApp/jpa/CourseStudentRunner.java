package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseStudentRunner implements CommandLineRunner{
	@Autowired
	private CourseRepository repo;
	@Autowired
	private StudentRepository repo1;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Student s1 = new Student(10,"sandeep",null);
		repo1.save(s1);
		Student s2 = new Student(11, "jayavhandra", null);
		repo1.save(s2);
		// TODO Auto-generated method stub
		
		Course c1 = new Course(101, "mahendra", 7, s1);
		Course c2 = new Course(102,"keerthi",8,s1);
		Course c3 = new Course(103, "anitha", 9, s1);

		repo.save(c1);
		repo.saveAll(Arrays.asList(c2,c3));
		
		
	}
	
	
	

}
