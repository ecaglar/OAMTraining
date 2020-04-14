package com.zipwhip.oam.service;

import com.zipwhip.oam.model.Follow;
import com.zipwhip.oam.model.IUserStorage;
import com.zipwhip.oam.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final IUserStorage userStorage;

    public UserService(final IUserStorage userStorage){
        this.userStorage = userStorage;
    }

    public User loginUser(final String username, final String password) throws Exception {
        return userStorage.loginToUser(username, password);
    }

    public void logoutUser() {
    }

    public List<User> getUserList(){
        return userStorage.getUserList();
    }

    public List<User> getFollowingList(final Integer followerId) throws Exception {
        return userStorage.getFollowingList(followerId);
    }

    public User registerUser(final String username, final String password, final String firstName, final String lastName, final String email) throws Exception {
        if(userStorage.usernameExists(username)){
            throw new Exception("ERROR: Username already exists");
        }

        User user = new User(userStorage.getUserList().size() + 1, username, password, firstName, lastName, email);
        return userStorage.register(user);
    }

    public Follow followUser(final Integer followingUserId, final Integer followedUserId){
        return userStorage.follow(followingUserId, followedUserId);
    }

    public void unfollowUser(){
    }

}
