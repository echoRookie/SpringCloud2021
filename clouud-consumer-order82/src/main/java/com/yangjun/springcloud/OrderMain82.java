package com.yangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yangjun6
 * @date 2021-03-07 21:59
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain82.class, args);
    }
}
