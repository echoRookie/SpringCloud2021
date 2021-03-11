package com.yangjun.springcloud.service;

import com.yangjun.springcloud.entities.Payment;

/**
 * @author yangjun6
 * @date 2021-03-06 16:43
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
