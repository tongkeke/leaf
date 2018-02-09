package com.eshopms.util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.alibaba.fastjson.JSON;

public class BaseController {
	//获取HttpServletRequest对象val(according to param name)
	public String getRequestVal(String name, HttpServletRequest req){
		return req.getParameter(name);
	}
	
	// 获取HttpSession对象val
	public String getSession(String name, HttpServletRequest req,
			HttpServletResponse resp) {
		String val = this.getSessionVal(req, name).toString().trim();
		return val;
	}

	// 设置HttpSession对象val
	public void setSession(String name, String val, HttpServletRequest req) {
		this.setSessionVal(req, name, val);
	}

	// 输出json化的实体/实体集合/map/map集合
	public String toJSONString(Object content) {
		try {
			return JSON.toJSONString(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	// 获取Application(ServletContext)对象
	public ServletContext getApp(HttpServletRequest req) {
		return req.getServletContext();
	}

	// 设置Application(ServletContext)对象val
	public void setAppVal(HttpServletRequest req, String name, Object val) {
		ServletContext app = req.getServletContext();
		app.setAttribute(name, val);
	}

	// 获取Application(ServletContext)对象val
	public Object getAppVal(HttpServletRequest req, String name) {
		ServletContext app = req.getServletContext();
		Object obj = app.getAttribute(name);
		return null == obj ? "" : obj;
	}

	// 设置HttpSession对象val
	public void setSessionVal(HttpServletRequest req, String name, Object val) {
		HttpSession ss = req.getSession();
		ss.setAttribute(name, val);
	}

	// 获取HttpSession对象val
	public Object getSessionVal(HttpServletRequest req, String name) {
		HttpSession ss = req.getSession();
		Object obj = ss.getAttribute(name);
		return null == obj ? "" : obj;
	}

	// 判断是否ajax请求
	public boolean isAjax(HttpServletRequest req) {
		return "XMLHttpRequest".equalsIgnoreCase(req
				.getHeader("X-Requested-With"));
	}
	
	
}
