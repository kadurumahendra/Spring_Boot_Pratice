package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductModelRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Autowired
	private ModelRepository repo1;

	@Override
	public void run(String... args) throws Exception {

		Product p1 = new Product(101, "watch", 300.0, null);
		Product p2 = new Product(102, "fastrack", 1000.0, null);
		Product p3 = new Product(103, "sonata", 2000.0, null);

		repo.saveAll(Arrays.asList(p1, p2, p3));

		Model m1 = new Model(501, "a1 mobiles", Arrays.asList(p1, p2));
		Model m2 = new Model(502, "sangeetha mobiles", Arrays.asList(p3, p1));

		repo1.saveAll(Arrays.asList(m1, m2));
	}
}
