package com.example.SpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private String deptName;
	
	
	private int employees;


	public Department() {
		super();
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public int getEmployees() {
		return employees;
	}


	public void setEmployees(int employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", employees=" + employees + "]";
	}

	
}
