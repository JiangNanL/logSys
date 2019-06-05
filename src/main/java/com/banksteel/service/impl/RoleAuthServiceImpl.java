package com.banksteel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.banksteel.mapper.RoleAuthMapper;
import com.banksteel.service.RoleAuthService;

@Service
public class RoleAuthServiceImpl implements RoleAuthService {
	@Autowired
	private RoleAuthMapper roleAuthMapper;

	@Override
	public List<Integer> findAid(int rid) {
		
		return roleAuthMapper.findAid(rid);
	}

}
