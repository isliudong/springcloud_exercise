package com.ld.cloud.service;

import com.ld.cloud.dto.CommonResult;
import com.ld.cloud.entity.Payment;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 28415@hand-china.com 2020/08/19 15:29
 */
@Component
//可以通过实现此接口，指定该接口所有方法降级处理
@FeignClient("CLOUD-PAYMENT-SERVICE-HYSTRIX")
public interface PaymentService {

    /**
     * rpc调用
     * @param id id
     * @return String
     */
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentOk(@PathVariable("id") Integer id);

    /**
     * rpc调用
     * @param id id
     * @return String
     */

    @GetMapping("/payment/hystrix/error/{id}")
    String paymentError(@PathVariable("id") Integer id);


}
