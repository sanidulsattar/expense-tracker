package com.Resume.ExpenseTracker.Entity;

import lombok.Data;

import java.time.Month;
import java.time.Year;

@Data
public class Budget {
    private String id;
    private int amount;
    private Month month;
    private Year year;
}
