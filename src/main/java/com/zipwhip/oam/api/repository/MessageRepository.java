package com.zipwhip.oam.api.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    public String sendMessage(){
        return "API Check SendMessage ";
    }
}
