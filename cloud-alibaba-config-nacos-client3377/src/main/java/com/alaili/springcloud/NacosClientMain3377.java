package com.alaili.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-04-01 10:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosClientMain3377.class, args);
    }
}
