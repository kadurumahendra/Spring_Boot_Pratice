package com.SpringBootApp.jpa;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String customerName;

    private String product;

    private Integer quantity;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
}
