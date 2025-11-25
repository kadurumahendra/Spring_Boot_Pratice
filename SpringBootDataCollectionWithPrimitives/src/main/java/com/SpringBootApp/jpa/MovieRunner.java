package com.SpringBootApp.jpa;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MovieRunner implements CommandLineRunner {

    @Autowired
    private MovieRepository repo;

    @Override
    public void run(String... args) throws Exception {

        repo.saveAll(Arrays.asList(
            new Movie(101, "Inception",
                Arrays.asList("English", "French"),
                new HashSet<>(Arrays.asList(100.0, 600.0, 0.0))
            ),
            new Movie(102, "Interstellar",
                Arrays.asList("English", "German"),
                new HashSet<>(Arrays.asList(400.0, 700.0))
            ),
            new Movie(103, "The Dark Knight",
                Arrays.asList("English", "Spanish"),
                new HashSet<>(Arrays.asList(200.0, 300.0))
            )
        ));

        repo.findAll().forEach(System.out::println);
    }
}
