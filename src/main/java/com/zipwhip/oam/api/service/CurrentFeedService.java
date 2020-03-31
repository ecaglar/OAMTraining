package com.zipwhip.oam.api.service;

import com.zipwhip.oam.api.repository.CurrentFeedRepository;
import com.zipwhip.oam.api.repository.EchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentFeedService {

    @Autowired
    private CurrentFeedRepository currentFeedRepository;

    public String getCurrentTwitfeed(final String name){
        return currentFeedRepository.getCurrentTwitfeed() + "";
    }

    public String userSpecificFeed(final String name){
        return currentFeedRepository.userSpecificFeed(name) + "";
    }
}
