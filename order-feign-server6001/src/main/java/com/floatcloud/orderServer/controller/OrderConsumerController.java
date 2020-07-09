package com.floatcloud.orderServer.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.floatcloud.orderServer.service.OrderConsumerService;

/**
 * OrderConsumerController
 *
 * @auther FloatCloud
 * @date 2020/7/9
 */
@RestController
public class OrderConsumerController {

    @Resource
    private OrderConsumerService orderConsumerService;

    @GetMapping("/consumer/make/order")
    public String makeOrder(@RequestParam("name") String name){
        String template = orderConsumerService.createOrder();
        return name + template;
    }
}
