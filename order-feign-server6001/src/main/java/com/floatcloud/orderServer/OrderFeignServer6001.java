package com.floatcloud.orderServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * OrderFeignServer6001
 *
 * @auther FloatCloud
 * @date 2020/7/9
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignServer6001 {

    public static void main(String[] args){
        SpringApplication.run(OrderFeignServer6001.class, args);
    }
}
