package com.example.social;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.social.model.dao")
public class SocialServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialServerApplication.class, args);
    }

}
