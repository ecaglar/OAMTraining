package com.zipwhip.oam.model;

import java.time.LocalDateTime;

public class Follow {
    private final Integer id;
    private final Integer followedId;
    private final Integer followingId;
    private final LocalDateTime dateCreated;
    private LocalDateTime dateDeleted;

    public Follow (final Integer id, final Integer followedId, final Integer followingId) {
        this.id = id;
        this.followedId = followedId;
        this.followingId = followingId;
        this.dateCreated = LocalDateTime.now();
        this.dateDeleted = null;
    }

    public Integer getId() {
        return id;
    }

    public Integer getFollowedId() {
        return followedId;
    }

    public Integer getFollowingId() {
        return followingId;
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
