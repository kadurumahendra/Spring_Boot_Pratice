package com.SpringBootApp.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "courses")
public class Course {
	
	@Id
	@Column(name = "course_id")
	private Integer id;
	
	@Column(name = "course_name")
	private String title;
	
	@Column(name = "course_duration")
	private Integer duration;

}
