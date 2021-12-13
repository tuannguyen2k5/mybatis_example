package com.example.mybatis_example.controller;

import java.util.List;

import com.example.mybatis_example.service.UserService;
import com.example.mybatis_example.utils.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.selectAllUser();
    }

    @GetMapping("/detail/{id}")
    public User getUser(@PathVariable int id) {
        return userService.selectUserById(id);
    }

    @PostMapping("/add")
    private String saveData(@RequestBody User user) {
        userService.insertUser(user);
        return "inserted successful";
    }

    @PutMapping("/update")
    private String update(@RequestParam int id, @RequestBody User user) {
        userService.updateUser(user, id);
        return "updated successful";
    }

    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable int id) {
        userService.deleteUserById(id);
        return "deleted successful";
    }
}
