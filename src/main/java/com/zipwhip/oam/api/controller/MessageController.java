package com.zipwhip.oam.api.controller;

import com.zipwhip.oam.api.service.EchoService;
import com.zipwhip.oam.api.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     *
     * Send Message
     * http://localHost:8080/ZipTwit/SendMessage
     *
     * Post Call
     * Params
     * {
     * 	User: “Doom Guy”
     * 	message: “Metal music begins!”
     * 	timestamp: “03/22/2020 15:30:129”
     * }
     * Returns
     * Success or Failure
     */

//    @GetMapping({"/ZipTwit/SendMessage"})
//    public String helloUser(){
//        return messageService.sendMessage();
//    }


}
