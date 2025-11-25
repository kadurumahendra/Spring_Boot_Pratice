package com.SpringBootApp.jpa;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Student {
	@Id
	@Column(name = "stu_id")
	private Integer id;
	
	@Column(name = "stu_name")
	private String name;
	
	@OneToMany(mappedBy = "student")
	private List<Course> courses;

}
