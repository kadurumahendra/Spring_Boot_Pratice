package com.SpringBootApp.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product(101, "sandeep", 1000.0, 10);
        repo.save(p1);

        int count = repo.updateNameByQuantity("mahendra", 10);
        System.out.println("Rows Updated: " + count);

        Product p2 = new Product(102, "sandeep", 30000.0, 30);
        Product p3 = new Product(103, "kavya", 40000.0, 50);

        repo.saveAll(Arrays.asList(p2, p3));

        int count1 = repo.updatePriceById(60000.0, 102);
        System.out.println("Rows updated for count1: " + count1);

        List<Object[]> results = repo.findByNameAndPrice();
        for (Object[] row : results) {
            String name = (String) row[0];
            Double price = (Double) row[1];
            System.out.println("Name: " + name + ", Price: " + price);
        }

        System.out.println("Products ordered by name ascending:");
        repo.findByProductByAsc().forEach(System.out::println);

        System.out.println("Products ordered by name descending:");
        repo.findByProductByDesc().forEach(System.out::println);

        System.out.println("Products with price between 10.0 and 60000.0:");
        repo.findByProductBetweenPrice(10.0, 60000.0).forEach(System.out::println);
    }
}
