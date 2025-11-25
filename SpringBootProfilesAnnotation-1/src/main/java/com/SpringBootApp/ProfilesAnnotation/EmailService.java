package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Profile("qa")
@ConfigurationProperties(prefix = "myapp")
@Data
@NoArgsConstructor
public class EmailService {

    private String host;
    private int port;
    private boolean active;
    private String user;
}
