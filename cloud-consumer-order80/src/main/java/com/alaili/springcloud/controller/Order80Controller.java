package com.alaili.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Order80Controller {

    @Value("${remoteinfo.remoteUrl}")
    private String remoteUrl;

    private RestTemplate restTemplate;


}
