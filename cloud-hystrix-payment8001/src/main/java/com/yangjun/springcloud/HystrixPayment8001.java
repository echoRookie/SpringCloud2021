package com.yangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationExtensionsKt;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author yangjun6
 * @date 2021-03-14 21:44
 */
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment8001.class, args);
    }
}
