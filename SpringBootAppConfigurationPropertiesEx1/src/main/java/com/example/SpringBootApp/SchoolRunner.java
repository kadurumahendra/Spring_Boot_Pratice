package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SchoolRunner implements CommandLineRunner {

    @Autowired
    private School school;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("School details loading");
        System.out.println("School details: " + school);
        System.out.println("Principal details: " + school.getPrincipal());
    }
}
