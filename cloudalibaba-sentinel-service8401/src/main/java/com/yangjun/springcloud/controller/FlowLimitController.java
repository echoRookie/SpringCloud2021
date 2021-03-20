package com.yangjun.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjun6
 * @date 2021-03-20 11:25
 */
@RestController
public class FlowLimitController {
    @GetMapping("/get/testA")
    public String testA(){
        return "Testa";
    }
    @GetMapping("/get/testB")
    public String testB(){
        return "Testb";
    }
    @GetMapping("/testhotkey")
    @SentinelResource(value = "testhotkey", blockHandler = "dealHotkey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,@RequestParam(value = "p2", required = false) String p2){
        return "热点限流测试";
    }

    public String dealHotkey(String p1, String p2, BlockException exception){
        return "热点限流处理类";
    }
}
