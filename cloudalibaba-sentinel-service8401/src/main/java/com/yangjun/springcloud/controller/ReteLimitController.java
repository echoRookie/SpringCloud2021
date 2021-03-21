package com.yangjun.springcloud.controller;

        import com.alibaba.csp.sentinel.annotation.SentinelResource;
        import com.alibaba.csp.sentinel.slots.block.BlockException;
        import com.yangjun.springcloud.entities.CommonResult;
        import com.yangjun.springcloud.entities.Payment;
        import com.yangjun.springcloud.myhandler.CustomerBlockHandler;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Optional;

/**
 * @author yangjun6
 * @date 2021-03-20 16:47
 */
@RestController
public class ReteLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult getResource(){
        return new CommonResult(200, "按资源限流", new Payment(1, "2222"));
    }
    public CommonResult handleException(){
        return new CommonResult(200, "按资源限流异常处理", new Payment(1, "2222"));
    }

    @GetMapping("/byResourceGlob")
    @SentinelResource(value = "byResourceGlob", blockHandler = "handlerException", blockHandlerClass = CustomerBlockHandler.class)
    public CommonResult getResourceGlob(){
        return new CommonResult(200, "按资源限流全局", new Payment(1, "2222"));
    }

    @GetMapping("/get/fallback/{id}")
    @SentinelResource(value = "fallback", fallback = "testFallBack", blockHandler = "testBlockHandler")
    public String getFallBack(@PathVariable("id") String id){
        if(id.equals("5"))
            throw  new NullPointerException();
        return "测试服务降级的方法";
    }
    public String testFallBack(@PathVariable("id") String id, Throwable e){
        return "服务降级fallback";
    }
    public String testBlockHandler(@PathVariable("id") String id, BlockException e){
        return "服务降级blockHandler";
    }
}
