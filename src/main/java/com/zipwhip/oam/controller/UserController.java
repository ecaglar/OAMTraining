package com.zipwhip.oam.controller;

import com.zipwhip.oam.model.User;
import com.zipwhip.oam.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }
    @PostMapping({"/register"})
    public User registerUser(@RequestBody final User user){
        return userService.registerUser(user);
    }
}
