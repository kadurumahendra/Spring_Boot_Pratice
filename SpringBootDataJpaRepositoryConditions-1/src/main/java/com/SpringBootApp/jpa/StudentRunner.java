package com.SpringBootApp.jpa;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repo.saveAll(Arrays.asList(
				new Student(null, "Mahendra", "CSE", 85.0, new Date()),
                new Student(null, "Sandeep", "ECE", 72.0, new Date()),
                new Student(null, "Rahul", "IT", 55.0, new Date()),
                new Student(null, "Sneha", "CSE", 91.0, new Date()),
                new Student(null, "Amit", "MECH", 43.0, new Date()),
                new Student(null, "Rani", "CIVIL", 65.0, new Date()),
                new Student(null, "Kiran", "EEE", 78.0, new Date()),
                new Student(null, "Anita", "IT", 49.0, new Date()),
                new Student(null, "Varun", "ECE", 88.0, new Date()),
                new Student(null, "Rekha", null, 60.0, new Date()),
                new Student(null, "Shiva", "CSE", 39.0, new Date()),
                new Student(null, "Pooja", "ECE", null, new Date()),
                new Student(null, "Sonia", "IT", 74.0, new Date()),
                new Student(null, "Gopal", "CIVIL", 92.0, new Date()),
                new Student(null, "Deepa", "ECE", 81.0, new Date())
				));
		
		
		repo.findByDepartmentAndMarks("cse", 91.0).forEach(System.out::println);
		
		repo.findByNameLike("amit").forEach(System.out::println);
		
		repo.findByMarksBetween(50.0, 92.0).forEach(System.out::println);
		
		repo.findByDepartmentIsNull().forEach(System.out::println);
		
		repo.findByDepartmentNotLike("CIVIL").forEach(System.out::println);
		
		
		repo.findByMarksBetween(60.0, 92.0).forEach(System.out::println);
		
		
		repo.findByMarksGreaterThanEqual(65.0).forEach(System.out::println);
		
		
		repo.findByNameEndsWith("a").forEach(System.out::println);
		
		repo.findByMarksLessThanOrMarksIsNull(90.0).forEach(System.out::println);
		
		repo.findByDepartmentIn(Arrays.asList("IT", "ECE", "CIVIL")).forEach(System.out::println);
		

	}

}
