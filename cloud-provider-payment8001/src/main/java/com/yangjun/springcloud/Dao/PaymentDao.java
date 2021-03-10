package com.yangjun.springcloud.Dao;

import com.yangjun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yangjun6
 * @date 2021-03-06 16:21
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
