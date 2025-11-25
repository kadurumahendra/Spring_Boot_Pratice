package com.SpringBootApp.jpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    private Studentrepository repo;

    @Override
    public void run(String... args) throws Exception {

        // Single student
        Student s = new Student(1, "mahendra", "cse", 2025, new Date());

        // Save multiple students
        repo.saveAll(Arrays.asList(
                new Student(2, "sandeep", "ece", 2026, new Date()),
                new Student(3, "keerthi", "science", 2019, new Date()),
                new Student(4, "mahendra", "inter", 2021, new Date()),
                new Student(5, "sandeep", "inter", 2020, new Date()),
                new Student(6, "keerthi", "inter", 2018, new Date()),
                new Student(7, "munna", "polytechnic", 2027, new Date()),
                new Student(8, "prasad", "graduated", 2020, new Date()),
                new Student(9, "anitha", "10th", 1995, new Date())
        ));

        repo.save(s);

        // Queries
        System.out.println("=== FIND BY NAME ===");
        repo.findByName("mahendra").forEach(System.out::println);

        System.out.println("=== FIND BY DEPT ===");
        repo.findByDeptIs("ece").forEach(System.out::println);

        System.out.println("=== FIND BY YEAR ===");
        repo.findByYearEquals(1995).forEach(System.out::println);

        System.out.println("=== FIND BY ID ===");
        repo.findByIdIs(2).forEach(System.out::println);
      
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date d = sdf.parse("01/03/2025");
        Date d1 = sdf.parse("20/11/2025");
        
        Date d2 = sdf.parse("02/11/2025");
        
        
        Student s1 = new Student(10, "kavya", "bio", 2021, d);
        
        Student s2 = new Student(11, "haritha", "mech", 1997, d1);
        
        repo.findByDate(d).forEach(System.out::println);
        
        repo.findByDate(d1).forEach(System.out::println);
        
//        repo.findByDateis(d2).forEach(System.out::println);
        
        
        
    }
}
