package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@ConfigurationProperties("myapp")
@Profile({"uat","prod"})
public class University {
	
	
private int estYear;
	
	private String sname;
	
	
	private Student student;

}
