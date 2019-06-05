package com.banksteel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TraceController {
	
	/*
	 * 跳转到登录页面
	 */
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	/*
	 *跳转到注册页面
	 */
	@RequestMapping(value="register")
	public String register() {
		return "register";
	}
	
	
	/*
	 *跳转到测试页
	 */
	@RequestMapping(value="test")
	public String test() {
		return "test";
	}
	
	/*
	 * 跳转到百度页面
	 */
	@RequestMapping(value="www.baidu.com")
	public ModelAndView baidu() {
		return new ModelAndView("redirect:https://www.baidu.com");
	}
	
	/*
	 * 跳转到增加权限页面
	 */
	@RequestMapping(value="addAuth")
	public String addAuth() {
		
		return "addAuth";
	}
	
	
	
}
