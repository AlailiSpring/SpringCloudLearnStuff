package com.alaili.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-04-01 10:15
 */
@RestController
@RefreshScope//自动刷新配置信息,if config is changed!
public class NacosConfigClientController {

    //从nacos配置中心获取
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/nacos/config/getInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
