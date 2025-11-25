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
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {

	@Id
	private Integer did;

	private String dname;

	@OneToMany
	@JoinColumn(name = "deptFk")
	private List<Employee> employees;

}
