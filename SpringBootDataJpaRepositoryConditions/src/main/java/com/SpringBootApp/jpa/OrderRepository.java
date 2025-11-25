package com.SpringBootApp.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByCustomerName(String name);

    List<Order> findByProduct(String product);

    List<Order> findByQuantityGreaterThan(Integer qty);

    List<Order> findByIdLessThanEqual(Integer id);

    List<Order> findByProductOrCustomerName(String product, String name);

    List<Order> findByOrderDateBetween(Date start, Date end);

    List<Order> findByQuantityGreaterThanEqual(Integer qty);

    List<Order> findByQuantityLessThan(Integer qty);
    
    List<Order> findByProductAndCustomerName(String product, String name);

    
    List<Order> findByProductIsNull();
    
    List<Order> findByProductIsNotNull();
    
    List<Order> findByProductLike(String product);
    
    List<Order> findByProductNotLike(String product);
    
    
}
