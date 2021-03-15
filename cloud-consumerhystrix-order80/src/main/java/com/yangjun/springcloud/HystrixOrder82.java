package com.yangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yangjun6
 * @date 2021-03-15 9:49
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrder82 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrder82.class, args);
    }
}
