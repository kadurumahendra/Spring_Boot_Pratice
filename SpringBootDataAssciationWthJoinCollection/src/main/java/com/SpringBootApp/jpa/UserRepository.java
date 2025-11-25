package com.SpringBootApp.jpa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    // LEFT JOIN
    @Query("select u from User u left join u.address")
    List<User> findAllUsersWithAddress();
    
    // USERS by CITY
    @Query("select u from User u left join u.address a where a.city = :city")
    List<User> findAllUserWithcity(String city);
    
    // USERNAME + CITY PROJECTION
    @Query("select u.uname, a.city from User u left join u.address a")
    List<Object[]> findUsernamesAndCities();
}
