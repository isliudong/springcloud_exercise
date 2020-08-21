package com.ld.cloud.controller;

import com.ld.cloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author 28415@hand-china.com 2020/08/19 09:25
 */
@RestController
@RequestMapping("/consumer")
//全局降级处理方法
//@DefaultProperties(defaultFallback = "globalFallbackMethod")
public class PaymentController {

    @Resource
    PaymentService paymentService;


    @GetMapping("/payment/ok/{id}")
    public String paymentOk(@PathVariable("id") Integer id){
        return paymentService.paymentOk(id);
    }

    /**
     * 客户端带降级方法
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentErrorSub",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    @GetMapping("/payment/error/{id}")
    public String paymentError(@PathVariable("id") Integer id){
        return paymentService.paymentError(id);
    }

    String paymentErrorSub(@PathVariable Integer id){
        return "客户端降级方法响应：很忙，大哥歇会儿";
    }
    /**
     * 全局降级处理方法
     */
    String globalFallbackMethod(){
        return "客户端全局降级方法响应：很忙，大哥歇会儿";
    }

}
