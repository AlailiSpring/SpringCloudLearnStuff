package com.alaili.springcloud.service.impl;

import com.alaili.springcloud.dao.PaymentDAO;
import com.alaili.springcloud.entities.Payment;
import com.alaili.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource//先Type,后name
    private PaymentDAO dao;

    @Override
    public int create(Payment payment) {
        return dao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return dao.getPaymentById(id);
    }
}
