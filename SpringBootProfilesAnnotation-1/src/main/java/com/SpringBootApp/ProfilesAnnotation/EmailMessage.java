package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@Profile({"default", "qa"})
@ConfigurationProperties(prefix = "myapp")
public class EmailMessage {

    private String subject;
    private String body;
}
