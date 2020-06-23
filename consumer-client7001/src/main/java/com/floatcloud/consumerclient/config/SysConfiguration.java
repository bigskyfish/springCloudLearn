package com.floatcloud.consumerclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * SysConfiguration
 * 远程调用采用的是RestTemplate方式调用
 * @auther FloatCloud
 * @date 2020/6/23
 */
@Configuration
public class SysConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
