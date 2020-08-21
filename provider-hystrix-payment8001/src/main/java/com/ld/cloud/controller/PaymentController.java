package com.ld.cloud.controller;

import com.ld.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 28415@hand-china.com 2020/08/19 13:52
 */
@RequestMapping("/payment/hystrix")
@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;
    @Value("${server.port}")
    String port;

    @GetMapping("/ok/{id}")
    public String paymentOk(@PathVariable Integer id) {
        log.info("Ok........");
        return paymentService.paymentOk(id);
    }

    @GetMapping("/error/{id}")
    public String paymentError(@PathVariable Integer id) {
        log.info("Error........");
        return paymentService.paymentError(id);
    }
}
