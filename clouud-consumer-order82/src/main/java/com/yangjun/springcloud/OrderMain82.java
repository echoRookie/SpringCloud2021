package com.yangjun.springcloud;

import com.yangjun.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author yangjun6
 * @date 2021-03-07 21:59
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyselfRule.class)
public class OrderMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain82.class, args);
    }
}
