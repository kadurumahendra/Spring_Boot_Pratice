package com.SpringBootApp.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "products")
public class Product {
	
	
	@Id
	@Column(name = "pid")
	private Integer id;
	
	@Column(name = "pcode")
	private String pcode;
	
	
	@ManyToOne
	@JoinColumn(name = "dfk")
	private Department dept;
	

}
