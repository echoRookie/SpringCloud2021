package com.yangjun.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yangjun6
 * @date 2021-03-11 17:03
 */
@RestController
public class OrderController {
     private static final String URL = "http://cloud-payment-service";
     @Resource
     private RestTemplate restTemplate;

     @GetMapping(value = "/consumer/order")
     public String order(){
         return  restTemplate.getForObject(URL +"/payment/zk",String.class);
     }
}
