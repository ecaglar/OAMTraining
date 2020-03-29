package com.zipwhip.oam.api.controller;

import com.zipwhip.oam.api.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @GetMapping ({"/welcome/{name}"})
    public String helloUser(@PathVariable("name") final String name){
        return echoService.doWelcome(name);
    }



}
