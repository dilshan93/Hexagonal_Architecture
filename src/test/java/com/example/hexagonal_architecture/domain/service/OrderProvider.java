package com.example.hexagonal_architecture.domain.service;

import com.example.hexagonal_architecture.domain.Order;
import com.example.hexagonal_architecture.domain.Product;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderProvider {

    public static Order getCreatedOrder() {
        return new Order(UUID.randomUUID(), new Product(UUID.randomUUID(), BigDecimal.TEN, "productName"));
    }

    public static Order getCompletedOrder() {
        final Order order = getCreatedOrder();
        order.complete();

        return order;
    }
}
