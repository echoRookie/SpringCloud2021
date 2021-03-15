package com.yangjun.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yangjun.springcloud.service.impl.OrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sun.awt.SunHints;

/**
 * @author yangjun6
 * @date 2021-03-15 9:55
 */
@Component
@FeignClient(value = "cloud-payment-hystrix-service", fallback = OrderServiceImpl.class)
public interface OrderService {
    @GetMapping("/payment/hystirx/getok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystirx/gettimeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id);

}
