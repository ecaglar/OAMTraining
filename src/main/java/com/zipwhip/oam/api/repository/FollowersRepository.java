package com.zipwhip.oam.api.repository;

import com.zipwhip.oam.api.helpers.StringConverter;
import com.zipwhip.oam.database.temp.TempUserData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Repository
public class FollowersRepository {
    TempUserData tempUserData = new TempUserData();
    StringConverter stringConverter = new StringConverter();

    /**
     * Following method "getFollowers" does the following behavior
     * Gets User data matching the user specified in passed param
     * While loop always assumes we have at least 1 user in the system. By Design
     * Loop checks if the number of followers is "" < Means none or null value if so kills loop
     * Otherwise we double check the number to make sure it isn't 0 and then split on ", " which we pass to  list
     * @param user
     * @return followers <- List<String>
     */
    public List<String> getFollowers(final String user){
        HashMap<Integer, HashMap<String, Object>> allUsers = tempUserData.getTestUsers();
        List<String> followers = new ArrayList<>();

        int counter = 0;
        while(allUsers.containsKey(counter)) {
            if(allUsers.get(counter).get("username").toString().toLowerCase().equals(user.toLowerCase())) {
                System.out.println("user data: " + allUsers.get(counter));
                if(allUsers.get(counter).get("numberOfFollowers") == null || allUsers.get(counter).get("numberOfFollowers").equals("")) {
                    followers.add("");
                    break;
                }
                int followersCount = Integer.parseInt(allUsers.get(counter).get("numberOfFollowers").toString());
                if(followersCount > 0) {
                    followers = Arrays.asList(allUsers.get(counter).get("followers").toString().split(", "));
                }
                else {
                    followers.add("");
                }
            }

            counter++;
        }
        return followers;
    }

//    public String doWelcome(final String name){
//        return "Hello " + name;
//    }
//
//    public String doWelcome(final String name){
//        return "Hello " + name;
//    }
}
