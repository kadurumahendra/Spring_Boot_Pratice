package SpringBootAppConfigurationProperties.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GarageRunner implements CommandLineRunner {

    @Autowired
    private Garage garage;

    @Override
    public void run(String... args) {
        System.out.println("Garage Details:");
        System.out.println(garage);
    }
}
