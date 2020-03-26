package com.zipwhip.oam.controller;

import com.zipwhip.oam.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;


@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @GetMapping ({"/welcome/{name}"})
    public String helloUser(@PathVariable("name") final String name){
        return echoService.doWelcome(name);
    }



}
