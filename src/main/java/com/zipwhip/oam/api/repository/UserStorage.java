package com.zipwhip.oam.api.repository;

import com.zipwhip.oam.model.User;
import com.zipwhip.oam.model.IUserStorage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserStorage implements IUserStorage {

    private final Map<String, User> userStore = new ConcurrentHashMap<>();

    @Override
    public User register(User user) {
        userStore.putIfAbsent(user.getUsername(),user);
        return user;

    }
}
