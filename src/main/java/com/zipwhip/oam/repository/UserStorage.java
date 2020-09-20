package com.zipwhip.oam.repository;

import com.zipwhip.oam.model.Follow;
import com.zipwhip.oam.model.User;
import com.zipwhip.oam.model.IUserStorage;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserStorage implements IUserStorage {

    private final static Map<Integer, User> userStore = new ConcurrentHashMap<>();
    private final static Map<Integer, Follow> followStore = new ConcurrentHashMap<>();

    @Override
    public User register(User user) {
        userStore.putIfAbsent(user.getId(), user);
        return user;
    }

    public List<User> getUserList() {
        return new ArrayList(userStore.values());
    }

    public Boolean usernameExists(final String username) {
        for (User user : userStore.values()) {
            if(user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public User loginToUser(final String username, final String password) throws Exception {
        for (User user : userStore.values()) {
            if(user.getUsername().equals(username)) {
                if(user.getPassword().equals(password)){
                    return user;
                } else {
                    throw new Exception("Username does not match password");
                }
            }
        }
        throw new Exception("Username not found");
    }

    public Follow follow(final Integer followingUserId, final Integer followedUserId) {
        Follow follow = new Follow(followStore.values().size() + 1, followedUserId, followingUserId);
        followStore.put(follow.getId(), follow);
        return follow;
    }

    public List<User> getFollowingList(final Integer followerId) throws Exception {
        List<User> followingList = new ArrayList<>();
        for (Follow follow : followStore.values()) {
            if(follow.getFollowedId().equals(followerId)){
                User followingUser = userStore.get(follow.getFollowingId());
                if(followingUser == null) {
                    throw new Exception("Error: Following user {" + follow.getFollowingId().toString() +  "} doesn't exist");
                }
                followingList.add(followingUser);
            }
        }
        return followingList;
    }
}
