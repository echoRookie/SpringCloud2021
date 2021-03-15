package com.yangjun.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
    @HystrixCommand(fallbackMethod="fallBackTimeOut  ", commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled", value="true"),//是否开启断路器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value="10"),//请求次数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value="10000"),//时间窗口期
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value="60")//失败率达到多少后跳闸
    })
    public String paymentInfoOk(@PathVariable("id") Integer id){
        return paymentService.paymentInfoOk(id) + serverPort;
    }

    @HystrixCommand(fallbackMethod = "fallBackTimeOut", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value="6000")})
    @GetMapping("/payment/hystirx/gettimeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
       return paymentService.paymentInfoTimeOut(id) + serverPort+"生产者";
    }

    public String fallBackTimeOut(Integer id){
        return "服务降级测试，等待时间3秒，线程sleep五秒" + serverPort;
    }
}
