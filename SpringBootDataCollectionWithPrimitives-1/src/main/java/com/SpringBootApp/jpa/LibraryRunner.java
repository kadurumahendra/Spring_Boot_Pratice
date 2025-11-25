package com.SpringBootApp.jpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunner implements CommandLineRunner {

    @Autowired
    private LibraryRepository repo;

    @Override
    public void run(String... args) throws Exception {

        repo.save(new Library(
                null,
                "mahendra",
                "forest",
                Arrays.asList("sandeep", "keerthi"),
                new HashSet<>(Arrays.asList("munna", "mamatha", "geetha"))
        ));

        repo.saveAll(Arrays.asList(

                new Library(
                        101,
                        "The Lost Kingdom",
                        "Adventure",
                        Arrays.asList("Arun Mehta", "Kiran Rao"),
                        Set.of("History", "Adventure", "Bestseller")
                ),

                new Library(
                        102,
                        "Deep Space Secrets",
                        "Science",
                        Arrays.asList("Dr. Ananya Patel"),
                        Set.of("Science", "Research", "Space")
                ),

                new Library(
                        103,
                        "Whispers in the Wind",
                        "Novel",
                        Arrays.asList("Meera Sharma", "Rohit Verma"),
                        Set.of("Drama", "Romance")
                ),

                new Library(
                        104,
                        "The Ancient Prophecy",
                        "Fantasy",
                        Arrays.asList("Vikram Nair"),
                        Set.of("Fantasy", "Magic", "Adventure")
                ),

                new Library(
                        105,
                        "Crimes of the Night",
                        "Thriller",
                        Arrays.asList("Neha Kapoor", "Siddharth Iyer"),
                        Set.of("Thriller", "Mystery", "Detective")
                )
        ));

        System.out.println("\n=== Category: forest ===");
        repo.findByCategory("forest").forEach(System.out::println);

        System.out.println("\n=== Author Like 'Neha Kapoor%' ===");
        repo.findByAuthorLike("Neha Kapoor%").forEach(System.out::println);

        System.out.println("\n=== Exact author search ===");
        repo.findByAuthor("Neha Kapoor").forEach(System.out::println);
    }
}
