package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HotelRunner  implements CommandLineRunner {
	
	@Autowired
	private Hotel hotel;
	public void run(String...args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("Hotel is running");
System.out.println(hotel);
	}

}
