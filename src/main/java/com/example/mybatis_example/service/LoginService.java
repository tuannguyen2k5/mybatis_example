package com.example.mybatis_example.service;

import com.example.mybatis_example.utils.User;

public interface LoginService {

    public User fetchUserByEmailAndPassword(String email, String password);

    public User fetchUserByEmail(String email);

    public void saveUser(User user);
}
