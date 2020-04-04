package com.zipwhip.oam.api.paramMapping;

public class LoginMapping {
    /**
     *          tempUser.put("username", "DoomGuy");
     *         tempUser.put("email", "DoomGuy@gmail.com");
     *         tempUser.put("password", "abc123");
     */
    private String username;
    private String email;
    private String password;

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
}
