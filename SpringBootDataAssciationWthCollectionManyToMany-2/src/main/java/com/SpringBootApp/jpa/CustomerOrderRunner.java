package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerOrderRunner implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository crepo;
	
	@Autowired
	private OrderRepository orepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer(1, "Ravi", null);
		Customer c2 = new Customer(2, "kiran", null);
		
		crepo.save(c1);
		crepo.save(c2);
		
		Order o1 = new Order(101, "Laptop", 50000.0, c1);
		Order o2 = new Order(102, "Mouse", 500.0, c1);
		
		
		Order o3 = new Order(103, "Mobile",15000.0, c2);
		
		
		orepo.saveAll(Arrays.asList(o1,o2,o3));
		
	}

}
