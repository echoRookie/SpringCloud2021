package com.yangjun.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yangjun6
 * @date 2021-03-18 22:37
 */
@RestController
public class OrderController {
    private static final String URL = "http://nacos-payment-server";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/get/{id}")
    public String paymentInfo(@PathVariable("id") String id){
        return restTemplate.getForObject(URL + "/payment/get/" + id, String.class);
    }
}
