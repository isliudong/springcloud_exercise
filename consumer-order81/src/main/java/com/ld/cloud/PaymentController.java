package com.ld.cloud;

import com.ld.cloud.dto.CommonResult;
import com.ld.cloud.entity.Payment;
import com.ld.cloud.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 28415@hand-china.com 2020/08/19 09:25
 */
@RestController
@RequestMapping("/consumer")
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> result = paymentService.getPaymentById(id);
        return result;
    }
}
