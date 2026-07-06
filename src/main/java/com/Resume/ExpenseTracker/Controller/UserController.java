package com.Resume.ExpenseTracker.Controller;

import com.Resume.ExpenseTracker.Entity.User;
import com.Resume.ExpenseTracker.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
       return userService.getAllUser();
    }

    @PostMapping("/create")
    public void crateUser(@RequestBody User user){
        userService.createUser(user);
    }
}
