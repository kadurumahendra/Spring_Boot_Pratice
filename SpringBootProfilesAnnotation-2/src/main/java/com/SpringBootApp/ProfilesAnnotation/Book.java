package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.context.annotation.Profile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Profile("default")
public class Book {
	
	private String titlee;
	
	private String author;
	
	private double price;

}
