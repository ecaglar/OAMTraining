package com.zipwhip.oam.api.controller;

import com.zipwhip.oam.api.service.CurrentFeedService;
import com.zipwhip.oam.api.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentFeedController {

    @Autowired
    private CurrentFeedService currentFeedService;

    /**
     *
     * Get Current TwitFeed
     * http://localhost:8080/ZipTwit/TwitFeed/UserName
     *
     * Get Call
     * Params
     * Username passed at end of URL
     * Returns
     * [{
     * 	Username: “somebody”
     * 	Contents: “how’s everyone doing?”
     * 	timestamp: “03/22/2020 15:30:129”
     * }
     * {
     * 	Username: “bob”
     * 	Contents: “Doom Eternal is out!”
     * 	timestamp: “03/23/2020 12:31:798”
     * }]
     */

    @GetMapping({"/ZipTwit/TwitFeed/{userName}"})
    public String currentTwitFeed(@PathVariable("userName") final String userName){
        return currentFeedService.getCurrentTwitfeed(userName);
    }

    /**
     * Get User Specific Tweets - all tweets from 1 user
     * http://localHost:8080/ZipTwit/Tweets/User
     *
     * Get Call
     * Params
     * User passed through URL
     * Returns
     * [{
     * 	Username: “user”
     * 	Contents: “how’s everyone doing?”
     * 	timestamp: “03/22/2020 15:30:129”
     * }
     * {
     * 	Username: “user”
     * 	Contents: “Doom Eternal is out!”
     * 	timestamp: “03/23/2020 12:31:798”
     * }]
     * Success or Failure
     */

    @GetMapping({"/ZipTwit/Tweets/{user}"})
    public String userSpecificFeed(@PathVariable("user") final String user){
        return currentFeedService.userSpecificFeed(user);
    }
}
