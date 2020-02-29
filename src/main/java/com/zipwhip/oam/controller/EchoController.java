package com.zipwhip.oam.controller;

import com.zipwhip.oam.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @GetMapping ({"/welcome/{name}"})
    public String helloUser(@PathVariable("name") final String name){
        return echoService.doWelcome(name);
    }
}
