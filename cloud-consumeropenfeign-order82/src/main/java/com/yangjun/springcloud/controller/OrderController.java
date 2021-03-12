package com.yangjun.springcloud.controller;

import com.yangjun.springcloud.entities.CommonResult;
import com.yangjun.springcloud.service.OpenFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yangjun6
 * @date 2021-03-12 17:11
 */
@RestController
public class OrderController {
    @Resource
    private OpenFeignService openFeignService;
    // 服务调用
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        return openFeignService.getPaymentByID(id);

    }
}
