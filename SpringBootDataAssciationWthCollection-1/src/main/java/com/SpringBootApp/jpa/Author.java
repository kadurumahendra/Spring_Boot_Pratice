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
@Table(name = "authors")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Author {
	
	
	@Id
	@Column(name = "auth_id")
	private Integer id;
	
	@Column(name = "auth_name")
	private String name;
	
	@Column(name = "auth_country")
	private String country;

}
