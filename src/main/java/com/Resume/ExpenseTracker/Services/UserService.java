package com.Resume.ExpenseTracker.Services;

import com.Resume.ExpenseTracker.Entity.User;
import com.Resume.ExpenseTracker.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
//    private List<User> userList = new ArrayList<>(List.of(
//            new User("001","Test1", "pass1","inr","Active"),
//            new User("002","Test2", "pass2", "usd","hold")
//    ));
    @Autowired
    private UserRepository userRepository;

    public List<User>  getAllUser() {
        return userRepository.findAll();
    }
}
