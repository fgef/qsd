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
	public String finishPayment(Payment payment) {
		String inviteCode = null;
		paymentMapper.insert(payment);
		return inviteCode;
	}

}
