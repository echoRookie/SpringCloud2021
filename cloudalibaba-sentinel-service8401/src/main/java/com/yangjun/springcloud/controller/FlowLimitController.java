package com.yangjun.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjun6
 * @date 2021-03-20 11:25
 */
@RestController
public class FlowLimitController {
    @GetMapping("/get/testA")
    public String testA(){
        return "Testa";
    }
    @GetMapping("/get/testB")
    public String testB(){
        return "Testb";
    }
}
