package com.yangjun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjun6
 * @date 2021-03-18 22:17
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping(value = "/payment/get/{id}")
    public String getPayment(@PathVariable("id") String id) {
        return "serverPort:" + serverPort + "   id"+id;
    }
}
