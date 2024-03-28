package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TransactionHistoryTest {

    @Test
    void testTransactionHistoryCreation() {
        // Create a new transaction history
        Date date = new Date();
        TransactionHistory transactionHistory = new TransactionHistory(date, "Description", 100.0, "Credit");

        // Verify the transaction history fields
        assertEquals(date, transactionHistory.getDate(), "Date mismatch");
        assertEquals("Description", transactionHistory.getDescription(), "Description mismatch");
        assertEquals(100.0, transactionHistory.getAmount(), 0.01, "Amount mismatch");
        assertEquals("Credit", transactionHistory.getType(), "Type mismatch");
    }

    @Test
    void testGettersAndSetters() {
        // Create a new date object
        Date date = new Date();

        // Create a new transaction history
        TransactionHistory transactionHistory = new TransactionHistory();

        // Set transaction history fields using setters
        transactionHistory.setDate(date);
        transactionHistory.setDescription("Shopping");
        transactionHistory.setAmount(75.0);
        transactionHistory.setType("Debit");

        // Verify the transaction history fields using getters
        assertEquals(date, transactionHistory.getDate(), "Date mismatch");
        assertEquals("Shopping", transactionHistory.getDescription(), "Description mismatch");
        assertEquals(75.0, transactionHistory.getAmount(), 0.01, "Amount mismatch");
        assertEquals("Debit", transactionHistory.getType(), "Type mismatch");
    }


    @Test
    void testConstructorWithNoArgs() {
        // Create a new transaction history
        TransactionHistory transactionHistory = new TransactionHistory();

        // Verify that the object is not null
        assertNotNull(transactionHistory, "TransactionHistory object should not be null");
    }
}
