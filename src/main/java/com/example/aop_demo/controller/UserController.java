package com.example.aop_demo.controller;

import com.example.aop_demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String get(@PathVariable int id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        userService.deleteUser(id);
        return "Deleted " + id;
    }
}
