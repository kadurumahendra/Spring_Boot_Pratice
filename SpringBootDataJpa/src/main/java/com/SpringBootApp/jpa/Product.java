package com.SpringBootApp.jpa;

//import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@Component
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_table")
public class Product {
	
	@Id
	private Integer proId;
	
	private String proName;
	
	private Double proSalery;

}
