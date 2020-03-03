package com.zmd.jcartstoreback.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 14:44
 */
@Configuration
public class BeanConfig {

    @Bean
    public SecureRandom secureRandom(){
        return new SecureRandom();
    }

}
