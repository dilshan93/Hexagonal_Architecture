package com.example.hexagonal_architecture.infrastracture.configuration;


import com.example.hexagonal_architecture.HexagonalArchitectureApplication;
import com.example.hexagonal_architecture.domain.OrderRepository;
import com.example.hexagonal_architecture.domain.service.DomainOrderService;
import com.example.hexagonal_architecture.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalArchitectureApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
