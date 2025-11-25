package com.SpringBootApp.jpa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VehicleRunner implements CommandLineRunner {

    @Autowired
    private VehicleRepository repo;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Date d1 = sdf.parse("12-11-2010");
        Date d2 = sdf.parse("10-10-2025");

        repo.saveAll(Arrays.asList(
            new Vehicle(null, "Mahendra", "Car", "Toyota", 6500.0, sdf.parse("12-03-2023"), "Hyderabad"),
            new Vehicle(null, "Sneha", "Bike", "Honda", 1200.0, sdf.parse("05-07-2022"), null),
            new Vehicle(null, "Rahul", "Car", "Hyundai", 7200.0, sdf.parse("18-11-2021"), "Chennai"),
            new Vehicle(null, "Aisha", "Scooter", "TVS", 900.0, sdf.parse("10-01-2024"), "Bangalore"),
            new Vehicle(null, "Vikram", "Truck", "Tata", 15000.0, sdf.parse("22-09-2023"), "Chennai"),
            new Vehicle(null, "Neha", "Car", "Maruti", 4300.0, sdf.parse("15-02-2022"), null),
            new Vehicle(null, "Rakesh", "Bike", "Royal Enfield", 1700.0, sdf.parse("11-06-2021"), "Hyderabad"),
            new Vehicle(null, "Priya", "Car", "Kia", 8200.0, sdf.parse("30-12-2023"), "Bangalore"),
            new Vehicle(null, "Amit", "Auto", "Bajaj", 2500.0, sdf.parse("08-04-2024"), "Hyderabad"),
            new Vehicle(null, "Pooja", "Truck", "Ashok Leyland", 18000.0, sdf.parse("25-08-2022"), "Chennai")
        ));

        System.out.println("Vehicles in Bangalore:");
        repo.findByLocation("Bangalore").forEach(System.out::println);

        System.out.println("\nVehicles of type 'Scooter' with service cost > 900:");
        repo.findByVehicleTypeAndServiceCost("Scooter", 900.0).forEach(System.out::println);

        System.out.println("\nVehicles manufactured by brands starting with 'Ba':");
        repo.findByManufacturerStartsWith("Ba").forEach(System.out::println);

        System.out.println("\nVehicles with owner names containing 'Aisha':");
        repo.findByOwnerNameContains("Aisha").forEach(System.out::println);

        System.out.println("\nVehicles serviced between " + d1 + " and " + d2 + ":");
        repo.findByServiceDateBetween(d1, d2).forEach(System.out::println);

        System.out.println("\nVehicles with service cost < 4300 or type 'Car':");
        repo.findByServiceCostLessThanOrVehicleType(4300.0, "Car").forEach(System.out::println);

        System.out.println("\nVehicles with NULL location:");
        repo.findByLocationIsNull().forEach(System.out::println);

        System.out.println("\nVehicles whose type not like 'Truck':");
        repo.findByVehicleTypeNotLike("Truck").forEach(System.out::println);

        System.out.println("\nVehicles serviced before " + d1 + ":");
        repo.findByServiceDateBefore(d1).forEach(System.out::println);

        System.out.println("\nVehicles with manufacturer in list:");
        List<String> manufacturers = Arrays.asList("Toyota", "Honda", "Ford");
        repo.findByManufacturerIn(manufacturers).forEach(System.out::println);
    }
}
