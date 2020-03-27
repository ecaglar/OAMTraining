package com.zipwhip.oam.service;

import com.zipwhip.oam.model.IUserStorage;
import com.zipwhip.oam.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final IUserStorage userStorage;

    public UserService(final IUserStorage userStorage){
        this.userStorage = userStorage;
    }

    public User registerUser(final User user){
        return userStorage.register(user);
    }

}
