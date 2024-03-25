package com.example.expense.tracker.controller;

import com.example.expense.tracker.Service.ExpenseService;
import com.example.expense.tracker.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    // Authentication API
    @PostMapping("/auth/signup")
    public ResponseEntity<?> signUpUser(@RequestBody SignUpRequest signUpRequest) {
        // Check if the provided username already exists
        if (expenseService.usernameExists(signUpRequest.getUsername())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists");
        }

        // Check if the provided email already exists
        if (expenseService.emailExists(signUpRequest.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already exists");
        }

        // Create a new user
        User newUser = new User();
        newUser.setUsername(signUpRequest.getUsername());
        newUser.setPassword(signUpRequest.getPassword());
        newUser.setEmail(signUpRequest.getEmail());

        // Save the new user
        expenseService.createUser(newUser);

        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
    }

    // Transaction Management APIs
    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = expenseService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/transactions/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id) {
        Transaction transaction = expenseService.getTransactionById(id);
        if (transaction != null) {
            return ResponseEntity.ok(transaction);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/transactions")
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionRequest transactionRequest) {
        Transaction transaction = expenseService.createTransaction(transactionRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
    }

    @PutMapping("/transactions/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable Long id, @RequestBody TransactionRequest transactionRequest) {
        Transaction updatedTransaction = expenseService.updateTransaction(id, transactionRequest);
        if (updatedTransaction != null) {
            return ResponseEntity.ok(updatedTransaction);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/transactions/{id}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long id) {
        boolean deleted = expenseService.deleteTransaction(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Category Management APIs
    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = expenseService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        Category category = (Category) expenseService.getCategoryById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/categories")
    public ResponseEntity<Category> createCategory(@RequestBody CategoryRequest categoryRequest) {
        Category category = (Category) expenseService.createCategory(categoryRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody CategoryRequest categoryRequest) {
        Category updatedCategory = (Category) expenseService.updateCategory(id, categoryRequest);
        if (updatedCategory != null) {
            return ResponseEntity.ok(updatedCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
        boolean deleted = expenseService.deleteCategory(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Expense Sum by Category API
    @GetMapping("/expense-summary")
    public ResponseEntity<Map<String, Double>> getExpenseSummaryByCategory() {
        Map<String, Double> expenseSummary = expenseService.getExpenseSummaryByCategory();
        return ResponseEntity.ok(expenseSummary);
    }

    // Graphical Report APIs
    @GetMapping("/reports/last-month")
    public ResponseEntity<GraphicalReport> generateLastMonthReport() {
        GraphicalReport report = expenseService.generateLastMonthReport();
        return ResponseEntity.ok(report);
    }

    @GetMapping("/reports/last-year")
    public ResponseEntity<GraphicalReport> generateLastYearReport() {
        GraphicalReport report = expenseService.generateLastYearReport();
        return ResponseEntity.ok(report);
    }

    // Transaction History API
    @GetMapping("/transaction-history")
    public ResponseEntity<List<TransactionHistory>> getTransactionHistory() {
        List<TransactionHistory> transactionHistory = expenseService.getTransactionHistory();
        return ResponseEntity.ok(transactionHistory);
    }
}


