package com.example.spring_boot.service;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    List<User> findAll();
    User getUserById(Long id);
}
