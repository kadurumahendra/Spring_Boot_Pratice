package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UniversityRunner implements CommandLineRunner {

    @Autowired(required = false)
    private University university;

    @Autowired(required = false)
    private Course course;

    @Autowired(required = false)
    private Professor professor;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=== Loaded Beans Based on Active Profile ===");

        if (university != null)
            System.out.println("University: " + university);

        if (course != null)
            System.out.println("Course: " + course);

        if (professor != null)
            System.out.println("Professor: " + professor);
    }
}
