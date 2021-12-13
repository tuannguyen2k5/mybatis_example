package com.example.mybatis_example.service;

import com.example.mybatis_example.repository.UserRepository;
import com.example.mybatis_example.utils.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserRepository userRepository;

    public User fetchUserByEmailAndPassword(String email, String password) {
        return userRepository.selectUserByEmailAndPassword(email, password);
    }

    public User fetchUserByEmail(String email) {
        return userRepository.selectUserByEmail(email);
    }

    public void saveUser(User user) {
        userRepository.insertUser(user);
    }
}
