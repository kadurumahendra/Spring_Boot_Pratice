package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner  implements CommandLineRunner{
	
	public void run(String... args) throws Exception {
		
		
		System.out.println("Student runner getting message");
	}

}
