package com.SpringBootApp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    List<Vehicle> findByLocation(String location);

    @Query("SELECT v FROM Vehicle v WHERE v.vehicleType = :type AND v.serviceCost > :cost")
    List<Vehicle> findByVehicleTypeAndServiceCost(String type, Double cost);

    @Query("SELECT v FROM Vehicle v WHERE v.manufacturer LIKE CONCAT(:manufacturer, '%')")
    List<Vehicle> findByManufacturerStartsWith(String manufacturer);

    @Query("SELECT v FROM Vehicle v WHERE v.ownerName LIKE CONCAT('%', :ownerName, '%')")
    List<Vehicle> findByOwnerNameContains(String ownerName);

    @Query("SELECT v FROM Vehicle v WHERE v.serviceDate BETWEEN :start AND :end")
    List<Vehicle> findByServiceDateBetween(Date start, Date end);

    @Query("SELECT v FROM Vehicle v WHERE v.serviceCost < :cost OR v.vehicleType = :type")
    List<Vehicle> findByServiceCostLessThanOrVehicleType(Double cost, String type);

    @Query("SELECT v FROM Vehicle v WHERE v.location IS NULL")
    List<Vehicle> findByLocationIsNull();

    @Query("SELECT v FROM Vehicle v WHERE v.vehicleType NOT LIKE :pattern")
    List<Vehicle> findByVehicleTypeNotLike(String pattern);

    @Query("SELECT v FROM Vehicle v WHERE v.serviceDate < :date")
    List<Vehicle> findByServiceDateBefore(Date date);

    @Query("SELECT v FROM Vehicle v WHERE v.manufacturer IN :manufacturers")
    List<Vehicle> findByManufacturerIn(List<String> manufacturers);
}
