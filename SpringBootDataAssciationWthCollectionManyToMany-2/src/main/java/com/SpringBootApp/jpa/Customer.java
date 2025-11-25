package com.SpringBootApp.jpa;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

	@Id
	private Integer cid;
	
	private String cname;
	
	@OneToMany
	@JoinColumn(name = "customer_id")
	private List<Order> orders;
}
