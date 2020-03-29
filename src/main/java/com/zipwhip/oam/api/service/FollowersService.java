package com.zipwhip.oam.api.service;

import com.zipwhip.oam.api.repository.FollowersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowersService {

    @Autowired
    private FollowersRepository followersRepository;

    public String getFollowers(final String user) {
        return followersRepository.getFollowers(user) + ". API Verified";
    }

//    public String getFollowers(final String user){
//        return followersRepository.getFollowers(user) + ". API Verified";
//    }
//
//    public String getFollowers(final String user){
//        return followersRepository.getFollowers(user) + ". API Verified";
//    }
}
