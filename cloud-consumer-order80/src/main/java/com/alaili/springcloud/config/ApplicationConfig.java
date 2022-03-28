package com.alaili.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootConfiguration
public class ApplicationConfig {

    @Bean
    @LoadBalanced//通过注册中心获取服务列表，远程调用采用负载均衡的方式获取相应的服务
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
