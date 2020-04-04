package com.zipwhip.oam.api.paramMapping;

import java.util.List;

public class UserMapping {
    /**
     *    tempUser.put("username", "DoomGuy");
     *         tempUser.put("email", "DoomGuy@gmail.com");
     *         tempUser.put("password", "abc123");
     *         tempUser.put("numberOfFollowers", "3");
     *         tempUser.put("followers", "Paradox, bob, dillan");
     *         tempUser.put("numberOfFollows", "0");
     *         tempUser.put("follows", "");
     */
    private String username;
    private String email;
    private String password;
    private int numberOfFollowers;
    private String[] followers;
    private int numberOfFollows;
    private String[] follows;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }
    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public String[] getFollowers() {
        return followers;
    }
    public void setFollowers(String[] followers) {
        this.followers = followers;
    }

    public int getNumberOfFollows() {
        return numberOfFollows;
    }
    public void setNumberOfFollows(int numberOfFollows) {
        this.numberOfFollows = numberOfFollows;
    }

    public String[] getFollows() {
        return follows;
    }
    public void setFollows(String[] follows) {
        this.follows = follows;
    }
}
