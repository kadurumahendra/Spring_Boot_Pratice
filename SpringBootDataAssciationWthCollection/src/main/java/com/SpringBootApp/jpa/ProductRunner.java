package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository prepo;
	
	
	@Autowired
	private DepartmentRepository drepo;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		
		// TODO Auto-generated method stub
		
		Department d1 = new Department(1052, "sandeep");
		Department d2 = new Department(1053, "keerthi");
		Department d3 = new Department(1054, "sunil");
		Department d4 = new Department(1055, "vignesh");
		drepo.save(d1);
		
		drepo.saveAll(Arrays.asList(d2,d3,d4));
		
		Product p1 = new Product(101,"mahendra",d1);
		
		Product p2 = new Product(102,"Munna",d2);
		
		Product p3 = new Product(103,"geetha",d3);
		
		Product p4 = new Product(104,"mamatha",d4);
		
		prepo.save(p1);
		
		prepo.saveAll(Arrays.asList(p2,p3,p4));
		
		
		prepo.findById(101);

	}

}
