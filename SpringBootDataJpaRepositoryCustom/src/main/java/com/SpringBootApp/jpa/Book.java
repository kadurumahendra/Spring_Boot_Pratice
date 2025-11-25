package com.SpringBootApp.jpa;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "books10")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@Column(name = "titles")
	private String title;
	
	
	
	@Column(name = "authors")
	private String author;
	
	@Column(name = "genres")
	private String genre;
	
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "dates")
	private Date publishedDate;

}
