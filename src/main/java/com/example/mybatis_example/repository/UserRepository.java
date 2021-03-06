package com.example.mybatis_example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.mybatis_example.mapper.UserMapper;
import com.example.mybatis_example.utils.User;

@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUserById(int userId) {
        userMapper.deleteUserById(userId);
    }

    public User selectUserById(int userId) {
        return userMapper.selectUserById(userId);
    }

    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
<<<<<<< HEAD

    public User selectUserByEmailAndPassword(String email, String password) {
        return userMapper.selectUserByEmailAndPassword(email, password);
    }

    public User selectUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }
=======
>>>>>>> 274d5c950b99fce79e5478d2ad45f388d85b214c
}
