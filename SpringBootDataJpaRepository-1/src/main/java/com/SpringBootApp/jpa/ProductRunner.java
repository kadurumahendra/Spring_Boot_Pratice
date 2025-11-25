package com.SpringBootApp.jpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepsoitory repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(null," Fastrack Watches","Watches", new Date());
		Product p2 = new Product(null,"Titan Watches","Watches", new Date());
		Product p3  = new Product(null, "Apple iPhone 15", "Mobile", new Date());
		Product p4  = new Product(null, "Samsung Galaxy S23", "Mobile", new Date());
		Product p5  = new Product(null, "Dell Inspiron 3511", "Laptop", new Date());
		Product p6  = new Product(null, "HP Pavilion 14", "Laptop", new Date());
		Product p7  = new Product(null, "Sony Bravia 55 inch", "Electronics", new Date());
		Product p8  = new Product(null, "LG Smart TV 50 inch", "Electronics", new Date());
		Product p9  = new Product(null, "Boat Airdopes 441", "Audio", new Date());
		Product p10 = new Product(null, "JBL Tune 760NC", "Audio", new Date());
		Product p11 = new Product(null, "Nike Running Shoes", "Footwear", new Date());
		Product p12 = new Product(null, "Adidas Sneakers", "Footwear", new Date());
		Product p13 = new Product(null, "Prestige Cooker", "Kitchen", new Date());
		Product p14 = new Product(null, "Philips Mixer Grinder", "Kitchen", new Date());
		Product p15 = new Product(null, "Lenovo Tab M10", "Tablet", new Date());
		Product p16 = new Product(null, "Canon DSLR 1500D", "Camera", new Date());
		Product p17 = new Product(null, "Logitech Keyboard K380", "Accessories", new Date());
	

		
		repo.save(p1);
		repo.save(p2);
		repo.saveAll(Arrays.asList(p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17));
		
		repo.findAll(Sort.by("category")).forEach(System.out::println);
		repo.findAll(Sort.by(Direction.DESC, "pid", "name")).forEach(System.out::println);
		repo.findAll(Sort.by(Order.asc("category"),Order.desc("name"))).forEach(System.out::println);
		
		
		repo.findByName("Sony Bravia 55 inch").forEach(System.out::println);
		
		repo.findByCategory("Audio").forEach(System.out::println);
		
		SimpleDateFormat sob = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d1 = sob.parse("2025-11-20 10:30:00");
		Date d2 = sob.parse("2025-10-20 11:30:00");
		
		repo.findByManfactureDate(d1).forEach(System.out::println);
		
		repo.findByManfactureDate(d2).forEach(System.out::println);
		
	}

}
