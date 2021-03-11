package com.yangjun.springcloud.controller;

import com.yangjun.springcloud.entities.CommonResult;
import com.yangjun.springcloud.entities.Payment;
import com.yangjun.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yangjun6
 * @date 2021-03-06 16:49
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        return new CommonResult(200,  "success" + serverPort, result);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment result = paymentService.getPaymentById(id);
        return new CommonResult(200,  "success"+ serverPort, result);
    }
}
