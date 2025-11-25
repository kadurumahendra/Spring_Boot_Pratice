package com.example.SpringBootInput.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private Employee employee; 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee details running excueted");
		System.out.println("Employee details: "+employee);

	}

}
