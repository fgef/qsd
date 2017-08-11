package com.qsd.model;

import java.util.Date;

import com.google.gson.Gson;

/**
 * 用户支付记录（邮费）
 * 
 * @author orange
 *
 */
public class Payment {
	/**
	 * payment.id;
	 */
	private Integer id;

	/**
	 * payment.user_id;用户ID
	 */
	private Integer userId;

	/**
	 * payment.account;支付金额
	 */
	private Double account;

	/**
	 * payment.payment_time;支付时间
	 */
	private Date paymentTime;

	/**
	 * payment.status;支付状态，0：未支付，1：已支付
	 */
	private Byte status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public Date getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Override
	public String toString() {
		Gson g = new Gson();
		return g.toJson(this);
	}
}