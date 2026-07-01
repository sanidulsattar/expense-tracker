package com.Resume.ExpenseTracker.Services;

import com.Resume.ExpenseTracker.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>(List.of(
            new User("001","Test1", "pass1"),
            new User("002","Test2", "pass2")
    ));

    public List<User>  getAllUser() {
        return userList;
    }
}
