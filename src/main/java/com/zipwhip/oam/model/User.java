package com.zipwhip.oam.model;

import java.util.Objects;

public class User {

    private String username;
    private String firstname;
    private String lastname;
    private String email;

    public User() { }

    public User(String username, String firstname, String lastname, String email) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return username.equals(user.username) && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && email.equals(user.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(username, firstname, lastname, email);
    }
}
