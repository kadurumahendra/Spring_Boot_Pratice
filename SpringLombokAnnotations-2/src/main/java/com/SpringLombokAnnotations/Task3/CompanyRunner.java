package com.SpringLombokAnnotations.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CompanyRunner implements CommandLineRunner {
	
	@Autowired
	private Company company;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("company details loading....");
		System.out.println(company);
		Company c1 = company;
		Company c2 = company;
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}

}
