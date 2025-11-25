package com.SpringLombokAnnotations.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HospitalRunner implements CommandLineRunner {
	
	@Autowired
	private Hospital hospital;
	
	
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hospital details");
		System.out.println(hospital);
		Hospital h1 = hospital;
		
		Hospital h2 = hospital;
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode()+" and "+h2.hashCode());

	}

}
