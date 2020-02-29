package com.zipwhip.oam.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EchoRepository {

    public String doWelcome(final String name){
        return "Hello " + name;
    }

}
