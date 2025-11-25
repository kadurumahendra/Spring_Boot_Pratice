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
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Course {
	
	@Id
	@Column(name = "course_id")
	private Integer id;
	
	@Column(name = "course_title")
	private String title;
	
	@Column(name = "course_duration")
	private Integer duration;

	@ManyToOne
	@JoinColumn(name = "student_fk")
	private Student student;
}
