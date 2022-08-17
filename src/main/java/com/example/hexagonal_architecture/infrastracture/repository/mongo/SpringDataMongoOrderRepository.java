package com.example.hexagonal_architecture.infrastracture.repository.mongo;


import com.example.hexagonal_architecture.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoOrderRepository extends MongoRepository<Order, UUID> {
}
