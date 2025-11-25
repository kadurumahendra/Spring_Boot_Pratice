package com.SpringBootApp.jpa;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "names")
    private String ownerName;

    @Column(name = "type")
    private String vehicleType;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "cost")
    private Double serviceCost;

    @Column(name = "date")
    private Date serviceDate;

    @Column(name = "location")
    private String location;
}
