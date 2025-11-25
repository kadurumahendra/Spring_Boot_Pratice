package com.SpringBootApp.jpa;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseStudentRunner implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private CourseRepository courseRepo;

    @Override
    public void run(String... args) throws Exception {

        // Create Students without courses initially
        Student s1 = new Student(1, "Mahesh", null);
        Student s2 = new Student(2, "Rohit", null);

        studentRepo.saveAll(Arrays.asList(s1, s2));

        // Create Courses and assign students
        Course c1 = new Course(101, "Java", Arrays.asList(s1));
        Course c2 = new Course(102, "Python", Arrays.asList(s1, s2));
        Course c3 = new Course(103, "SQL", Arrays.asList(s2));

        courseRepo.saveAll(Arrays.asList(c1, c2, c3));

        // Update students' courses list to keep both sides consistent
        s1.setCourses(Arrays.asList(c1, c2));
        s2.setCourses(Arrays.asList(c2, c3));
        studentRepo.saveAll(Arrays.asList(s1, s2));

        // Print test output
        courseRepo.findAll().forEach(course -> {
            System.out.println("Course: " + course.getCname());
            course.getStudents().forEach(student ->
                System.out.println(" - Student: " + student.getSname()));
        });
    }
}
