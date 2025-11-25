package com.SpringBootApp.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public void run(String... args) throws Exception {

        // Save single employee
        Employee e1 = new Employee(1, "mahendra", "cse", 300.0, "naidupeta");
        repo.save(e1);

        // Save multiple employees
        repo.saveAll(Arrays.asList(
                new Employee(2, "sandeep", "ece", 400.0, "vgk"),
                new Employee(3, "Keerthi", "EEE", 450.0, "Chennai"),
                new Employee(4, "Rohit", "IT", 550.0, "Hyderabad"),
                new Employee(5, "Divya", "CIVIL", 380.0, "Bangalore"),
                new Employee(6, "Kiran", "MECH", 420.0, "Nellore"),
                new Employee(7, "Shiva", "CSE", 600.0, "Tirupati"),
                new Employee(8, "Harsha", "IT", 700.0, "Hyderabad"),
                new Employee(9, "Teja", "ECE", 480.0, "Chittoor"),
                new Employee(10, "Kavya", "CSE", 750.0, "Bangalore"),
                new Employee(11, "Anitha", "IT", 530.0, "Vellore"),
                new Employee(12, "Manoj", "MECH", 390.0, "Chennai")
        ));

        // Sorting examples
        repo.findAll(Sort.by("id")).forEach(System.out::println);

        repo.findAll(Sort.by("id", "name")).forEach(System.out::println);

        repo.findAll(Sort.by(Direction.ASC, "id")).forEach(System.out::println);

        repo.findAll(Sort.by(Direction.DESC, "id", "salary")).forEach(System.out::println);

        repo.findAll(Sort.by(Direction.DESC, "name")).forEach(System.out::println);

        repo.findAll(Sort.by(Order.asc("id"), Order.desc("name"))).forEach(System.out::println);

        repo.findAll(Sort.by(Order.desc("salary"), Order.asc("location"))).forEach(System.out::println);


        // ===== Pagination =====
        Pageable p = PageRequest.of(1, 4);  // page 1, size 4

        Page<Employee> page = repo.findAll(p);  // pageable call

        page.forEach(System.out::println); // print records
        
        
        
        Pageable p1 = PageRequest.of(5, 10);
        
        Page<Employee>page1 = repo.findAll(p1);
        
        page1.forEach(System.out::println);
        
        
        
    }
}
