package com.zipwhip.oam.model;

public class FollowCredentials {
    private final Integer followingUserId;
    private final Integer followedUserId;

    public FollowCredentials (final Integer followingUserId, final Integer followedUserId){
        this.followingUserId = followingUserId;
        this.followedUserId = followedUserId;
    }

    public Integer getFollowingUserId() {
        return followingUserId;
    }

    public Integer getFollowedUserId() {
        return followedUserId;
    }
}
