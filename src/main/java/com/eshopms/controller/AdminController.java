package com.eshopms.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.eshopms.util.BaseController;
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{
	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView validate(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	
}
