package com.qsd.model;

public interface Constant {
	public static final byte REDPACKET_STATUS_INVALID = 0;
	public static final byte REDPACKET_STATUS_UNCASH = 1;
	public static final byte REDPACKET_STATUS_CASHABLE = 2;

	public static final byte REDPACKET_TYPE_PAYMENT = 1;
	public static final byte REDPACKET_TYPE_RELAY = 2;
	public static final byte REDPACKET_TYPE_INVITE = 3;
}
