package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner  implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(repo.getClass().getName());
		Product p1 = new Product(10, "fish",300.0);
		Product p2 = new Product(11,"chicken",200.0);
		Product p3 = new Product(12, "Prawns", 400.0);
		repo.save(p1);
		repo.save(p2);
		
		Product p4 = new Product(14, "fish",300.0);
		Product p5 = new Product(15,"chicken",200.0);
		Product p6 = new Product(16, "Prawns", 400.0);
		
		repo.save(p3);
		
		repo.saveAll(Arrays.asList(p4,p5,p6));
		
		Iterable<Product> data = repo.findAll();
		for(Product p: data)
		{
			System.out.println(p);
		}
		
		System.out.println("-------------------------------");
		data.forEach(ob -> System.out.println(ob));
		System.out.println("---------------------------------");
		
		System.out.println(repo.existsById(14));
		System.out.println(repo.existsById(12));
		
		System.out.println(repo.count());
		
		System.out.println(repo.hashCode());
		
		
		
	}

}
