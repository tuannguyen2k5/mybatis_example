package com.example.mybatis_example.mapper;

import java.util.List;

import com.example.mybatis_example.utils.User;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUserById(int userId);

    public User selectUserById(int userId);

    public List<User> selectAllUser();

    public User selectUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    public User selectUserByEmail(String email);
}
