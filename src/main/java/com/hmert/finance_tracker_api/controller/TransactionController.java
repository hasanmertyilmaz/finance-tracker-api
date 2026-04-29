package com.hmert.finance_tracker_api.controller;

import com.hmert.finance_tracker_api.entity.Transaction;
import com.hmert.finance_tracker_api.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public Transaction create(@Valid @RequestBody Transaction transaction) {
        return service.create(transaction);
    }

    @GetMapping
    public List<Transaction> findAll(@RequestParam(required = false) String category) {
        if (category != null) {
            return service.findByCategory(category);
        }

        return service.findAll();
    }

    @GetMapping("/balance")
    public Double getBalance() {
        return service.getBalance();
    }

    @GetMapping("/summary")
    public Map<String, Double> getSummary() {
        return service.getSummary();
    }
}