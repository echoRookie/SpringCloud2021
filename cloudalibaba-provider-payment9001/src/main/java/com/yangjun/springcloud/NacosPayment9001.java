package com.yangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangjun6
 * @date 2021-03-17 22:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayment9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPayment9001.class, args);
    }
}
