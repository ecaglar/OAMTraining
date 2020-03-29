package com.zipwhip.oam.api.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String getUsers(){
        return "API Check GetUsers ";
    }
}
