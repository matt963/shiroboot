package com.vue.usermanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vue.usermanager.dao")
public class UsermanagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsermanagerApplication.class, args);
    }

}

