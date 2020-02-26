package com.zmd.jcartadministrationback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("/com.zmd.jcartadministrationback.dao")
public class JcartAdministarationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcartAdministarationBackApplication.class, args);
    }

}
