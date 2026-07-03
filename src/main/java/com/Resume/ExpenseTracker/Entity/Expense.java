package com.Resume.ExpenseTracker.Entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Expense {
    private String id;
    private String title;
    private int amount;
    private String description;
    private LocalDateTime expenseDate;
    private String paymentMethod;

}
