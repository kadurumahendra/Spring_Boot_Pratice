package com.SpringBootApp.jpa;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="departments2")

public class Department {
	
	@Id
	
	private Integer id;
	
	
	private String deptName;
	
	@OneToMany
	@JoinColumn(name = "eIdFk")
	private List<Employee> employee;

}
