package com.zipwhip.oam.api.service;

import com.zipwhip.oam.api.repository.UserRepository;
import com.zipwhip.oam.model.IUserStorage;
import com.zipwhip.oam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {

    private final IUserStorage userStorage;
    @Autowired
    private UserRepository userRepository;

    public UserService(final IUserStorage userStorage){
        this.userStorage = userStorage;
    }

    public User registerUser(final User user){
        return userStorage.register(user);
    }



    public String getUsers(){
        return userRepository.getUsers() + "";
    }

    public String createUsers(HashMap<String, Object> newUserData){
        return userRepository.createUsers(newUserData) + "";
    }

    public Boolean loginUser(HashMap<String, Object> userData){
        return userRepository.loginUser(userData);
    }
}
