package com.alaili.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-04-02 10:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AliSentinelServiceMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(AliSentinelServiceMain8401.class, args);
    }
}
