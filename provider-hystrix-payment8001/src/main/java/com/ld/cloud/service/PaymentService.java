package com.ld.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author 28415@hand-china.com 2020/08/19 11:28
 */
@Service
public class PaymentService {
    public String paymentOk(Integer id) {
        return "线程池： " + Thread.currentThread().getName() + " paymentOk, id" + id;
    }

    /**
     * 服务端带降级方法，熔断设置：业务执行超过三秒
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentErrorSub",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentError(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： " + Thread.currentThread().getName() + " paymentError, id" + id;
    }

    String paymentErrorSub(Integer id){
        return "服务端降级方法响应：很忙，大哥歇会儿";
    }
}
