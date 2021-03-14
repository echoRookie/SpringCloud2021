package com.yangjun.springcloud.controller;

import com.yangjun.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author yangjun6
 * @date 2021-03-14 21:53
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystirx/getok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        return paymentService.paymentInfoOk(id);
    }


    @GetMapping("/payment/hystirx/gettimeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
       return paymentService.paymentInfoTimeOut(id);
    }
}
