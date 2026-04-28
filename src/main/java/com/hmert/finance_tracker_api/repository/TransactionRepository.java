package com.hmert.finance_tracker_api.repository;

import java.util.List;
import com.hmert.finance_tracker_api.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCategoryIgnoreCase(String category);
}