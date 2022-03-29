package com.alaili.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 熔断代码主程序
 * @Author: LiBaoDeng
 * @Date: 2022-03-28 23:40
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//启动hystrix服务降级
public class HystrixPaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentMain8001.class, args);
    }
}
