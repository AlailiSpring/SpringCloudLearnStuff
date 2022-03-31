package com.alaili.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-03-31 13:45
 */
@RestController
public class AliProviderPayment9001Controller {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPaymentNacosId(@PathVariable("id") Long id) {
        return ">>>>>nacos register,serverPort is :" + serverPort + "\t the id is :" + id;
    }
}
