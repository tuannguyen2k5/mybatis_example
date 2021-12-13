package com.example.mybatis_example.service;

import java.util.List;

import com.example.mybatis_example.repository.UserRepository;
import com.example.mybatis_example.utils.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void insertUser(User user) {
        userRepository.insertUser(user);
    }

    public void updateUser(User newUser, int userId) {
        User user = userRepository.selectUserById(userId);
        user.setName(newUser.getName());
<<<<<<< HEAD
        user.setEmail(newUser.getEmail());
=======
>>>>>>> 274d5c950b99fce79e5478d2ad45f388d85b214c
        user.setStatus(newUser.getStatus());
        userRepository.updateUser(user);
    }

    public void deleteUserById(int userId) {
        userRepository.deleteUserById(userId);
    }

    public User selectUserById(int userId) {
        return userRepository.selectUserById(userId);
    }

    public List<User> selectAllUser() {
        return userRepository.selectAllUser();
    }
}
