package com.floatcloud.orderclient9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @auther FloatCloud
 * @date 2020/6/23
 */
@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/order-server/create/order")
    public String createOrder(){
        return "端口："+port+"产生订单";
    }
}
