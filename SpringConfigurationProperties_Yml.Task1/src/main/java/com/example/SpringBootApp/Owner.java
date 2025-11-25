package com.example.SpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	
	private String ownerName;
	
	private int experince;

	public Owner() {
		super();
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}

	@Override
	public String toString() {
		return "Owner [ownerName=" + ownerName + ", experince=" + experince + "]";
	}
	
	
	
	
	
	

}
