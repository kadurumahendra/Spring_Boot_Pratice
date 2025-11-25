package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CompanyRunner implements CommandLineRunner{
	
	@Autowired
	private Company company;
	
	public void run(String... args) throws Exception {
		System.out.println("Company details coming...........");
		System.out.println(company);
	}

}
