package com.zipwhip.oam.api.controller;

import com.zipwhip.oam.api.service.EchoService;
import com.zipwhip.oam.api.service.UserService;
import com.zipwhip.oam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("/api/users")
@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }
    @PostMapping({"/register"})
    public User registerUser(@RequestBody final User user){
        return userService.registerUser(user);
    }
    /**
     *
     * Get Current Users
     * http://localHost:8080/ZipTwit/Users
     *
     * Get Call
     * No Params
     * Returns
     * [{
     * 	User: “bob”
     * 	Email: “bob@something.com”
     * 	numberOfMessages: 2
     * 	numberOfFollows: 0
     * 	follows: [ { } ]
     * 	numberOfFolowers: 1
     * 	follows: [ { “DoomGuy” } ]
     *
     * }
     * {
     * 	User: “Stellaris”
     * 	Email: “manlyman@corn.com
     * 	numberOfMessages: 0
     * 	numberOfFollows: 2
     * 	follows: [ {“bob”, “DoomGuy” }]
     * 	numberOfFolowers: 0
     * 	follows: [ {  } ]
     * }]
     */

    @GetMapping({"/ZipTwit/Users"})
    public String getUsers(){
        return userService.getUsers();
    }

    /**
     * Create User
     * http://localHost:8080/ZipTwit/Users/Create
     *
     * Post Call
     * [{
     * Username: “Some”
     * Email: body@once.told
     * Password: meTheWorld
     * 	numberOfMessages: 0
     * 	numberOfFollows: 0
     * 	follows: [ { } ]
     * 	numberOfFolowers: 0
     * follows: [ { } ]
     * }]
     * Returns
     * Success or Failure
     * Note: Does a comparison of email and Username to see if user exists.
     * If either get a hit then it returns a fail. If neither hit then a true
     * and a user is created. Using an array here instead of a none array
     * so API wise we could create multiple users in one shot if we wanted to.
     */

//    @GetMapping ({"/ZipTwit/Users/Create"})
//    public String helloUser(){
//        return userService.doWelcome();
//    }

    /**
     * Login
     * http://localHost:8080/ZipTwit/Login
     *
     * Post Call
     * {
     * 	usernameOrEmail: “”
     * 	password: “”
     * }
     * Returns
     * Success or Failure
     *
     * Note: will run a comparision against all users to see if any emails/usernames match “usernameOrEmail” param. Once it. Finds a hit it’ll then compare password. If no hit then returns fail
     */

//    @GetMapping ({"/ZipTwit/Login"})
//    public String helloUser(){
//        return userService.doWelcome();
//    }


}
