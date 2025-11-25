package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestaurantRunner implements CommandLineRunner{
	
	@Autowired
	private Restaurant res;
	public void run(String... args) throws Exception {
		System.out.println("Restaurant details: ");
		System.out.println(res);
	}

}
