package com.example.expense.tracker.Repository; // Note the lowercase 'r' in 'repository'

import com.example.expense.tracker.model.Transaction; // Import the correct Transaction class
import jakarta.persistence.Entity;
import org.springframework.data.mongodb.repository.MongoRepository; // Use MongoRepository
import org.springframework.stereotype.Repository;



@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    // Define custom query methods if needed
}
