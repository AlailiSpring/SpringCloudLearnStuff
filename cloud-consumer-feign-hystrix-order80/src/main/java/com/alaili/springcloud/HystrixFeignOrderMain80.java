package com.alaili.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix//开启服务降级相关，本处为调用者添加
public class HystrixFeignOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignOrderMain80.class, args);
    }
}
