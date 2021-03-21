package com.yangjun.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yangjun.springcloud.entities.CommonResult;
import com.yangjun.springcloud.entities.Payment;

/**
 * @author yangjun6
 * @date 2021-03-20 17:06
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException blocException){
        return new CommonResult(404, "自定义全局限流处理", new Payment(3, "2222"));
    }
}
