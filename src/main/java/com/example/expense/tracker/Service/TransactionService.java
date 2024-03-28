package com.example.expense.tracker.Service;

import com.example.expense.tracker.Repository.TransactionRepository;
import com.example.expense.tracker.model.Transaction;
import com.example.expense.tracker.model.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(String id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public Transaction createTransaction(TransactionRequest transactionRequest) {
        Transaction transaction = new Transaction();
        transaction.setDescription(transactionRequest.getDescription());
        transaction.setAmount(transactionRequest.getAmount());
        transaction.setCategory(transactionRequest.getCategory());
        transaction.setType(transactionRequest.getType());
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(String id, TransactionRequest transactionRequest) {
        Transaction existingTransaction = transactionRepository.findById(id).orElse(null);
        if (existingTransaction != null) {
            existingTransaction.setDescription(transactionRequest.getDescription());
            existingTransaction.setAmount(transactionRequest.getAmount());
            existingTransaction.setCategory(transactionRequest.getCategory());
            existingTransaction.setType(transactionRequest.getType());
            return transactionRepository.save(existingTransaction);
        }
        return null;
    }

    public boolean deleteTransaction(String id) {
        if (transactionRepository.existsById(id)) {
            transactionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
