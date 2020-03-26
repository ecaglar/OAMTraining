package com.zipwhip.oam.service;

import com.zipwhip.oam.repository.EchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EchoService {

    @Autowired
    private EchoRepository echoRepository;

    public String doWelcome(final String name){
        return echoRepository.doWelcome(name) + ". Welcome to OAM training";
    }


}
