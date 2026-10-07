package com.example.aop_demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUser(int id) {
        System.out.println("Fetching user " + id);
        return "User-" + id;
    }

    public void deleteUser(int id) {
        System.out.println("Deleting user " + id);
        if (id < 0) {
            throw new IllegalArgumentException("Invalid id: " + id);
        }
    }
}
