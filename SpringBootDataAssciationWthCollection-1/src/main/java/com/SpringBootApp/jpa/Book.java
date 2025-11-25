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
@Data
@ToString
@Table(name = "books")
class Book {
	
	@Id
	@Column(name = "book_id")
	private Integer id;
	
	@Column(name = "book_title")
	private String title;
	
	@Column(name = "book_price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "AidFk")
	private Author author;

}
