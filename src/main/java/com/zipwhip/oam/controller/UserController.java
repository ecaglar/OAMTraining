package com.zipwhip.oam.controller;

import com.zipwhip.oam.model.Follow;
import com.zipwhip.oam.model.FollowCredentials;
import com.zipwhip.oam.model.LoginCredentials;
import com.zipwhip.oam.model.User;
import com.zipwhip.oam.model.UserCreateInput;
import com.zipwhip.oam.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping({"/login"})
    public User loginUser(@RequestBody final LoginCredentials loginCredentials) throws Exception {
        return userService.loginUser(loginCredentials.getUsername(), loginCredentials.getPassword());
    }

    @GetMapping({"/list"})
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @GetMapping({"/following"})
    public List<User> getFollowingList(@RequestParam final Integer followerId) throws Exception {
        return userService.getFollowingList(followerId);
    }

    @PostMapping({"/register"})
    public User registerUser(@RequestBody final UserCreateInput userCreateInput) throws Exception {
        return userService.registerUser(userCreateInput.getUsername(), userCreateInput.getPassword(), userCreateInput.getFirstName(), userCreateInput.getLastName(), userCreateInput.getEmail());
    }

    @PostMapping({"/follow"})
    public Follow followUser(@RequestBody final FollowCredentials followCredentials){
        return userService.followUser(followCredentials.getFollowingUserId(), followCredentials.getFollowedUserId());
    }

    @PostMapping({"/unfollow"})
    public void unfollowUser(@RequestBody final Integer followingUserId, final Integer followedUserId){
        userService.unfollowUser();
    }
}
