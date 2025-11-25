package com.SpringBootApp.jpa;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public void run(String... args) throws Exception {

        Employee e1 = new Employee(101, "Mahi", 300.0, "CSE");
        Employee e2 = new Employee(102, "Mahendra", 400.0, "ECe");
        Employee e3 = new Employee(103, "Keerthi", 52000.0, "HR");
        Employee e4 = new Employee(104, "Ravi", 38000.0, "Finance");
        Employee e5 = new Employee(105, "Divya", 60000.0, "Admin");
        Employee e6 = new Employee(106, "Rajesh", 25000.0, "Support");
        Employee e7 = new Employee(107, "Harika", 70000.0, "Marketing");
        Employee e8 = new Employee(108, "Kalyan", 48000.0, "Sales");
        Employee e9 = new Employee(109, "Priya", 54000.0, "IT");
        Employee e10 = new Employee(110, "Teja", 32000.0, "Operations");
        Employee e11 = new Employee(111, "Anusha", 41000.0, "R&D");

        System.out.println("Before Save Count: " + repo.count());

        
        repo.save(e1);
        
        repo.deleteById(111);
        
        repo.deleteAllById(Arrays.asList(111, 110,108,112));
        
        repo.existsById(105);
        
        repo.getClass();
        repo.saveAll(Arrays.asList(e2,e3,e4,e5));
//        repo.findAll(Arrays.asList(e7));
//        repo.findAll(Arrays.asList(107));   // list of IDs


        System.out.println("After Save Count: " + repo.count());
    }
}

