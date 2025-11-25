package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner  implements CommandLineRunner{
	
	@Autowired
	private CourseRepository crepo;
	
	@Autowired
	private StudentRepository srepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Course c1 = new Course(10, "DSA", 3);
		crepo.save(c1);
		
		
		
		Course c2 = new Course(2, "Python Data Science", 5);
		Course c3 = new Course(3, "AWS Cloud", 7);
		Course c4 = new Course(4, "UI/UX Design", 3);

		crepo.saveAll(Arrays.asList(c2, c3, c4));
		
		Student s7 = new Student(101, "kavya", "kavya", c1);
		srepo.save(s7);
		
		Student s1 = new Student(101, "Mahendra", "mahendra@gmail.com", c1);
		Student s2 = new Student(102, "Sandeep", "sandeep@gmail.com", c2);
		Student s3 = new Student(103, "Keerthi", "keerthi@gmail.com", c1);
		Student s4 = new Student(104, "Sunil", "sunil@gmail.com", c3);
		Student s5 = new Student(105, "Vignesh", "vignesh@gmail.com", c4);
		Student s6 = new Student(106, "Mamatha", "mamatha@gmail.com", c3);

		srepo.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6));
		
		srepo.findStudentsByCourseDurationGreaterThan(6).forEach(System.out::println);
		
		
		
	}
	
	
	

}
