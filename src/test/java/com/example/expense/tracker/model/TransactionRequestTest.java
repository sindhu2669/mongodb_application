package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TransactionRequestTest {

    @Test
    void testGettersAndSetters() {
        // Create a new transaction request
        TransactionRequest transactionRequest = new TransactionRequest();

        // Set transaction request fields using setters
        transactionRequest.setDescription("Shopping");
        transactionRequest.setAmount(75.0);
        transactionRequest.setCategory("Groceries");
        transactionRequest.setType("Debit");

        // Verify the transaction request fields using getters
        assertEquals("Shopping", transactionRequest.getDescription(), "Description mismatch");
        assertEquals(75.0, transactionRequest.getAmount(), 0.01, "Amount mismatch");
        assertEquals("Groceries", transactionRequest.getCategory(), "Category mismatch");
        assertEquals("Debit", transactionRequest.getType(), "Type mismatch");
    }

    @Test
    void testConstructorWithNoArgs() {
        // Create a new transaction request
        TransactionRequest transactionRequest = new TransactionRequest();

        // Verify that the object is not null
        assertNotNull(transactionRequest);
    }
}
