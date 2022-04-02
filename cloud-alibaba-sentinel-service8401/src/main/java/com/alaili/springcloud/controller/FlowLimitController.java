package com.alaili.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-04-02 10:46
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "...........testA running!";
    }

    @GetMapping("/testB")
    public String testB() {
        return "...........testB running!";
    }
}
