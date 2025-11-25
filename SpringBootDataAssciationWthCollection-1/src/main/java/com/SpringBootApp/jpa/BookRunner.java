package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class BookRunner implements CommandLineRunner{
	
	@Autowired
	private AuthorRepository arepo;
	
	
	@Autowired
	private BookRepository brepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		arepo.saveAll(Arrays.asList( new Author(101,"mahendra","india"),
				new Author(102,"sandeep","uae"),
				new Author(103,"keerthi","america"),
				new Author(104,"anitha","canada"),
				new Author(105,"jayachandra","australia")
				));
		
		Author a1 = new Author(501, "Ravi Sankar", "India");
		Author a2 = new Author(502, "John Miller", "USA");
		Author a3 = new Author(503, "Elena Garcia", "Spain");
		
		arepo.saveAll(Arrays.asList(a1,a2,a3));
		
		
		brepo.saveAll(Arrays.asList(new Book(1,"the river",300.0,a1),
					new Book(2,"the forest",400.0,a2),
					new Book(3,"forest raises",700.0,a3),
					new Book(4,"RRR",1000.0,a2)
				
				));
		
		
		brepo.findBookByAuthor(a2).forEach(System.out::println);
		
	}

}
