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
@Table(name = "students")
public class Student {
	
	@Id
	@Column(name = "student_id")
	private Integer id;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name = "student_email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "course_fk")
	private Course course;

}
