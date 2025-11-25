package com.SpringBootApp.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "departments")
public class Department {
	
	@Id
	@Column(name = "ids")
	private Integer dId;
	
	@Column(name = "name")
	private String name;
	
	
	

}
