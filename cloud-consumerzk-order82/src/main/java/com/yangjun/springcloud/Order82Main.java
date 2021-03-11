package com.yangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangjun6
 * @date 2021-03-11 17:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order82Main {
    public static void main(String[] args) {
        SpringApplication.run(Order82Main.class, args);
    }
}
