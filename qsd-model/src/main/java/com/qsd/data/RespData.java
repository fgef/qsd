package com.qsd.data;

public class RespData {

	private int code;
	private String message;
	private Object data;

	public static RespData getSuccResp() {
		return new RespData(RespCode.SUCCESS, "", null);
	}

	public static RespData getSuccResp(Object data) {
		return new RespData(RespCode.SUCCESS, "", data);
	}

	public static RespData getErrorResp(Integer code, String msg) {
		return new RespData(code, msg, null);
	}

	private RespData() {
		super();
	}

	private RespData(int code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
