package com.zipwhip.oam.config;

import com.zipwhip.oam.model.IUserStorage;
import com.zipwhip.oam.repository.UserStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public IUserStorage getStorage(){
        return new UserStorage();
    }

}
