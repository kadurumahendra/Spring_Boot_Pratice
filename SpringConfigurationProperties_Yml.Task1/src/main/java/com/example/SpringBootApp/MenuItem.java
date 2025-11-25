package com.example.SpringBootApp;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class MenuItem {
	
	private String itemName;
	
	private String category;
	
	private int price;
	 
	
	
	

	public MenuItem() {
		super();
	}




	

	@Override
	public String toString() {
		return "MenuItem [itemName=" + itemName + ", category=" + category + ", price=" + price + "]";
	}
	
	

}
