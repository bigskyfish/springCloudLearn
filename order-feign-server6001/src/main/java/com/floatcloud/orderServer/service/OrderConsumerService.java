package com.floatcloud.orderServer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * OrderConsumerService
 *
 * @auther FloatCloud
 * @date 2020/7/9
 */
@Component
@FeignClient(value = "ORDER-PROVIDER")
public interface OrderConsumerService {

    @GetMapping("/order-server/create/order")
    String createOrder();
}