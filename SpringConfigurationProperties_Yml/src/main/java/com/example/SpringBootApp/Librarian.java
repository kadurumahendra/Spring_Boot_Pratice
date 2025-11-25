package com.example.SpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class Librarian {
	
	private String name;
	
	private String shift;

	public Librarian() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return "Librarian [name=" + name + ", shift=" + shift + "]";
	}
	

}
