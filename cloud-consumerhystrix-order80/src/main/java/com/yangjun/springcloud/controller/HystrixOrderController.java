package com.yangjun.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yangjun.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yangjun6
 * @date 2021-03-15 10:18
 */
@RestController
//@DefaultProperties(defaultFallback = "globalTimeOut")
public class HystrixOrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/consumer/payment/hystirx/getok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        return orderService.paymentInfoOk(id) + "消费者80端口";
    }

    ;

    @GetMapping("/consumer/payment/hystirx/gettimeout/{id}")
//    @HystrixCommand(fallbackMethod = "fallBackTimeOut", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
//    })
    //@HystrixCommand
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        return orderService.paymentInfoTimeOut(id) + "消费者80端口20210315";
    }

    public String fallBackTimeOut(Integer id) {
        return "消费者80端口服务降级";
    }

    public String globalTimeOut() {
        return "全局服务降级";
    }


}
