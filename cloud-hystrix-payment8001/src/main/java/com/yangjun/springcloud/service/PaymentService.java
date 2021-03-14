package com.yangjun.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author yangjun6
 * @date 2021-03-14 21:46
 */
@Service
public class PaymentService {
    public String paymentInfoOk(Integer id){
        return Thread.currentThread().getName() + id;
    }


    public String paymentInfoTimeOut(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + id+ "超时";
    }
}
