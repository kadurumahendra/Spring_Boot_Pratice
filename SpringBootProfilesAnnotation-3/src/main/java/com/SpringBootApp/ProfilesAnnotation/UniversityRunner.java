package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component

public class UniversityRunner implements CommandLineRunner {
	
	@Autowired
	private University univ;
	
//	@Autowired
//	private Student s;
//	
//	@Autowired
//	private Professor p;
	
	public void run(String... args) throws Exception {
		System.out.println("univesity details loading");
		System.out.println(univ);
	}

}
