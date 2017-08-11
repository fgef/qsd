package com.qsd.model;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.google.gson.Gson;

/**
 * 用户信息
 * 
 * @author orange
 *
 */
public class User {
	/**
	 * user.id;id
	 */
	private Integer id;

	/**
	 * user.phone;手机号，非收件人号
	 */
	private String phone;

	/**
	 * user.accepte_code;受邀请码
	 */
	private String accepteCode;

	/**
	 * user.accepte_user_id;受邀请人ID
	 */
	private Integer accepteUserId;

	/**
	 * user.accepte_user_phone;受邀请人手机号
	 */
	private String accepteUserPhone;

	/**
	 * user.head_portrait;用户头像地址
	 */
	private String headPortrait;

	/**
	 * user.band_wx;是否绑定微信，0：未绑定，1已绑定
	 */
	private Byte bandWx;

	/**
	 * user.regist_time;注册时间
	 */
	private Date registTime;

	public static User getRegistInstance(String phone) {
		return new User(null, phone, null, null, null, null, (byte) 0, new Date());
	}

	private User() {
		super();
	}

	private User(Integer id, String phone, String accepteCode, Integer accepteUserId, String accepteUserPhone,
			String headPortrait, Byte bandWx, Date registTime) {
		super();
		this.id = id;
		this.phone = phone;
		this.accepteCode = accepteCode;
		this.accepteUserId = accepteUserId;
		this.accepteUserPhone = accepteUserPhone;
		this.headPortrait = headPortrait;
		this.bandWx = bandWx;
		this.registTime = registTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getAccepteCode() {
		return accepteCode;
	}

	public void setAccepteCode(String accepteCode) {
		this.accepteCode = accepteCode == null ? null : accepteCode.trim();
	}

	public Integer getAccepteUserId() {
		return accepteUserId;
	}

	public void setAccepteUserId(Integer accepteUserId) {
		this.accepteUserId = accepteUserId;
	}

	public String getAccepteUserPhone() {
		return accepteUserPhone;
	}

	public void setAccepteUserPhone(String accepteUserPhone) {
		this.accepteUserPhone = accepteUserPhone == null ? null : accepteUserPhone.trim();
	}

	public String getHeadPortrait() {
		return headPortrait;
	}

	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait == null ? null : headPortrait.trim();
	}

	public Byte getBandWx() {
		return bandWx;
	}

	public void setBandWx(Byte bandWx) {
		this.bandWx = bandWx;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	@Override
	public String toString() {
		Gson g = new Gson();
		return g.toJson(this);
	}

	public boolean isChinaPhoneLegal() throws PatternSyntaxException {
		String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(this.phone);
		return m.matches();
	}
}