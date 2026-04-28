package com.hmert.finance_tracker_api.service;

import com.hmert.finance_tracker_api.entity.Transaction;
import com.hmert.finance_tracker_api.repository.TransactionRepository;
import org.springframework.stereotype.Service;

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
}