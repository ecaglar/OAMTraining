package com.zipwhip.oam.api.controller;

import com.zipwhip.oam.api.service.EchoService;
import com.zipwhip.oam.api.service.FollowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FollowersController {

    @Autowired
    private FollowersService followersService;

    /**
     *
     * Get Followers
     * http://localHost:8080/ZipTwit/Followers/User
     *
     * Get Call
     * Params
     * Returns
     * {
     * followerCount: 2
     * followerList: [{“saget”, “Somebody”}]
     * }
     * Success or Failure
     */

    @GetMapping({"/ZipTwit/Followers/{user}"})
    public String getFollowers(@PathVariable("user") final String user){
        return followersService.getFollowers(user);
    }


    /**
     * Follow User
     * http://localhost:8080/ZipTwit/Stalk
     *
     * Post Call
     * Params
     * {
     * 	currentUser: “Bob”
     * 	target: “Saget”
     * }
     * Returns
     * Success
     *
     * Note if user is already following said person then backend wise nothing happens and we return success
     */

//    @GetMapping ({"/ZipTwit/Stalk"})
//    public String helloUser(@PathVariable("name") final String name){
//        return followersService.doWelcome(name);
//    }


    /**
     * UnFollow User
     * http://localhost:8080/ZipTwit/StopStalking
     *
     * Post Call
     * Params
     * {
     * 	User: “Bob”
     * 	target: “Saget”
     * }
     * Returns
     * Success
     *
     * Note if user is already not fallowing said person then backend wise nothing happens, and we return success
     */

//    @GetMapping ({"/ZipTwit/StopStalking"})
//    public String helloUser(@PathVariable("name") final String name){
//        return followersService.doWelcome(name);
//    }


}
