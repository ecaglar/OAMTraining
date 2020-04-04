package com.zipwhip.oam.database.temp;

import java.util.HashMap;

public class TempUserData {
    private static HashMap<Integer, HashMap<String, Object>> users = new HashMap<Integer, HashMap<String, Object>>();
    private static HashMap<Integer, HashMap<String, String>> messages = new HashMap<Integer, HashMap<String, String>>();

    public HashMap<Integer, HashMap<String, Object>> getTestUsers() {
        return this.users;
    }

    public HashMap<Integer, HashMap<String, String>> getTestMessages() {
        return messages;
    }

    public void setTestUsers(HashMap<String, Object> newUserData) {
        boolean match = false;
        int counter = 0;
        while(this.messages.containsKey(counter)) {
            if(users.get(counter).get("username").equals(newUserData.get("username")) ||
                    users.get(counter).get("email").equals(newUserData.get("email"))){
                match = true;
                break;
            }
            counter++;
        }
        if(match == false){
            this.users.put(counter, newUserData);
        }
        else {
            //do nothing
        }
    }

    public void setTestMessages(HashMap<String, String> newMessage) {
        int counter = 0;
        while(this.messages.containsKey(counter)) {
            counter++;
        }
        this.messages.put(counter, newMessage);
    }

    /**
     * keep in mind could be either email or username passed so we'll need to check both
     * @param userPassed
     */
    public void deleteUser(String userPassed) {
        int counter = 0;
        while(users.containsKey(counter)) {
            if(users.get(counter).get("username").toString().toLowerCase().equals(userPassed.toLowerCase())
                || users.get(counter).get("email").toString().toLowerCase().equals(userPassed.toLowerCase())) {
                users.remove(counter);
                //TODO come up with method to adjust and fix rest of  hashmap list
            }
        }
    }

    public void createTestUsers() {
        System.out.println("Create test users");
        HashMap<String, Object> tempUser = new HashMap<String, Object>();
        String[] tempFollowers = {"Paradox", "bob", "dillan"};
        String[] tempFollows = {""};
        tempUser.put("username", "DoomGuy");
        tempUser.put("email", "DoomGuy@gmail.com");
        tempUser.put("password", "abc123");
        tempUser.put("numberOfFollowers", 3);
        tempUser.put("followers", tempFollowers);
        tempUser.put("numberOfFollows", 0);
        tempUser.put("follows", tempFollows);

        this.users.put(0, tempUser);

        String[] tempFollowers2 = {""};
        String[] tempFollows2 = {"DoomGuy"};
        HashMap<String, Object> tempUserTwo = new HashMap<String, Object>();
        tempUserTwo.put("username", "Paradox");
        tempUserTwo.put("email", "Paradox@gmail.com");
        tempUserTwo.put("password", "1111");
        tempUserTwo.put("numberOfFollowers", 0);
        tempUserTwo.put("followers", tempFollowers2);
        tempUserTwo.put("numberOfFollows", 1);
        tempUserTwo.put("follows", tempFollows2);

        this.users.put(1, tempUserTwo);

        System.out.println("users created: " + users);
    }

    public void createTestMessages() {
        System.out.println("Create test messages");
        HashMap<String, String> tempDate = new HashMap<String, String>();
        tempDate.put("username", "DoomGuy");
        tempDate.put("messageContents", "Rip and Tear! Message 1");
        tempDate.put("date", "2020-03-31T00:55:22.819361");

        messages.put(0, tempDate);

        HashMap<String, String> tempDateTwo = new HashMap<String, String>();
        tempDateTwo.put("username", "Paradox");
        tempDateTwo.put("messageContents", "What's up gents! Message 2");
        tempDateTwo.put("date", "2020-03-30T00:55:22.819361");

        messages.put(1, tempDateTwo);

        HashMap<String, String> tempDateThree = new HashMap<String, String>();
        tempDateThree.put("username", "DoomGuy");
        tempDateThree.put("messageContents", "slaying and playin. Message 3");
        tempDateThree.put("date", "2020-03-26T00:55:22.819361");

        messages.put(2, tempDateThree);

        HashMap<String, String> tempDateFour = new HashMap<String, String>();
        tempDateFour.put("username", "DoomGuy");
        tempDateFour.put("messageContents", "Woop woop Message 4");
        tempDateFour.put("date", "2020-03-25T00:55:22.819361");

        messages.put(3, tempDateFour);

        HashMap<String, String> tempDateFive = new HashMap<String, String>();
        tempDateFive.put("username", "Paradox");
        tempDateFive.put("messageContents", "Stellaris? Or hearts? Message 5");
        tempDateFive.put("date", "2020-03-25T00:44:22.819361");

        messages.put(4, tempDateFive);
    }
}
