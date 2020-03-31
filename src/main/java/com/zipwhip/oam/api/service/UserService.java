package com.zipwhip.oam.api.service;

import com.zipwhip.oam.api.repository.UserRepository;
import com.zipwhip.oam.model.IUserStorage;
import com.zipwhip.oam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
