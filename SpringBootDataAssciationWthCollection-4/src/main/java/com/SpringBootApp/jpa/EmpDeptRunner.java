package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmpDeptRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private DepartmentRepository repo1;

    @Override
    public void run(String... args) throws Exception {

        Department d1 = new Department(101, "CSE", null);
        repo1.save(d1);

        Employee e1 = new Employee(1, "mahendra", 300.0, d1);
        Employee e2 = new Employee(2, "sandeep", 400.0, d1);

        repo.saveAll(Arrays.asList(e1, e2));

        d1.setEmployees(Arrays.asList(e1, e2));
        repo1.save(d1);

        Department d2 = new Department(102, "ECE", null);
        repo1.save(d2);

        Employee e3 = new Employee(3, "keerthi", 900.0, d2);
        Employee e4 = new Employee(4, "anitha", 1000.0, d2);

        repo.saveAll(Arrays.asList(e3, e4));

        d2.setEmployees(Arrays.asList(e3, e4));
        repo1.save(d2);
    }
}
