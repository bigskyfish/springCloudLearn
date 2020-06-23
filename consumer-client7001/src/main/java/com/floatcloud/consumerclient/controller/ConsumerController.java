package com.floatcloud.consumerclient.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerController
 *
 * @auther FloatCloud
 * @date 2020/6/23
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    /**
     * 服务提供的地址：即服务提供方的spring.application.name 转大写
     * 也可以理解为在Eureka服务注册中心，注册的application值。
     */
    final String urlPath = "http://ORDER-PROVIDER";

    @GetMapping("/consumer/make/order")
    public String makeOrder(@RequestParam("name") String name){
        String template = restTemplate.getForObject(urlPath + "/order-server/create/order", String.class);
        return name + template;
    }
}
