package com.example.mybatis_example.controller;

import java.util.List;

import com.example.mybatis_example.mapper.UserMapper;
import com.example.mybatis_example.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/all")
    public List<User> getAll() {
        return userMapper.selectAllUser();
    }

    @PostMapping("/add")
    private String saveData(@RequestBody User user) {
        userMapper.insertUser(user);
        return "inserted successful";
    }

    @PutMapping("/update")
    private String update(@RequestParam int id, @RequestBody User user) {
        user.setId(id);
        userMapper.updateUser(user);
        return "updated successful";
    }

    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable int id) {
        userMapper.deleteUserById(id);
        return "deleted successful";
    }
}
