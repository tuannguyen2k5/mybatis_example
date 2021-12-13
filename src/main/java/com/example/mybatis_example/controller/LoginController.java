package com.example.mybatis_example.controller;

import com.example.mybatis_example.service.LoginService;
import com.example.mybatis_example.utils.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public User loginByEmailAndPassword(@RequestBody User user) throws Exception {
        String tempEmail = user.getEmail();
        String tempPassword = user.getPassword();

        User userObj = null;
        if (tempEmail != null && tempPassword != null) {
            userObj = loginService.fetchUserByEmailAndPassword(tempEmail, tempPassword);
        }
        if (userObj == null) {
            throw new Exception("Login failed");
        }
        return userObj;
    }

    @PostMapping("/signup")
    public String signupByEmailAndPassword(@RequestBody User user) throws Exception {
        String tempEmail = user.getEmail();

        User userObj = null;
        if (tempEmail != null) {
            userObj = loginService.fetchUserByEmail(tempEmail);
            if (userObj != null) {
                throw new Exception("email is already existed");
            } else {
                loginService.saveUser(user);
            }
        }
        return "sign up success";

    }

}
