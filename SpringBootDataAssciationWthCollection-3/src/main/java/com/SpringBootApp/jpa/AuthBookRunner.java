package com.SpringBootApp.jpa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class AuthBookRunner implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepo;

    @Autowired
    private BookRepository bookRepo;

    @Override
    public void run(String... args) throws Exception {

        Author a1 = new Author(101, "mahendra", null);

        // save parent first
        authorRepo.save(a1);

        Book b1 = new Book(1, "Java Basics",null);
        Book b2 = new Book(2, "Spring Boot Guide",null);

        // set FK values
        b1.setAuthorId(101);
        b2.setAuthorId(102);

        List<Book> list = Arrays.asList(b1, b2);

        // now save books
        bookRepo.saveAll(list);

        // update author list
        a1.setBooks(list);
        authorRepo.save(a1);

        System.out.println(a1);
    }
}
