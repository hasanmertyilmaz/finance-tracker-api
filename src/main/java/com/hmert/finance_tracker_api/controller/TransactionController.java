package com.hmert.finance_tracker_api.controller;

import com.hmert.finance_tracker_api.entity.Transaction;
import com.hmert.finance_tracker_api.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return service.create(transaction);
    }

    @GetMapping
    public List<Transaction> findAll() {
        return service.findAll();
    }
}