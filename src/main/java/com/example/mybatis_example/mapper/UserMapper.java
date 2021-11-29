package com.example.mybatis_example.mapper;

import java.util.List;

import com.example.mybatis_example.model.User;

public interface UserMapper {
    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUserById(int userId);

    public User selectUserById(int userId);

    public List<User> selectAllUser();

}
