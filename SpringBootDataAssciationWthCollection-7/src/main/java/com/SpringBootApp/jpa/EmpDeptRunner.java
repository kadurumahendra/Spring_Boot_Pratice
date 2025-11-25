package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmpDeptRunner implements CommandLineRunner{
	
	@Autowired
	private DepartmentRepository repo;
	
	@Autowired
	private EmployeeRepository repo1;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101, "mahendra", 300000.0);
		Employee e2 = new Employee(102, "sandeep",3000.0);
		Employee e3 = new Employee(103, "keerthi",50000.0);
		Employee e4 = new Employee(104,"kavya",4000.0);
		
		
		repo1.save(e1);
		
		repo1.saveAll(Arrays.asList(e2,e3,e4));
		
		
		Department d1 = new Department(201, "Hr", Arrays.asList(e1,e2));
		Department d2 =new Department(202,"Finance",Arrays.asList(e2,e3));
		Department d3 = new Department(203,"Bio tech",Arrays.asList(e3,e4));
		Department d4 = new Department(204,"Manager",Arrays.asList(e4,e1));
		
		repo.save(d1);
		
		repo.saveAll(Arrays.asList(d2,d3,d4));
		
	}

}
