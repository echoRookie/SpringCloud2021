package com.yangjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yangjun6
 * @date 2021-03-12 17:10
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignOrder82 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignOrder82.class, args);
    }
}
