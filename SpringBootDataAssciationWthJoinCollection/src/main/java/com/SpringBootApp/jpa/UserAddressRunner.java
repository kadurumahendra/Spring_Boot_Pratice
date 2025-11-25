package com.SpringBootApp.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserAddressRunner implements CommandLineRunner {

    @Autowired
    private UserRepository repo;

    @Autowired
    private AddressRepository arepo;

    @Override
    public void run(String... args) throws Exception {

        Address a1 = new Address(1001, "Hyderabad", "Telangana", null);
        Address a2 = new Address(1002, "Bangalore", "Karnataka", null);
        Address a3 = new Address(1003, "Chennai", "Tamil Nadu", null);

        User u1 = new User(1, "Ravi", a1);
        User u2 = new User(2, "Kiran", a2);
        User u3 = new User(3, "Mahesh", a3);

        arepo.saveAll(Arrays.asList(a1, a2, a3));
        repo.saveAll(Arrays.asList(u1, u2, u3));

        System.out.println("---- Users With Address ----");
        repo.findAllUsersWithAddress().forEach(System.out::println);

        System.out.println("---- Addresses With Users ----");
        arepo.findAllAddressWithUsers().forEach(System.out::println);

        System.out.println("---- Users by City: Bangalore ----");
        repo.findAllUserWithcity("Bangalore").forEach(System.out::println);

        System.out.println("---- Addresses where Username starts with M ----");
        arepo.findByUserStartsWith("M").forEach(System.out::println);

        System.out.println("---- Username + City Projection ----");
        List<Object[]> results = repo.findUsernamesAndCities();
        for (Object[] row : results) {
            String username = (String) row[0];
            String city = (String) row[1];
            System.out.println("Username: " + username + ", City: " + city);
        }
    }
}
