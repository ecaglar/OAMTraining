package com.zipwhip.oam.api.repository;

import org.springframework.stereotype.Repository;

@Repository
public class FollowersRepository {
    public String getFollowers(final String user){
        return "API Check getFollowers " + user;
    }

//    public String doWelcome(final String name){
//        return "Hello " + name;
//    }
//
//    public String doWelcome(final String name){
//        return "Hello " + name;
//    }
}
