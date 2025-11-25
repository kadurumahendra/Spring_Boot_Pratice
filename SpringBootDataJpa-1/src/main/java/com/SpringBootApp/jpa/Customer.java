package com.SpringBootApp.jpa;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Entity
@NoArgsConstructor
@Data

@Table(name = "cust_table")
public class Customer {
	
	@Id
	private Integer custId;
	
	
	private String custName;
	
	private Double custBill;
	
	
	
	

}
