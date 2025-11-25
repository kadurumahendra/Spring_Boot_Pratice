package com.SpringBootApp.jpa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query("select a from Address a left join a.user")
    List<Address> findAllAddressWithUsers();
    
    @Query("SELECT a FROM Address a LEFT JOIN a.user u WHERE u.uname LIKE CONCAT(:name, '%')")
    List<Address> findByUserStartsWith(@Param("name") String name);
}
