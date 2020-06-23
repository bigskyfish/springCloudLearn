package com.floatcloud.consumerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ConsumerClient7001Application
 *
 * @auther FloatCloud
 * @date 2020/6/23
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerClient7001Application {

    public static void main(String[] args){
        SpringApplication.run(ConsumerClient7001Application.class, args);
    }
}
