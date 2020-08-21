package com.ld.cloud.service;

import com.ld.cloud.entity.Payment;

/**
 * @author 28415@hand-china.com 2020/08/14 15:56
 */

public interface PaymentService {
    /**
     * 创建订单
     * @param payment 订单
     * @return id
     */
    int create(Payment payment);

    /**
     * 通过id获取订单
     * @param id id
     * @return Payment 订单
     */
    Payment getPaymentById(Long id);
}
