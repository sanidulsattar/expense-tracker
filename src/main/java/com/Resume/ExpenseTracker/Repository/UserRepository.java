package com.Resume.ExpenseTracker.Repository;

import com.Resume.ExpenseTracker.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
