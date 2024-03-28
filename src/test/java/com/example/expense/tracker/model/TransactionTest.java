package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {

    @Test
    void testTransactionCreation() {
        // Create a new transaction
        Transaction transaction = new Transaction(100.0, "Food", "Lunch", "Expense");

        // Verify the transaction fields
        assertEquals(100.0, transaction.getAmount());
        assertEquals("Food", transaction.getCategory());
        assertEquals("Lunch", transaction.getDescription());
        assertEquals("Expense", transaction.getType());
    }

    @Test
    void testGettersAndSetters() {
        // Create a new transaction
        Transaction transaction = new Transaction();

        // Set transaction fields using setters
        transaction.setId("123");
        transaction.setAmount(50.0);
        transaction.setCategory("Transport");
        transaction.setDescription("Taxi");
        transaction.setType("Expense");

        // Verify the transaction fields using getters
        assertEquals("123", transaction.getId());
        assertEquals(50.0, transaction.getAmount());
        assertEquals("Transport", transaction.getCategory());
        assertEquals("Taxi", transaction.getDescription());
        assertEquals("Expense", transaction.getType());
    }

    @Test
    void testToString() {
        // Create a new transaction
        Transaction transaction = new Transaction(75.0, "Shopping", "Clothes", "Expense");

        // Verify the toString method
        String expectedToString = "Transaction{id='null', amount=75.0, category='Shopping', description='Clothes', type='Expense'}";
        assertEquals(expectedToString, transaction.toString());
    }
}
