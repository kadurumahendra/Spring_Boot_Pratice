package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class CustomerRunner  implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		c1.setCustId(101);
		c1.setCustName("MAhendra");
		c1.setCustBill(2000.0);
		
		
		Customer c2 = new Customer();
		c2.setCustId(102);
		c2.setCustName("Sandeep");
		c2.setCustBill(4000.0);
		
		Customer c3 = new Customer();
		c3.setCustId(103);
		c3.setCustName("Keerthi");
		c3.setCustBill(76000.0);
		
		
		repo.save(c1);
		
		repo.saveAll(Arrays.asList(c2,c3));
		
		Iterable<Customer> c = repo.findAll();
		System.out.println("-------------------------------------");
		
		for (Customer customer : c) {
			System.out.println(c);
		}
		
		System.out.println(repo.existsById(103));
		System.out.println(repo.existsById(101));
		
		System.out.println(repo.count());
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(repo.findById(101));
repo.deleteById(102);
		
		System.out.println();
		
		
		
	}

}
