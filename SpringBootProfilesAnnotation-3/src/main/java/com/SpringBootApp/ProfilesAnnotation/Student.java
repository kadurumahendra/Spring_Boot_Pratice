package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@Profile("prod")
public class Student {
	
	private int id;
	
	private String name;
	
	private int year;
	
	private Professor professor;

}
