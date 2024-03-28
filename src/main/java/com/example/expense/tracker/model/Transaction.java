package com.example.expense.tracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id;
    private double amount;
    private String category;

    private String description;
    // Other fields and methods

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
    }

    public void setCategory(Object category) {
    }

    public void setType(Object type) {
    }

    // Constructors, getters, and setters
    // You can generate constructors, getters, and setters using your IDE or lombok.
}