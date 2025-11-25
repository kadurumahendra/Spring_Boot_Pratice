package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@Profile("test")
public class Professor {

    private int professorId;
    private String professorName;
    private int experience;

}
