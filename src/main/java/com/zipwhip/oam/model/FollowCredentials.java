package com.zipwhip.oam.model;

public class FollowCredentials {
    private final Integer followerUserId;
    private final Integer followedUserId;

    public FollowCredentials (final Integer followerUserId, final Integer followedUserId){
        this.followerUserId = followerUserId;
        this.followedUserId = followedUserId;
    }

    public Integer getFollowerUserId() {
        return followerUserId;
    }

    public Integer getFollowedUserId() {
        return followedUserId;
    }
}
