package com.banksteel.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.banksteel.service.UserRoleService;

@RestController
public class TestController {
	
	@Autowired
	private UserRoleService userRoleService;


	@RequestMapping("testmethod")
	public String testmethod(String username) {
		System.out.println(username);
		JSONObject result = new JSONObject();
		List<Object> list = new ArrayList<Object>();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msg", "success");
		map.put("username", list);
		result.put("data", map);
		return result.toString();
}	
	@RequestMapping("show")
	public String show(String username) {
		
		return "showw";
}	
	@RequestMapping("testList")
	public void testList(String username) {
		
		int rid = userRoleService.findRid("18296257477");
		 System.out.println("这是rid"+rid);
		 
		 
	
		
	}

}
