package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarRunner implements CommandLineRunner{
	
	@Autowired
	private Car car;
	
	public void run(String... args) throws Exception {
		System.out.println("Car details getting ");
		System.out.println(car);
	}

}
