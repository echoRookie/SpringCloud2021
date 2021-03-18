package com.yangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangjun6
 * @date 2021-03-18 22:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentOrder83 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentOrder83.class, args);
    }
}
