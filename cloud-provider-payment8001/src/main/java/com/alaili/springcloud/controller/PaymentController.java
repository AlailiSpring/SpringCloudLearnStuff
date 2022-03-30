package com.alaili.springcloud.controller;

import com.alaili.springcloud.entities.CommonResult;
import com.alaili.springcloud.entities.Payment;
import com.alaili.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

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
        log.info("当前端口为【" + serverPort+"】");
        log.info("插入结果：" + result);
        int rstCode = result > 0 ? 200 : 400;
        String msg = result > 0 ? "插入成功！" : "插入失败！";
        return new CommonResult(rstCode, msg + serverPort, result);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = service.getPaymentById(id);
        log.info("当前端口为【" + serverPort+"】");
        log.info("查询结果:[{}]", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,端口号: " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询 ID: " + id, null);
        }
    }

    @GetMapping("/payment/timeout")
    public String paymentTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    /**
     * 测试网关的After某一时间的Predicate配置，作为过滤条件
     * 类似的可以设计成为秒杀的限定条件
     * @return
     */
    @GetMapping("/payment/afterPredicateTest")
    public String afterPredicateTest() {
        log.info("Now is executing gateway The [After predicate] test!");
        return serverPort;
    }

}
