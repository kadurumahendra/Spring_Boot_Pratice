package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner implements CommandLineRunner {
	@Autowired
	private OrderRepository rep;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Order o1 = new Order(101,"O101", 300.0, "successful");
		Order o2 = new Order(102, "O102", 400.0, "Failed");
		Order o3 = new Order(103, "O103", 550.0, "pending");
		Order o4 = new Order(104, "O104", 1200.0, "shipped");
		Order o5 = new Order(105, "O105", 75.0, "processing");
		Order o6 = new Order(106, "O106", 999.99, "cancelled");
		Order o7 = new Order(107, "O107", 250.0, "returned");

		rep.save(o1);
		rep.save(o2);
		rep.save(o3);
		
		rep.saveAll(Arrays.asList(o3,o4,o5,o6,o7));
		
		System.out.println(rep.count());
		
		System.out.println(rep.existsById(106));
		System.out.println(rep.existsById(104));
		System.out.println(rep.existsById(102));
		
		
		rep.deleteById(106);
		
	}

}
