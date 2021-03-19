package com.yangjun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjun6
 * @date 2021-03-19 22:05
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String configinfo;

    @GetMapping("/get/config")
    public String  getInfo(){
        return configinfo ;
    }
}
