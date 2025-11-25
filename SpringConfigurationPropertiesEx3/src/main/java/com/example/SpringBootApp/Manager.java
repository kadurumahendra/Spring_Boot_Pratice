package com.example.SpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	private String name;
	
	private int experince;

	public Manager() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", experince=" + experince + "]";
	}
	
	
	

}
