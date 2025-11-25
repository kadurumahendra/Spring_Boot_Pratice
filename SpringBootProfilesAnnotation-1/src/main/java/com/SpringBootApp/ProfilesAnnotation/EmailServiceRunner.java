package com.SpringBootApp.ProfilesAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceRunner implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    @Autowired
    private EmailMessage emailMessage;

    @Autowired
    private SecurityConfig security;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=== Active Profile (qa) Beans Loaded ===");
        System.out.println("Email Service: " + emailService);
        System.out.println("Email Message: " + emailMessage);
        System.out.println("Security Config: " + security);
    }
}
