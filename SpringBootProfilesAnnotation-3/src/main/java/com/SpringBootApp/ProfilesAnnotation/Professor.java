package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.context.annotation.Profile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Profile("qa")
public class Professor {
	
	private int id;
	
	private String pname;
	
	private int experince;
	
	

}
