package com.zipwhip.oam.model;

public class LoginCredentials {
    private String username;
    private String password;

    public LoginCredentials(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
