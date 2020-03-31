package com.zipwhip.oam.api.repository;

import com.zipwhip.oam.database.temp.TempUserData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {
    public HashMap<Integer, HashMap<String, String>> getUsers(){
        TempUserData tempUserData = new TempUserData();
        return tempUserData.getTestUsers();
    }
}
