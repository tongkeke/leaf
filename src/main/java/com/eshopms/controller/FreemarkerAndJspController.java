package com.eshopms.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: kavin
 * @date: 2018骞�鏈�6鏃�
 * @time: 涓嬪崍6:09:57
 * @鍔熻兘:
 * @闂:
 * @璇存槑: @URL鍦板潃锛�@杩涘害鎻忚堪锛�
 */
@Controller
@RequestMapping("/home")
public class FreemarkerAndJspController {
	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public ModelAndView getFirstPage(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping(value = "/jsp", method = { RequestMethod.GET })
	public ModelAndView getJsp(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message1", "jsp");
		mv.addObject("message2", "My First Spring Mvc");
		mv.setViewName("temp/index");
		return mv;
	}
}
