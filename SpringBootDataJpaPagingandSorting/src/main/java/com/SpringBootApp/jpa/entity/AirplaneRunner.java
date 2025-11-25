package com.SpringBootApp.jpa.entity;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;   
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

@Component
public class AirplaneRunner implements CommandLineRunner {

    @Autowired
    private AirplaneRepository repo;

    @Override
    public void run(String... args) throws Exception {

        // Insert sample data
        repo.saveAll(Arrays.asList(
                new Airplane("A101", "jet", 200),
                new Airplane("A102", "Boeing 737", 180),
                new Airplane("A103", "Airbus A320", 160),
                new Airplane("A104", "Boeing 747", 416),
                new Airplane("A105", "Airbus A380", 525),
                new Airplane("A106", "Cessna 172", 4),
                new Airplane("A107", "Embraer E190", 100),
                new Airplane("A108", "Bombardier Q400", 78),
                new Airplane("A109", "Gulfstream G650", 18),
                new Airplane("A110", "ATR 72", 70),
                new Airplane("A111", "Boeing 777", 396)
        ));

        System.out.println(repo.count());

        // Sort by id ASC
        repo.findAll(Sort.by("id"))
                .forEach(System.out::println);

        // Sort by model ASC
        repo.findAll(Sort.by("model"))
                .forEach(System.out::println);

        // Sort by id DESC
        repo.findAll(Sort.by(Direction.DESC, "id"))
                .forEach(System.out::println);

        // Sort by capacity DESC
        repo.findAll(Sort.by(Direction.DESC, "capacity"))
                .forEach(System.out::println);

        // Sort by id DESC, model DESC
        repo.findAll(Sort.by(Direction.DESC, "id", "model"))
                .forEach(System.out::println);

        // Sort by id ASC, capacity ASC
        repo.findAll(Sort.by(Direction.ASC, "id", "capacity"))
                .forEach(System.out::println);

        // findAllById
        System.out.println(repo.findAllById(Arrays.asList("A101")));

        // Sort by id ASC
        repo.findAll(Sort.by(Direction.ASC, "id"))
                .forEach(System.out::println);

        // Correct version using Sort.Order
        repo.findAll(
                Sort.by(
                        Order.asc("id"),      // ascending
                        Order.desc("model")   // descending
                )
        ).forEach(System.out::println);
    }
}
