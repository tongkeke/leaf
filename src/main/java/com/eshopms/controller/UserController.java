package com.eshopms.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import com.eshopms.model.User;
import com.eshopms.service.iface.IUserService;
import com.eshopms.util.BaseController;
import com.eshopms.util.LayuiTableJson;
import com.eshopms.util.Page;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/validate", method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView validate(HttpServletRequest request) {
		User user = userService.get(1);

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("user", JSON.toJSONString(user));
		return mv;
	}

	@RequestMapping(value = "/demo", method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView demo(HttpServletRequest request) {
		List<User> query = userService.query("from User");
		ModelAndView mv = new ModelAndView("demo");
		mv.addObject("user", JSON.toJSONString(query));
		return mv;
	}

	@RequestMapping(value = "/listuser", method = { RequestMethod.GET })
	@ResponseBody
	public LayuiTableJson listUser(HttpServletRequest request) {
		Page page = new Page(this.getRequestVal("page", request),
				this.getRequestVal("limit", request), userService.getModelCount());
		List<User> query = userService.query(page.getFirstResult(),
				page.getSize(), User.class);
		LayuiTableJson json = new LayuiTableJson(0, "message", page.getCount(),
				query);
		return json;
	}

	@RequestMapping(value = "/edit", method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView update(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("member-edit");
		return mv;
	}
}
