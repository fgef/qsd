package com.qsd.server.inter;

import com.qsd.model.Payment;

public interface PaymentService {

	/**
	 * 完成支付
	 * 
	 * @param payment
	 * @return 邀请码
	 */
	public String finishPayment(Payment payment);
}
