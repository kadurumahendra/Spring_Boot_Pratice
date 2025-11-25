package com.SpringBootApp.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Product p SET p.pname = :name WHERE p.quantity = :quantity")
    int updateNameByQuantity(String name, int quantity);

    @Transactional
    @Modifying
    @Query("UPDATE Product p SET p.price = :price WHERE p.pid = :id")
    int updatePriceById(Double price, int id);

    @Transactional
    @Query("SELECT p.pname, p.price FROM Product p")
    List<Object[]> findByNameAndPrice();

    @Transactional
    @Query("SELECT p FROM Product p ORDER BY p.pname ASC")
    List<Product> findByProductByAsc();

    @Transactional
    @Query("SELECT p FROM Product p ORDER BY p.pname DESC")
    List<Product> findByProductByDesc();

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :price AND :price1")
    List<Product> findByProductBetweenPrice(Double price, Double price1);

}
