package com.SpringBootApp.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="ord_table")
public class Order {
	
	@Id
	private Integer orderId;
	
	private String orderCode;
	
	private Double orderCost;
	
	
	private String orderStatus;

}
