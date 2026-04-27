package com.hmert.finance_tracker_api.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private Double amount;
    private String category;
    private String description;
    private LocalDate date;

    public Transaction() {}
    
    public Long getId() { return id; }
    public String getType() { return type; }
    public Double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }

    public void setId(Long id) { this.id = id; }
    public void setType(String type) { this.type = type; }
    public void setAmount(Double amount) { this.amount = amount; }
    public void setCategory(String category) { this.category = category; }
    public void setDescription(String description) { this.description = description; }
    public void setDate(LocalDate date) { this.date = date; }
}