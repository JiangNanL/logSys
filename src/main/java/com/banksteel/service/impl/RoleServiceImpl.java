package com.banksteel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banksteel.domain.Role;
import com.banksteel.mapper.RoleMapper;
import com.banksteel.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public Role findRname(int rid) {
		
		return roleMapper.findRname(rid);
	}

}
