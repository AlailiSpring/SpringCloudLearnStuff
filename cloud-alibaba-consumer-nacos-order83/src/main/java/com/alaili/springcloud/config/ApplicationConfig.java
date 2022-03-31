package com.alaili.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-03-31 15:57
 */
@Configuration
public class ApplicationConfig {

    @Bean
    @LoadBalanced//支持Robbin的负载均衡配置
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
