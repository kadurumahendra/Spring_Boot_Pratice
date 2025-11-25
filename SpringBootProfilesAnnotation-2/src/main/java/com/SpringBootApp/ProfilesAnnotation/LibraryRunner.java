package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunner implements CommandLineRunner {
	
	
	@Autowired
	private Library lib;
	
	@Autowired
	private Librarian liban;
	
	@Autowired
	private Book books1;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(lib);
		System.out.println(liban);
		System.out.println(books1);

	}

}
