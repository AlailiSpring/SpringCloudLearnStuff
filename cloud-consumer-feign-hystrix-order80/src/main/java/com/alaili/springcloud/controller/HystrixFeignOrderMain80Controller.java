package com.alaili.springcloud.controller;

import com.alaili.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class HystrixFeignOrderMain80Controller {

    @Resource
    private PaymentHystrixService service;

    @GetMapping("/consume/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = service.paymentInfo_OK(id);
        log.info("*****result:" + result);
        return result;
    }

//    @HystrixCommand(fallbackMethod = "payment_TimeOutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
//    })
    //@HystrixCommand
    @GetMapping("/consume/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = service.paymentInfo_TimeOut(id);
        log.info("*****result:" + result);
        return result;
    }

    public String payment_TimeOutHandler(Integer id) {
        return "我是消费者80，对方线程池:" + Thread.currentThread().getName() + " 系统繁忙或运行错误,请稍后重试,id:" + id + "\t" + "o(╥﹏╥)o"
                + "\n" + "或者检查本地代码，确认是不是本地代码逻辑出现问题！";
    }

    //给一个全局的默认兜底方法，防止每个方法都给个处理
    public String payment_Global_FallbackMethod() {
        return "Global异常处理信息，请稍后再试！(T_T)";
    }

}
