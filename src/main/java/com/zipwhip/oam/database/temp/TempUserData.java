package com.zipwhip.oam.database.temp;

import java.util.HashMap;

public class TempUserData {
    private HashMap<Integer, HashMap<String, String>> users = new HashMap<Integer, HashMap<String, String>>();
    private HashMap<Integer, HashMap<String, String>> messages = new HashMap<Integer, HashMap<String, String>>();

    public HashMap<Integer, HashMap<String, String>> getTestUsers() {
        createTestUsers();
        return users;
    }

    public HashMap<Integer, HashMap<String, String>> getTestMessages() {
        createTestMessages();
        return messages;
    }

    public void setTestUsers(HashMap<Integer, HashMap<String, String>> users) {
        this.users = users;
    }

    public void setTestMessages(HashMap<Integer, HashMap<String, String>> messages) {
        this.messages = messages;
    }

    public void addUser(HashMap<String, String> userPassed) {
        int counter = 0;
        while(this.users.containsKey(counter)) {
            counter++;
        }
        users.put(counter, userPassed);
    }

    public void addMessage(HashMap<String, String> messagePassed) {
        int counter = 0;
        while(this.messages.containsKey(counter)) {
            counter++;
        }
        messages.put(counter, messagePassed);
    }

    /**
     * keep in mind could be either email or username passed so we'll need to check both
     * @param userPassed
     */
    public void deleteUser(String userPassed) {
        int counter = 0;
        while(users.containsKey(counter)) {
            if(users.get(counter).get("username").toLowerCase().equals(userPassed.toLowerCase())
                || users.get(counter).get("email").toLowerCase().equals(userPassed.toLowerCase())) {
                users.remove(counter);
                //TODO come up with method to adjust and fix rest of  hashmap list
            }
        }
    }

    private void createTestUsers() {
        HashMap<String, String> tempUser = new HashMap<String, String>();
        tempUser.put("username", "DoomGuy");
        tempUser.put("email", "DoomGuy@gmail.com");
        tempUser.put("password", "abc123");
        tempUser.put("numberOfFollowers", "3");
        tempUser.put("followers", "Paradox, bob, dillan");
        tempUser.put("numberOfFollows", "0");
        tempUser.put("follows", "");

        users.put(0, tempUser);

        HashMap<String, String> tempUserTwo = new HashMap<String, String>();
        tempUserTwo.put("username", "Paradox");
        tempUserTwo.put("email", "Paradox@gmail.com");
        tempUserTwo.put("password", "1111");
        tempUserTwo.put("numberOfFollowers", "0");
        tempUserTwo.put("followers", "");
        tempUserTwo.put("numberOfFollows", "1");
        tempUserTwo.put("follows", "DoomGuy");

        users.put(1, tempUserTwo);
    }

    private void createTestMessages() {
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
