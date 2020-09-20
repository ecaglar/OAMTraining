package com.zipwhip.oam.model;

import java.time.LocalDateTime;

public class User {
    private final Integer id;
    private String username;
    private String password;
    private String firstname;

    private String lastname;
    private String email;
    private final LocalDateTime dateCreated;
    private LocalDateTime dateDeleted;

    public User(final Integer id, final String username, final String password, final String firstname, final String lastname, final String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.dateCreated = LocalDateTime.now();
        this.dateDeleted = null;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(final LocalDateTime dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
