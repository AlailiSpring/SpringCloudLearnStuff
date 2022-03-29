package com.alaili.springcloud.service.impl;

import com.alaili.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFeignFallBackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "请求OK出现问题，此处是降级类给出的提示！当然也可以给出更加合理的提示！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "请求超时出现问题，此处是降级类给出的提示！当然也可以给出更加合理的提示！";
    }
}
