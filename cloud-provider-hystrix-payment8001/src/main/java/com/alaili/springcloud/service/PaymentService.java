package com.alaili.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-03-28 23:42
 */
public interface PaymentService {

     String paymentInfo_OK(Integer id);

     String paymentInfo_TimeOut(Integer id);

     String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
