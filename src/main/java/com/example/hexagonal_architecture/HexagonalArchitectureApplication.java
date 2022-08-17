package com.example.hexagonal_architecture;

import com.example.hexagonal_architecture.application.cli.CliOrderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HexagonalArchitectureApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HexagonalArchitectureApplication.class, args);
    }

    @Autowired
    public CliOrderController orderController;

    @Autowired
    public ConfigurableApplicationContext context;
    @Override
    public void run(String... args) throws Exception {
        orderController.createCompleteOrder();
        orderController.createIncompleteOrder();
    }
}
