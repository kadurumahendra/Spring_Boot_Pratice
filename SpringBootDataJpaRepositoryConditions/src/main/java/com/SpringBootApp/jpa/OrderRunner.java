package com.SpringBootApp.jpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner implements CommandLineRunner {

    @Autowired
    private OrderRepository repo;

    @Override
    public void run(String... args) throws Exception {

        repo.saveAll(Arrays.asList(
                new Order(null, "mahendra", "watch", 10, new Date()),
                new Order(null, "sneha", "phone", 2, new Date()),
                new Order(null, "rahul", "laptop", 1, new Date()),
                new Order(null, "aisha", "earbuds", 5, new Date()),
                new Order(null, "vikram", "tablet", 3, new Date()),
                new Order(null, "neha", "camera", 7, new Date()),
                new Order(null, "rakesh", "keyboard", 4, new Date()),
                new Order(null, "priya", "mouse", 6, new Date()),
                new Order(null, "amit", "printer", 1, new Date()),
                new Order(null, "pooja", "monitor", 2, new Date())
        ));

        repo.findByCustomerName("rakesh").forEach(System.out::println);

        repo.findByProduct("printer").forEach(System.out::println);

        repo.findByQuantityGreaterThan(4).forEach(System.out::println);

        repo.findByIdLessThanEqual(6).forEach(System.out::println);

        repo.findByProductOrCustomerName("rahul", "mahendra").forEach(System.out::println);

        SimpleDateFormat sob = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Date start = sob.parse("10-11-2025 09:00:00");
        Date end = sob.parse("20-11-2025 18:00:00");

        repo.findByOrderDateBetween(start, end).forEach(System.out::println);

        repo.findByQuantityGreaterThanEqual(5).forEach(System.out::println);

        repo.findByQuantityLessThan(4).forEach(System.out::println);
        
        
        
        repo.findByProductAndCustomerName("neha", "mouse");
        
        
        repo.findByProductIsNull().forEach(System.out::println);
        
        
        repo.findByProductIsNotNull().forEach(System.out::println);
        
        
        repo.findByProductLike("watch").forEach(System.out::println);
        
        
        repo.findByProductNotLike("mointor").forEach(System.out::println);
    }
    
}
