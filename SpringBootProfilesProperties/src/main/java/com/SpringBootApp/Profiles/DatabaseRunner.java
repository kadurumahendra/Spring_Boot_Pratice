package com.SpringBootApp.Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseRunner  implements CommandLineRunner{
	
	@Autowired
	private Database db;
	
	public void run(String... args) throws Exception {
		
		System.out.println(db);
		
	}

}
