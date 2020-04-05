package com.zipwhip.oam.model;

import java.time.LocalDateTime;

public class Tweet {
    private final Integer id;
    private final Integer userId;
    private String body;
    private final LocalDateTime dateCreated;
    private LocalDateTime dateDeleted;

    public Tweet(final Integer id, final Integer userId, final String body) {
        this.id = id;
        this.userId = userId;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
        this.dateDeleted = null;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
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
}
