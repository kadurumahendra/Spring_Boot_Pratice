package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@ConfigurationProperties("bookstore")
@Profile("qa")
@NoArgsConstructor
public class Library {
	
	
	private String libraryNAme;
	
	private String location;
	
	private Librarian librarian;
	
	
	private Book book;
	
	

}
