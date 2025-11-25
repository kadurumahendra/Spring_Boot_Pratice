package com.SpringBootApp.Getter;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties(prefix = "myapp")
@NoArgsConstructor
@Data
public class University {
	
	private String universityName;
	
	private String location;
	
	private Dean dean;
	
	private List<Department> departments;

}
