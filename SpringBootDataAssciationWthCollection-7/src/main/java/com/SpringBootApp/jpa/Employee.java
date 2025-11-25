package com.SpringBootApp.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees2")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	
	@Id
	private Integer id;
	
	
	private String name;
	
	
	private Double salary;
	
	
	

}
