package com.zipwhip.oam.api.controller;

import com.zipwhip.oam.api.paramMapping.LoginMapping;
import com.zipwhip.oam.api.paramMapping.UserMapping;
import com.zipwhip.oam.api.service.EchoService;
import com.zipwhip.oam.api.service.UserService;
import com.zipwhip.oam.database.temp.TempUserData;
import com.zipwhip.oam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@RequestMapping("/api/users")
@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    private final TempUserData tempUserData = new TempUserData();


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

    @PostMapping({"/ZipTwit/Users"})
    public Boolean newUsers(@RequestBody UserMapping userDetails) {
        int originalUserCount = tempUserData.getTestUsers().size();
        System.out.println("User created");
        System.out.println("username: " + userDetails.getUsername());
        System.out.println("email: " + userDetails.getEmail());
        System.out.println("password: " + userDetails.getPassword());
        System.out.println("numberOfFollowers: " + userDetails.getNumberOfFollowers());
        System.out.println("followers: " + userDetails.getFollowers());
        System.out.println("numberOfFollows: " + userDetails.getNumberOfFollows());
        System.out.println("follows: " + userDetails.getFollows());

        HashMap<String, Object> userHashMap = new HashMap<String, Object>();
        userHashMap.put("username", userDetails.getUsername());
        userHashMap.put("email", userDetails.getEmail());
        userHashMap.put("password", userDetails.getPassword());
        userHashMap.put("numberOfFollowers", userDetails.getNumberOfFollowers());
        userHashMap.put("followers", userDetails.getFollowers());
        userHashMap.put("numberOfFollows", userDetails.getNumberOfFollows());
        userHashMap.put("follows", userDetails.getFollows());

        System.out.println("user Map: " + userHashMap);

        userService.createUsers(userHashMap);

        int newUserCount = tempUserData.getTestUsers().size();

        if(newUserCount > originalUserCount){
            return true;
        }
        else {
            return false;
        }
    }

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

    @PostMapping({"/ZipTwit/Login"})
    public Boolean loginUser(@RequestBody LoginMapping loginMapping) {
        System.out.println("username: " + loginMapping.getUsername());
        System.out.println("email: " + loginMapping.getEmail());
        System.out.println("password: " + loginMapping.getPassword());

        HashMap<String, Object> userHashMap = new HashMap<String, Object>();
        userHashMap.put("username", loginMapping.getUsername());
        userHashMap.put("email", loginMapping.getEmail());
        userHashMap.put("password", loginMapping.getPassword());

        return userService.loginUser(userHashMap);
    }


}
