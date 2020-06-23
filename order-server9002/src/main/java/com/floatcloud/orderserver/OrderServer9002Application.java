package com.floatcloud.orderserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * OrderServer9002Application
 *
 * @auther FloatCloud
 * @date 2020/6/23
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderServer9002Application {

    public static void main(String[] args){
        SpringApplication.run(OrderServer9002Application.class, args);
    }
}
