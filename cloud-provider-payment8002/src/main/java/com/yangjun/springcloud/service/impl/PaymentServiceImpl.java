package com.yangjun.springcloud.service.impl;


import com.yangjun.springcloud.Dao.PaymentDao;
import com.yangjun.springcloud.entities.Payment;
import com.yangjun.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangjun6
 * @date 2021-03-06 16:44
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
