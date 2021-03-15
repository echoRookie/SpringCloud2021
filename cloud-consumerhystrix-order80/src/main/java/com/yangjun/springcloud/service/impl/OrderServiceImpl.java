package com.yangjun.springcloud.service.impl;

import com.yangjun.springcloud.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author yangjun6
 * @date 2021-03-15 14:03
 */
@Service
public class OrderServiceImpl  implements OrderService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "服务降级";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "服务降级生产者";
    }
}
