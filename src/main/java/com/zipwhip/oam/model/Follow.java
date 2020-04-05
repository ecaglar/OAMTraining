package com.zipwhip.oam.model;

import java.time.LocalDateTime;

public class Follow {
    private final Integer id;
    private final Integer followerId;
    private final Integer followingId;
    private final LocalDateTime dateCreated;
    private LocalDateTime dateDeleted;

    public Follow (final Integer id, final Integer followerId, final Integer followingId) {
        this.id = id;
        this.followerId = followerId;
        this.followingId = followingId;
        this.dateCreated = LocalDateTime.now();
        this.dateDeleted = null;
    }

    public Integer getId() {
        return id;
    }

    public Integer getFollowerId() {
        return followerId;
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
