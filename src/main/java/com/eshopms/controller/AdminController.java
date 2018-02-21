package com.eshopms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eshopms.service.iface.IAdminService;
import com.eshopms.util.BaseController;
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{
	@Autowired
	private IAdminService adminService;
	
	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value = "/validate", method = { RequestMethod.POST })
	@ResponseBody
	public  String validate(HttpServletRequest request) {
		String userName = request.getParameter("username");
		String pwd = request.getParameter("password");
	//	String checked = request.getParameter("checked");
		System.out.println("U"+userName+"==="+"P"+pwd);
		return "index";
	}
	
	@RequestMapping(value = "/recoverpw", method = { RequestMethod.POST })
	@ResponseBody
	public  ModelAndView recoverpw(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("recoverpw");
		return mv;
	}
	
}
