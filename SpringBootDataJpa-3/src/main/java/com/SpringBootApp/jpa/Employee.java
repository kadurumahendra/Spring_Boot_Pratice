package com.SpringBootApp.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "emp_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private Integer empId;

    @Column(name = "name")
    private String empName;

    private Double salary;

    private String department;
}
