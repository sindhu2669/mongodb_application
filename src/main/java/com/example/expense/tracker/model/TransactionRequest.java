package com.example.expense.tracker.model;

public class TransactionRequest {
    private String description;
    private double amount;
    private String category;
    private String type;

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    // Constructors, getters, and setters
    // You can generate constructors, getters, and setters using your IDE or lombok.
}
