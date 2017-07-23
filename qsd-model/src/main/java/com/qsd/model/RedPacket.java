package com.qsd.model;

import java.util.Date;

import com.google.gson.Gson;

/**
 * 红包
 * 
 * @author orange
 *
 */
public class RedPacket {
	/**
	 * red_packet.id;
	 */
	private Integer id;

	/**
	 * red_packet.user_id;用户ID
	 */
	private Integer userId;

	/**
	 * red_packet.order_item_id;订单ID
	 */
	private Integer orderItemId;

	/**
	 * red_packet.account;红包金额
	 */
	private Double account;

	/**
	 * red_packet.create_time;创建时间
	 */
	private Date createTime;

	/**
	 * red_packet.status;状态，0：无效，1：有效不可提现，2：有效可提现
	 */
	private Byte status;

	/**
	 * red_packet.type;类型，1：支付邮费红包，2：转发红包，3：邀请注册红包
	 */
	private Byte type;

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

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	@Override
	public String toString() {
		Gson g = new Gson();
		return g.toJson(this);
	}
}