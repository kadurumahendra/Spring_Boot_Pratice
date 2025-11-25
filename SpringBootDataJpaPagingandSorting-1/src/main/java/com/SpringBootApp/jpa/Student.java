package com.SpringBootApp.jpa;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="students")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String course;
	
	
	private Double fee;
	
	
	
}
