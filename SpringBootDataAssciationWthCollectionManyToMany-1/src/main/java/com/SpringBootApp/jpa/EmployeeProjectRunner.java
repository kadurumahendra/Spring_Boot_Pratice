package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProjectRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository erepo;

    @Autowired
    private ProjectRepository prepo;

    @Autowired
    private EmployeeProjectRepository eprepo;

    @Override
    public void run(String... args) throws Exception {

        Employee e1 = new Employee(101, "mahendra", null);
        Employee e2 = new Employee(102, "sandeep", null);

        Project p1 = new Project(201, "billing system", null);
        Project p2 = new Project(202, "EcommerceApp", null);

        erepo.saveAll(Arrays.asList(e1, e2));
        prepo.saveAll(Arrays.asList(p1, p2));

        EmployeeProject ep1 = new EmployeeProject(301, "developer", e1, p1);
        EmployeeProject ep2 = new EmployeeProject(302, "tester", e1, p2);
        EmployeeProject ep3 = new EmployeeProject(303, "manager", e2, p1);

        eprepo.saveAll(Arrays.asList(ep1, ep2, ep3));
    }
}


