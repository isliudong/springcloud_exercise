package com.ld.cloud.service;

import com.ld.cloud.dto.CommonResult;
import com.ld.cloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 28415@hand-china.com 2020/08/19 09:16
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentService {

    @GetMapping("/payment/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
