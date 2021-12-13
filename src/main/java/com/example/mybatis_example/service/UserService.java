package com.example.mybatis_example.service;

import java.util.List;

import com.example.mybatis_example.utils.User;

public interface UserService {
    public void insertUser(User user);

    public void updateUser(User user, int userId);

    public void deleteUserById(int userId);

    public User selectUserById(int userId);

    public List<User> selectAllUser();
}
