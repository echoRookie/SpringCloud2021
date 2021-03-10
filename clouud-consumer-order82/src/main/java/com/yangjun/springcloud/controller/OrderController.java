package com.yangjun.springcloud.controller;

import com.yangjun.springcloud.entities.CommonResult;
import com.yangjun.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yangjun6
 * @date 2021-03-07 22:12
 */
@RestController
public class OrderController {
    public static final String URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;
    @PostMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){

        return restTemplate.postForObject(URL + "/payment/create", payment,  CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        return restTemplate.getForObject(URL + "/payment/get/" + id, CommonResult.class);
    }
}
