package com.hzgroup.lionframework.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hzgroup.lionframework.lion"})
public class LionRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LionRestApplication.class, args);
    }
}
