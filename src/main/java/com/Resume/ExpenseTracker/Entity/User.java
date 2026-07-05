package com.Resume.ExpenseTracker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private UUID id;
    private String userName;
    private String password;
    private String currency;
   // private LocalDateTime createdAt;
    private String enabled;

}
