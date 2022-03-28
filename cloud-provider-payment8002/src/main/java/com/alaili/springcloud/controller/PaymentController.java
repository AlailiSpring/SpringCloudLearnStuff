package com.alaili.springcloud.controller;

import com.alaili.springcloud.entities.CommonResult;
import com.alaili.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import com.alaili.springcloud.service.PaymentService;

@RestController
public class PaymentController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PaymentController.class);

    @Resource
    private PaymentService service;
    @Value("${server.port}")
    private String serverPort;

    //加入@Request支持前台传递json到对象的转化
    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = service.create(payment);
        log.info("插入结果------" + result);
        int rstCode = result > 0 ? 200 : 400;
        String msg = result > 0 ? "插入成功！" : "插入失败！";
        return new CommonResult(rstCode, msg + serverPort, result);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = service.getPaymentById(id);
        log.info("-------------查询结果:[{}]", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,端口号: " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询 ID: " + id, null);
        }
    }
}
