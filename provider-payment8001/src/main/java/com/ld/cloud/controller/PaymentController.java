package com.ld.cloud.controller;

import com.ld.cloud.dto.CommonResult;
import com.ld.cloud.entity.Payment;
import com.ld.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 28415@hand-china.com 2020/08/14 16:05
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    private String port;
    @PostMapping("/payment")
    public CommonResult<Integer> create(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("*********插入返回标志：{}", result);

        if (result==1){
            return new CommonResult<>(200,"插入成功",result);
        }else {
            return new CommonResult<>(444,"插入失败");
        }
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("*********查询结果：{}", payment);

        if (payment!=null){
            return new CommonResult<>(200,"找到结果来自端口："+port,payment);
        }else {
            return new CommonResult<>(200,"结果为空");
        }
    }
}
