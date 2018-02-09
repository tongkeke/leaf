package com.eshopms.util;

@SuppressWarnings("serial")
public class MyException extends Exception{
	private String msg;

	public MyException(String msg) {
		super(msg);
	}

	public MyException() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
