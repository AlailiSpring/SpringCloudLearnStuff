package com.alaili.springcloud.controller;

import com.alaili.springcloud.entities.CommonResult;
import com.alaili.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Order80Controller {

    @Value("${remoteinfo.remoteUrl}")
    private String remoteUrl;

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consume/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(remoteUrl + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consume/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(remoteUrl + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consume/payment/zipkin")
    public String consumePaymentZipkin() {
        return restTemplate.getForObject(remoteUrl + "/payment/zipkin", String.class);
    }
}
