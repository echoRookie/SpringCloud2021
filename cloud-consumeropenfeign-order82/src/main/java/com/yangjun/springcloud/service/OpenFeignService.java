package com.yangjun.springcloud.service;

import com.yangjun.springcloud.entities.CommonResult;
import com.yangjun.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yangjun6
 * @date 2021-03-12 17:14
 */
@Component
@FeignClient("cloud-payment-service")
public interface OpenFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment>  getPaymentByID(@PathVariable("id") Long id);
}

