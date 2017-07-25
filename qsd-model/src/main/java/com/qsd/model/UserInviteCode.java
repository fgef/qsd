package com.qsd.model;

import java.util.Date;

import com.google.gson.Gson;

/**
 * 邀请码
 * 
 * @author orange
 *
 */
public class UserInviteCode {
	/**
	 * user_invite_code.id;
	 */
	private Integer id;

	/**
	 * user_invite_code.order_item_id;支付ID
	 */
	private Integer paymentId;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * user_invite_code.invite_code;邀请码
	 */
	private String inviteCode;

	/**
	 * user_invite_code.create_time;创建时间
	 */
	private Date createTime;

	public static UserInviteCode getInstance(Integer paymentId, Integer userId, String inviteCode) {
		return new UserInviteCode(null, paymentId, userId, inviteCode, new Date());
	}

	private UserInviteCode(Integer id, Integer paymentId, Integer userId, String inviteCode, Date createTime) {
		super();
		this.id = id;
		this.paymentId = paymentId;
		this.userId = userId;
		this.inviteCode = inviteCode;
		this.createTime = createTime;
	}

	private UserInviteCode() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		Gson g = new Gson();
		return g.toJson(this);
	}
}