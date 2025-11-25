package com.SpringBootApp.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDepartmentRunner implements CommandLineRunner {

	@Autowired
	private DepartmentRepository repo;

	@Autowired
	private EmployeeRepository erepo;

	@Override
	public void run(String... args) throws Exception {

		Department d1 = new Department(10, "HR", null);
		Department d2 = new Department(20, "IT", null);

		Employee e1 = new Employee(101, "Mahesh", 30000.0, d1);
		Employee e2 = new Employee(102, "Kiran", 35000.0, d1);

		Employee e3 = new Employee(103, "Raju", 40000.0, d2);
		Employee e4 = new Employee(104, "Suresh", 45000.0, d2);

		repo.saveAll(Arrays.asList(d1, d2));
		erepo.saveAll(Arrays.asList(e1, e2, e3, e4));

		List<Object[]> results = repo.findDepartmentEmployeeName();

		for (Object[] r : results) {
			String deptName = (String) r[0];
			String empName = (String) r[1];
			System.out.println("Department: " + deptName + ", Employee: " + empName);
		}
	}
}
