package com.SpringBootApp.jpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		repo.saveAll(Arrays.asList(
				new Employee(null, "Mahendra", "Developer", 65000.0, sdf.parse("12-03-2023"), "Hyderabad"),
				new Employee(null, "Sneha", "Tester", 42000.0, sdf.parse("05-07-2022"), null),
				new Employee(null, "Rahul", "Manager", 85000.0, sdf.parse("18-11-2021"), "Chennai"),
				new Employee(null, "Aisha", "Developer", 70000.0, sdf.parse("10-01-2024"), "Bangalore"),
				new Employee(null, "Vikram", "HR", 50000.0, sdf.parse("22-09-2023"), "Chennai"),
				new Employee(null, "Neha", "Developer", 55000.0, sdf.parse("15-02-2022"), null),
				new Employee(null, "Rakesh", "Tester", 38000.0, sdf.parse("11-06-2021"), "Hyderabad"),
				new Employee(null, "Priya", "Manager", 90000.0, sdf.parse("30-12-2023"), "Bangalore"),
				new Employee(null, "Amit", "Support", 30000.0, sdf.parse("08-04-2024"), "Hyderabad"),
				new Employee(null, "Pooja", "Developer", 60000.0, sdf.parse("25-08-2022"), "Chennai")

				)
				);
		repo.findByLocation("Hyderabad").forEach(System.out::println);
		
		
		repo.getAllEmployees().forEach(System.out::println);
		
		repo.findByNameAndSalary("mahendra", 65000.0).forEach(System.out::println);
		
		
		repo.findByNameOrLocation("rakesh", "hyderabad").forEach(System.out::println);
		
		
		repo.findEmployeeNameAndRole().forEach(System.out::println);
		
		
		repo.findByNameAndRole("mahendra", "hyderbad").forEach(System.out::println);
		
		

	}

}
