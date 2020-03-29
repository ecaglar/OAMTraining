package com.zipwhip.oam.api.service;

import com.zipwhip.oam.api.repository.EchoRepository;
import com.zipwhip.oam.api.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public String sendMessage(){
        return messageRepository.sendMessage() + ". api check";
    }
}
