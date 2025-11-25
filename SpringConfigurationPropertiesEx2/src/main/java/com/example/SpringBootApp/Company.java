package com.example.SpringBootApp;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "company")
public class Company {
	
	private String companyName;
	
	private String location;
	
	private CEO ceo;
	
	private List<Department> departments;

	public Company() {
		super();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public CEO getCeo() {
		return ceo;
	}

	public void setCeo(CEO ceo) {
		this.ceo = ceo;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", location=" + location + ", ceo=" + ceo + ", departments="
				+ departments + "]";
	}
	

}
