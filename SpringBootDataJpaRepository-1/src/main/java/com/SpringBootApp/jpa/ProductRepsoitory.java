package com.SpringBootApp.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepsoitory extends JpaRepository<Product, Integer> {
	
	List<Product> findByName(String name);
	
	List<Product> findByCategory(String category);
	
	List<Product> findByManfactureDate(Date date);
	
//	List<Product> findById(Integer id);
	
	

}
