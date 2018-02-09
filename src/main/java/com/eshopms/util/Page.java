package com.eshopms.util;

import java.util.List;

@SuppressWarnings("rawtypes")
public class Page {
	private String curr;
	private String size;
	private Long count;
	private List data;
	public int getCurr() {
		return Integer.parseInt(curr);
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public int getCount() {
		return count.intValue();
	}
	public void setCount(long count) {
		this.count = count;
	}
	public int getSize() {
		return Integer.parseInt(size);
	}
	public void setSize(String size) {
		this.size = size;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	
	public int getFirstResult() {
		return (getCurr()-1)*getSize();
	}
	public Page(String curr, String size) {
		super();
		this.curr = curr;
		this.size = size;
	}
	public Page(String curr, String size, Long count, List data) {
		super();
		this.curr = curr;
		this.size = size;
		this.count = count;
		this.data = data;
	}
	public Page(String curr, String size, Long count) {
		super();
		this.curr = curr;
		this.size = size;
		this.count = count;
	}
	
}
