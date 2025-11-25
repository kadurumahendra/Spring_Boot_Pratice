package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList( 
				new Student(101,"mahendra","PDD", 300.0),
				new Student(102,"sandeep","Spic", 500.0),
				new Student(103, "keerthi", "crypto",700.0),
				new Student(104, "Rohit", "Java", 450.0),
				new Student(105, "Divya", "Python", 550.0),
				new Student(106, "Kiran", "AWS", 650.0),
				new Student(107, "Shiva", "DevOps", 600.0),
				new Student(108, "Anitha", "UI/UX", 400.0),
				new Student(109, "Harsha", "React", 520.0),
				new Student(110, "Manoj", "Data Science", 900.0),
				new Student(111, "Kavya", "Machine Learning", 850.0),
				new Student(112, "Teja", "Spring Boot", 750.0),
				new Student(113, "Srujana", "SQL", 300.0)
				));
		
		repo.findAll(Sort.by("id")).forEach(System.out::println);
		
		
		repo.findAll(Sort.by("name")).forEach(System.out::println);
		
		
		
		repo.findAll(Sort.by("course","fee")).forEach(System.out::println);
		
		
		repo.findAll(Sort.by(Direction.ASC, "id","name")).forEach(System.out::println);
		
		repo.findAll(Sort.by(Direction.DESC, "id")).forEach(System.out::println);
		
		repo.findAll(Sort.by(Direction.DESC, "id","name","course","fee")).forEach(System.out::println);
		
		
		
		repo.findAll(Sort.by(Order.asc("id"),Order.by("name"))).forEach(System.out::println);
		
		repo.findAll(Sort.by(Order.desc("name"), Order.by("fee"))).forEach(System.out::println);
		
		
		System.out.println(repo);
		// TODO Auto-generated method stub
		
	}

}
