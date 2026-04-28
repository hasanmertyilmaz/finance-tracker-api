package com.hmert.finance_tracker_api.service;

import com.hmert.finance_tracker_api.entity.Transaction;
import com.hmert.finance_tracker_api.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Transaction create(Transaction transaction) {
        return repository.save(transaction);
    }

    // GET ALL
    public List<Transaction> findAll() {
        return repository.findAll();
    }
    public List<Transaction> findByCategory(String category) {
    return repository.findByCategoryIgnoreCase(category);
}

    // BALANCE
public Double getBalance() {
    List<Transaction> transactions = repository.findAll();

    double balance = 0;

    for (Transaction t : transactions) {
        if ("INCOME".equalsIgnoreCase(t.getType())) {
            balance += t.getAmount();
        } else if ("EXPENSE".equalsIgnoreCase(t.getType())) {
            balance -= t.getAmount();
        }
    }

    return balance;
}

public Map<String, Double> getSummary() {
    List<Transaction> transactions = repository.findAll();

    double income = 0;
    double expense = 0;

    for (Transaction t : transactions) {
        if ("INCOME".equalsIgnoreCase(t.getType())) {
            income += t.getAmount();
        } else if ("EXPENSE".equalsIgnoreCase(t.getType())) {
            expense += t.getAmount();
        }
    }

    Map<String, Double> summary = new HashMap<>();
    summary.put("income", income);
    summary.put("expense", expense);

    return summary;
}
}