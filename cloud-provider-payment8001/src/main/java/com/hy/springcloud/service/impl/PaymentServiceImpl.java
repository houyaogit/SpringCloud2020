package com.hy.springcloud.service.impl;

import com.hy.springcloud.dao.PaymentDao;
import com.hy.springcloud.entities.Payment;
import com.hy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：hy
 * @description：TODO
 * @date ：2020/10/26 18:50
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
