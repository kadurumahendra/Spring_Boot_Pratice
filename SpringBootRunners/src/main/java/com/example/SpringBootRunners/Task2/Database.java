package com.example.SpringBootRunners.Task2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-1)
public class Database implements CommandLineRunner { 
	
	public void run(String... args) throws Exception{
		System.out.println("database message is waiting for you");
	}

}
