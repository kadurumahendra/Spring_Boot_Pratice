package com.SpringBootApp.jpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner  implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(null, "Mahendra","cse",3000.0,new Date());
		repo.save(e1);
		
		repo.saveAll(Arrays.asList(
				new Employee(null,"sandeep","ece",40000.0, new Date()),
				new Employee(null, "sandeep", "ece", 40000.0, new Date()),
				new Employee(null, "priya", "cse", 42000.0, new Date()),
				new Employee(null, "arjun", "it", 38000.0, new Date()),
				new Employee(null, "meera", "mech", 45000.0, new Date()),
				new Employee(null, "ravi", "civil", 39000.0, new Date()),
				new Employee(null, "komal", "eee", 41000.0, new Date()),
				new Employee(null, "vinay", "ece", 43000.0, new Date()),
				new Employee(null, "anita", "cse", 47000.0, new Date()),
				new Employee(null, "mohit", "prod", 40000.0, new Date()),
				new Employee(null, "deepa", "it", 42000.0, new Date()),
				new Employee(null, "gaurav", "civil", 44000.0, new Date())

				));
		
		repo.findByDepartment("ece").forEach(System.out::println);
		
		repo.findBySalaryGreaterThan(40000.0).forEach(System.out::println);
		
		SimpleDateFormat sob = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		
		Date start = sob.parse("2025-11-12 09:31:23");
		Date end   = sob.parse("2025-11-15 09:31:29");

		
		repo.findByDateBetween(start,end).forEach(System.out::println);
		
		repo.findByNameContaining("ravi").forEach(System.out::println);
		
	}
	
	

}
