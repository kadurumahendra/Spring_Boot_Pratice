package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@Profile({"test", "prod"})
public class Course {

    private int courseId;
    private String courseName;
    private Professor professor;

}
