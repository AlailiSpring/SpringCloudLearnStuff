package com.alaili.springcloud.controller;

import com.alaili.springcloud.config.CustomizedInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-03-31 15:56
 */
@RestController
@Slf4j
public class ConsumerNacosOrder83Controller {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private CustomizedInfo customizedInfo;


    @GetMapping("/consume/payment/nacos/{id}")
    public String getPaymentNacosId(@PathVariable("id") Long id) {
        return restTemplate.getForObject(customizedInfo.getRemoteServiceUri() + "/payment/nacos/" + id, String.class);
    }

}
