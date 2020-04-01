package com.zipwhip.oam.api.repository;

import com.zipwhip.oam.database.temp.TempUserData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class CurrentFeedRepository {

    public HashMap<Integer, HashMap<String, String>> getCurrentTwitfeed(){
        TempUserData tempUserData = new TempUserData();
        return tempUserData.getTestMessages();
    }

    /**
     * The method below "userSpecificFeed" does the following
     * We get all messages then compare their username against the name param passed
     * If we get a match we add that user's message data to our hashmap to be returned
     * @param name
     * @return specificUsers <- Hashmap<integer, hashmap<string, string>>
     */
    public HashMap<Integer, HashMap<String, String>> userSpecificFeed(final String name){
        TempUserData tempUserData = new TempUserData();
        HashMap<Integer, HashMap<String, String>> specificUsers = new HashMap<Integer, HashMap<String, String>>();
        HashMap<Integer, HashMap<String, String>> allUsers = tempUserData.getTestMessages();

        int counter = 0;
        int keyCounter = 0;
        while(allUsers.containsKey(counter)) {
            if(allUsers.get(counter).get("username").toLowerCase().equals(name.toLowerCase())) {
                specificUsers.put(keyCounter, allUsers.get(counter));
            }
            counter++;
            keyCounter++;
        }

        return specificUsers;
    }
}
