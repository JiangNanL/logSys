package com.banksteel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banksteel.domain.Authority;
import com.banksteel.mapper.AuthMapper;
import com.banksteel.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private AuthMapper authMapper;


	@Override
	public List<String> findAnames(List<Integer> aid) {
		
		return authMapper.findAnames(aid);
	}


	@Override
	public String findAname(Integer aid) {
		
		return authMapper.findAname(aid);
	}


	@Override
	public void addAuth(String aname) {
		authMapper.addAuth(aname);
	}


	@Override
	public List<Authority> findAll() {
		
		return authMapper.findAll();
	}


	@Override
	public String findAid(String aname) {
		
		return authMapper.findAid(aname);
	}

}
