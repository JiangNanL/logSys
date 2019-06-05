package com.banksteel.service;

import java.util.List;

import com.banksteel.domain.Authority;

public interface AuthService {
	
	public List<String> findAnames(List<Integer> aid);
	
	public String findAname(Integer aid);
	
	public void addAuth(String aname); 
	
	public List<Authority> findAll();
	
	public String findAid(String aname);

}
