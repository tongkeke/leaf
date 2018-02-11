package com.eshopms.util;

import java.util.List;

@SuppressWarnings("rawtypes")
public class LayuiTableDataJson {
	private int code;
	private String msg;
	private int count;
	private List data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public LayuiTableDataJson(int code, String msg, int count, List data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}
	public LayuiTableDataJson() {
		super();
	}
	
	
}
