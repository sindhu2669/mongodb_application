package com.example.expense.tracker.Repository;

import com.example.expense.tracker.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
class TransactionRepositoryTest {

    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    void testSaveTransaction() {
        // Create a transaction
        Transaction transaction = new Transaction();
        transaction.setDescription("Test Transaction");
        transaction.setAmount(100.0);
        transaction.setCategory("Test Category");
        transaction.setType("Test Type");

        // Save the transaction to the repository
        transactionRepository.save(transaction);

        // Fetch the saved transaction from the repository
        List<Transaction> transactions = transactionRepository.findAll();

        // Verify that the transaction is saved and fetched correctly
        assertEquals(1, transactions.size()); // <-- This assertion should pass if the transaction is saved correctly
        assertEquals("Test Transaction", transactions.get(0).getDescription());
        assertEquals(100.0, transactions.get(0).getAmount());
        assertEquals("Test Category", transactions.get(0).getCategory());
        assertEquals("Test Type", transactions.get(0).getType());
    }

}
