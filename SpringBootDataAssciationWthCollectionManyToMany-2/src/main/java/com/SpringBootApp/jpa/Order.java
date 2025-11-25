package com.SpringBootApp.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	@Id
	private Integer oid;
	
	private String productName;
	
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

}
