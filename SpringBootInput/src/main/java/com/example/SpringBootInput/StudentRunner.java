package com.example.SpringBootInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    private Student student;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Student runner executing");
        System.out.println(student);
    }
}
