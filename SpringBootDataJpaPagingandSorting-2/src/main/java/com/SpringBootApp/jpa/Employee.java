package com.SpringBootApp.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employee")
@Data
@ToString
public class Employee {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String department;
	
	private Double salary;
	
	
	private String location;

}
