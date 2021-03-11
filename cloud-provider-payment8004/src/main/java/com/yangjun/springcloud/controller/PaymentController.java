package com.yangjun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yangjun6
 * @date 2021-03-11 13:47
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String  serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentZk(){
        return serverPort + UUID.randomUUID().toString();
    }
}
