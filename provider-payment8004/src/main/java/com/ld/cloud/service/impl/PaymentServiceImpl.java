package com.ld.cloud.service.impl;

import com.ld.cloud.entity.Payment;
import com.ld.cloud.mapper.PaymentMapper;
import com.ld.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 28415@hand-china.com 2020/08/14 15:58
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
