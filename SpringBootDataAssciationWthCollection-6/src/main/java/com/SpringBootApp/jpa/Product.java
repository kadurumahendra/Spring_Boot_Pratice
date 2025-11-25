package com.SpringBootApp.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "products1")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Product {
	
	@Id
	private Integer pid;
	
	private String pname;
	
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "modelFk")   // FK column in products1 table
	private Model models;

}
