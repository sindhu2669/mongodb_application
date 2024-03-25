package com.example.expense.tracker.Repository;

import com.example.expense.tracker.model.MessageMongo;

import jakarta.persistence.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface mongodbRepository extends MongoRepository<MessageMongo, String> {

}
