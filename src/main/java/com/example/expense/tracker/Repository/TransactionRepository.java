package com.example.expense.tracker.Repository;

import com.example.expense.tracker.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    // Define custom query methods if needed
}
