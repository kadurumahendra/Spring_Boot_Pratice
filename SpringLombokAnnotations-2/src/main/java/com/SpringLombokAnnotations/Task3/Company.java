package com.SpringLombokAnnotations.Task3;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties(prefix = "company")
@Data 
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Company {
	
	private String companyName;
	
	private String location;
	
	private CEO ceo;
	
	private List<Employee> employees;
	

}
