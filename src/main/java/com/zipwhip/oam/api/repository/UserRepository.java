package com.zipwhip.oam.api.repository;

import com.zipwhip.oam.database.temp.TempUserData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {
    private TempUserData tempUserData = new TempUserData();

    /**
     * the method below "getUsers"
     * This method simply gets all users data and passes it along
     * @return tempUserData.getTestUsers <- HashMap<Integer, HashMap<String, String>
     */
    public HashMap<Integer, HashMap<String, Object>> getUsers(){
        return tempUserData.getTestUsers();
    }

    /**
     * the method below "createUsers"
     * This method simply gets all users data and passes it along
     * @return tempUserData.getTestUsers <- HashMap<Integer, HashMap<String, String>
     */
    public HashMap<Integer, HashMap<String, Object>> createUsers(HashMap<String, Object> newUserData){
        tempUserData.setTestUsers(newUserData);
        return tempUserData.getTestUsers();
    }

    /**
     * the method below "loginUser"
     * This method does a comparison between the user data we have and the user data that was passed to
     * if it gets a hit on either username or email then it runs a comparison on password.
     * if that matches positively then we return true otherwise return false
     * @return true or false
     */
    public Boolean loginUser(HashMap<String, Object> userData){
        HashMap<Integer, HashMap<String, Object>> allUserData = tempUserData.getTestUsers();

        int counter = 0;
        while(allUserData.containsKey(counter)) {
            if(allUserData.get(counter).get("username").equals(userData.get("username")) ||
                    allUserData.get(counter).get("email").equals(userData.get("email"))){
                if(allUserData.get(counter).get("password").equals(userData.get("password"))) {
                    return true;
                }
                else {
                    return false;
                }
            }
            counter++;
        }
        return false;
    }
}
