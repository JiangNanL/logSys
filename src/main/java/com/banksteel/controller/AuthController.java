package com.banksteel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.banksteel.domain.Authority;
import com.banksteel.domain.Function;
import com.banksteel.service.AuthFunService;
import com.banksteel.service.AuthService;
import com.banksteel.service.FunctionService;

@Controller
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private FunctionService functionService;
	
	@Autowired
	private AuthFunService authFunService;

	@RequestMapping(value="toAddAuth")
	@ResponseBody
	public String toAddAuth(String aname) {
		JSONObject result = new JSONObject();
		String aid = authService.findAid(aname);
		if (aid==null) {
		authService.addAuth(aname);
		result.put("msg", "添加成功！");
		return result.toString();
		} else {
			result.put("msg", "该权限名已存在！");
			return result.toString();
		}
	}
	
	
	/*
	 * 查询所有权限
	 */
	@RequestMapping(value="authList")
	public String authList(Model model) {
		List<Authority> authList = authService.findAll();
		model.addAttribute("list", authList);
		return "authList";
	}
	
	/*
	 * 跳转到增加给配功能页面
	 */
	@RequestMapping(value="distribute")
	public String distribute(Model model) {
		List<Authority> authList = authService.findAll();
		model.addAttribute("authList", authList);
		List<Function> functions = functionService.finFunctionAll();
		model.addAttribute("functions", functions);
		return "distribute";
	}
	
	@RequestMapping(value="distributeFunction")
	public String distributeFunction(String aid,String[] checkId,Model model) {
		String isnull = authFunService.insertAuthFun(aid, checkId);
		if(isnull != null) {
		model.addAttribute("msg","分配成功！");
		return "distribute";
		}else {
			model.addAttribute("msg","分配失败！");
			return "distribute";
		}
		
	}
}
