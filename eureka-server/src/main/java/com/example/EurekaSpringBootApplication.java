package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer//启用Eureka服务
@SpringBootApplication
public class EurekaSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSpringBootApplication.class, args);
    }
}
