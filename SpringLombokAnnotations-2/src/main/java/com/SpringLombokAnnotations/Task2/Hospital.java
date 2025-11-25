package com.SpringLombokAnnotations.Task2;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties(prefix = "hospital")
@NoArgsConstructor
@Data
@EqualsAndHashCode

public class Hospital {
	
	private String hospitalName;
	
	private String city;
	
	private Director director;
	
	private Set<Ward> wards;

}
