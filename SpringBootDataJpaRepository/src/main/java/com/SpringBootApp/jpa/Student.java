package com.SpringBootApp.jpa;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "students_table")
public class Student {
	
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "department")
	private String dept;
	
	
	@Column(name = "year")
	private int year;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	

}
