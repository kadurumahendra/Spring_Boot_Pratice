package com.SpringBootApp.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "airplane")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airplane {
	
	@Id
	@Column(name = "aid")
	private String id;
	
	@Column(name = "amodel")
	private String model;
	
	@Column(name = "acapacity")
	private Integer capacity;

}
