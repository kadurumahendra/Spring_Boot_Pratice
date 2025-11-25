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
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	
	@Id
	private Integer eid;
	
	private String ename;
	
	@OneToMany
	@JoinColumn(name = "employee")
	private List<EmployeeProject> assignments;

}
