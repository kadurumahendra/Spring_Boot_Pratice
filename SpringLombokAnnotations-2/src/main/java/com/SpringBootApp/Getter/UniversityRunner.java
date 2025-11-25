package com.SpringBootApp.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UniversityRunner implements CommandLineRunner {
	@Autowired
	private University university;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("university details ==>");
		System.out.println(university);

	}

}
