package com.qsd.model;

import java.util.Date;

public class OrderItem {
	/**
	 * order_item.id;
	 */
	private Integer id;

	/**
	 * order_item.user_id;用户ID
	 */
	private Integer userId;

	/**
	 * order_item.payment_id;支付记录ID
	 */
	private Integer paymentId;

	/**
	 * order_item.invite_code;邀请码
	 */
	private String inviteCode;

	/**
	 * order_item.status;订单状态，0：无效，1：有效
	 */
	private Byte status;

	/**
	 * order_item.create_time;
	 */
	private Date createTime;

	/**
	 * order_item.address_id;邮寄地址id
	 */
	private Integer addressId;

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

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode == null ? null : inviteCode.trim();
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
}