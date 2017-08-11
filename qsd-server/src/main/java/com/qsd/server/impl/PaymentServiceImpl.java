package com.qsd.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsd.model.Payment;
import com.qsd.server.inter.PaymentService;
import com.qsd.server.mapper.PaymentMapper;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentMapper paymentMapper;

	@Override
	public Payment finishPayment(Payment payment) {
		int id = paymentMapper.insert(payment);
		Payment p = paymentMapper.selectByPrimaryKey(id);
		p.setId(id);
		return p;
	}

}
