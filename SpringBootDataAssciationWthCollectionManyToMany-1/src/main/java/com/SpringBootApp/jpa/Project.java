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
@Table(name = "projects")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Project {
	
	@Id
	private Integer pid;
	
	
	private String pname;
	
	@OneToMany
	@JoinColumn(name = "projects")
	private List<EmployeeProject> assignments;
	
	

}
