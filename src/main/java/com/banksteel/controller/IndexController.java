package com.banksteel.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.banksteel.domain.Function;
import com.banksteel.domain.User;
import com.banksteel.service.AuthFunService;
import com.banksteel.service.AuthService;
import com.banksteel.service.FunctionService;
import com.banksteel.service.RoleAuthService;
import com.banksteel.service.UserRoleService;
import com.banksteel.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRoleService userRoleService;
	
	@Autowired
	private RoleAuthService roleAuthService;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private FunctionService functionService;
	
	@Autowired
	private AuthFunService authFunService;


	/*
	 * 登录
	 */
	@RequestMapping(value="loginview")
	@ResponseBody
	public String loginview(String username,String pw,HttpServletRequest request) {  //,HttpServletRequest request,HttpServletResponse response,Model model
		HttpSession session =  request.getSession();
		User user = userService.findById(username);
		JSONObject result = new JSONObject(); 
		if(user == null) {
			result.put("msg", "该用户不存在");
			
		return  result.toString();	
		}
		else if(!user.getPassword().equals(pw)){  
			result.put("msg", "密码错误!");
			return  result.toString();	
		}
		
		else {
			session.setAttribute("user", user);
			result.put("msg", "success");
			return result.toString();
		}
		
	}
	
	/*
	 * 登出
	 */
	@RequestMapping("logout")
	public String logout(HttpServletRequest req) {
		HttpSession session  = req.getSession();
		session.removeAttribute("user");
		return "login";
	}
	
	/*
	 * 注册
	 */
	@RequestMapping(value="register_view")
	@ResponseBody
	public String register(String userid,String username,String password,HttpServletRequest request, Model model) {
		HttpSession session =  request.getSession();
		JSONObject result = new JSONObject(); 
		User user = userService.findById(userid);
		if(user != null) {
			result.put("msg", "该用户已存在！");
			return result.toString();
		}
		else {
			session.setAttribute("user", user);
		userService.addOne(userid, username, password);
//		List<String> list = new ArrayList<String>();
//		list.add("success");
//		list.add(user.getUsername());
		
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("msg", "success");
//		map.put("username", user.getUsername());
		
		result.put("data", "success");
		return result.toString();
		
		}		
	}
	
	
	/*
	 * 首页获取用户姓名
	 */
	@RequestMapping(value="indexUsername")
	@ResponseBody
	public String indexUsername(HttpServletRequest request) {
		HttpSession session =  request.getSession();
		JSONObject result = new JSONObject();
		User user = (User) session.getAttribute("user");
		if(user==null) {
			result.put("username", "请登录！");
			return result.toString();	
		}
		else {
		result.put("username", user.getUsername());
		return result.toString();
		}		
	}
	/*
	 *跳转到主页
	 *time:2019/26 20:11
	 */
	@RequestMapping(value="index")
	public String index(HttpServletRequest request,Model model) {
		HttpSession session =  request.getSession();
		User user = (User) session.getAttribute("user");
		if(user==null) {
			
			model.addAttribute("msg", "请登录");
		}
		else {
			List<Integer> authIdlist =  roleAuthService.findAid(userRoleService.findRid(user.getUserid()));//获取权限id集合
		
			Map<String,Object> map = new HashMap<String,Object>();
			for(int i = 0;i<authIdlist.size();i++) {//循环权限id
				String authName = authService.findAname(authIdlist.get(i));
				List<Integer> funIdlist = authFunService.findFid(authIdlist.get(i));//获取功能id
				List<Function> functions = new ArrayList<Function>();//功能集合
				if(funIdlist.isEmpty()) {
					functions = null;
					map.put(authName, functions);
					
					continue;
				}
				else {
				 functions = functionService.findFnameAndUrl(funIdlist);
				}
				map.put(authName, functions);
				
				}
			model.addAttribute("map", map);  
		}
		return "index";
		
	}
}
