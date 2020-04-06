package com.zipwhip.oam.model;

import java.util.List;

public interface IUserStorage {
    User register(final User user);
    Boolean usernameExists(final String username);
    User loginToUser(final String username, final String password) throws Exception;
    List<User> getUserList();
    Follow follow(final Integer followingUserId, final Integer followedUserId);
    List<User> getFollowingList(final Integer followerId) throws Exception;
}
