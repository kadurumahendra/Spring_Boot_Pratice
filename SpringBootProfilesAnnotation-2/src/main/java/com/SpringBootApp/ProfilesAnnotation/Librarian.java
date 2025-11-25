package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.context.annotation.Profile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Profile("prod")
public class Librarian {
	
	private String name;
	
	private String shift;

}
