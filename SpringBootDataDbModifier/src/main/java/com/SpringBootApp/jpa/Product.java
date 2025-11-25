package com.SpringBootApp.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@ToString
public class Product {

    @Id
    @Column(name = "product_id")
    private Integer pid;

    @Column(name = "product_name")
    private String pname;

    @Column(name = "product_price")
    private Double price;

    @Column(name = "product_quantity")
    private Integer quantity;
}
