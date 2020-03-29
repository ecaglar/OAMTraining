package com.zipwhip.oam.api.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CurrentFeedRepository {

    public String getCurrentTwitfeed(final String name){
        return "API Check getCurrentTwitfeed " + name;
    }

    public String userSpecificFeed(final String name){
        return "API Check userSpecificFeed " + name;
    }
}
