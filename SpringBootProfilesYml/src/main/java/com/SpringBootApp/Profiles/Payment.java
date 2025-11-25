package com.SpringBootApp.Profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Component
@Data
@ConfigurationProperties(prefix = "payment")
@EqualsAndHashCode
@NoArgsConstructor
public class Payment {
	
	
	private String provider;
	
	
	private String apikey;
	
	
	private String endpoint;
	
	
	private int timeout;

}
