package com.floatcloud.orderclient9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * OrderClient9001Application
 *
 * @auther FloatCloud
 * @date 2020/6/23
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderClient9001Application {

    public static void main(String[] args){
        SpringApplication.run(OrderClient9001Application.class, args);
    }
}
