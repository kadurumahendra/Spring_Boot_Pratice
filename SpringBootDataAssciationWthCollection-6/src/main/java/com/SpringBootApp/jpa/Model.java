package com.SpringBootApp.jpa;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "models1")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Model {

	@Id
	private Integer id;
	
	private String name;
	
	@OneToMany
	@JoinColumn(name = "modelFk")   // Same FK as product side
	private List<Product> products;

}
