package com.zipwhip.oam.api.repository;

import com.zipwhip.oam.database.temp.TempUserData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {

    /**
     * the method below "getUsers"
     * This method simply gets all users data and passes it along
     * @return tempUserData.getTestUsers <- HashMap<Integer, HashMap<String, String>
     */
    public HashMap<Integer, HashMap<String, String>> getUsers(){
        TempUserData tempUserData = new TempUserData();
        return tempUserData.getTestUsers();
    }
}
