package com.SpringLombokAnnotations.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {
	
	
	private int empId;
	
	private String empName;
	
	private int salary;
	

}
