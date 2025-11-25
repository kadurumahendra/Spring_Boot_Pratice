package com.SpringBootApp.jpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRunner implements CommandLineRunner {

    @Autowired
    private BookRepository repo;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Date d1 = sdf.parse("12-11-2021");
        Date d2 = sdf.parse("15-10-2025");

        repo.saveAll(Arrays.asList(
            new Book(null, "The Silent River", "Aravind Rao", "Fiction", 650.0, sdf.parse("12-03-2020")),
            new Book(null, "Hidden Algorithms", "Neha Sharma", "Science", 850.0, sdf.parse("18-07-2021")),
            new Book(null, "The Last Kingdom", "Vikram Mehta", "Historical", 550.0, sdf.parse("25-11-2019")),
            new Book(null, "Quantum Sparks", "Dr. Ananya Patel", "Science", 920.0, sdf.parse("09-02-2023")),
            new Book(null, "Whispers of Night", null, "Horror", 480.0, sdf.parse("30-08-2018")),
            new Book(null, "The Broken Sword", "Rakesh Kulkarni", "Fiction", 720.0, sdf.parse("14-01-2022")),
            new Book(null, "Ancient Roads", "Meera Varma", "Travel", 390.0, sdf.parse("03-05-2017")),
            new Book(null, "Logic Unleashed", null, "Science", 1100.0, sdf.parse("22-12-2020")),
            new Book(null, "The Burning City", "Aisha Noor", "Fiction", 540.0, sdf.parse("19-04-2019")),
            new Book(null, "Beyond the Stars", "Karan Bhatt", "Fantasy", 780.0, sdf.parse("11-11-2023"))
        ));

        System.out.println("Books with price > 500 and genre 'Fiction'");
        repo.findByPriceAndGenre(500.0, "Fiction").forEach(System.out::println);

        System.out.println("Books with author NULL or genre NOT LIKE '%Horror%'");
        repo.findByAuthorIsNullOrGenreNotLike("%Horror%").forEach(System.out::println);

        System.out.println("Books with title LIKE '%The%'");
        repo.findByTitle("%The%").forEach(System.out::println);

        System.out.println("Books published between " + d1 + " and " + d2);
        repo.findByPublishedDateBetween(d1, d2).forEach(System.out::println);

        System.out.println("Books with price < 1000 or genre 'Science'");
        repo.findByPriceLessThanOrGenre(1000.0, "Science").forEach(System.out::println);

        System.out.println("Books by author LIKE 'Aravind Rao'");
        repo.findByAuthor("Aravind Rao").forEach(System.out::println);

        System.out.println("Books with title ending with 'River'");
        repo.findByTitleEndingWith("River").forEach(System.out::println);

        System.out.println("Books published before " + d1);
        repo.findByPublishedDateBefore(d1).forEach(System.out::println);

        List<String> genresToFind = Arrays.asList("Romance", "Thriller", "Science");
        System.out.println("Books with genre in " + genresToFind);
        repo.findByGenreIn(genresToFind).forEach(System.out::println);
    }
}
