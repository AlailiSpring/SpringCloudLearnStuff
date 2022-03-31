package com.alaili.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-03-31 11:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaProviderPaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaProviderPaymentMain9001.class, args);
    }
}
