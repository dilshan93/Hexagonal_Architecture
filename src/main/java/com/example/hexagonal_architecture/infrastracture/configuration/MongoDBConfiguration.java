package com.example.hexagonal_architecture.infrastracture.configuration;


import com.example.hexagonal_architecture.infrastracture.repository.mongo.SpringDataMongoOrderRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {
}
