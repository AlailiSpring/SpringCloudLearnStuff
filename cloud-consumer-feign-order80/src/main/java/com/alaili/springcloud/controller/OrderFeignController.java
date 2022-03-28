package com.alaili.springcloud.controller;

import com.alaili.springcloud.entities.CommonResult;
import com.alaili.springcloud.entities.Payment;
import com.alaili.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {

    @Resource
    PaymentFeignService service;

    @GetMapping("/consumer/feign/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return service.getPaymentById(id);
    }
}
