package com.SpringBootApp.Profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "mydb")
public class Database {
	
	private String url;
	
	private String username;
	
	private String password;
	
	private String port;
	

}
