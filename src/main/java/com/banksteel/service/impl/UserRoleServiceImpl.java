package com.banksteel.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.banksteel.mapper.UserRoleMapper;
import com.banksteel.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {
	
	@Autowired
	private UserRoleMapper userRoleMapper;

	@Override
	public int findRid(String uid) {
		
		return userRoleMapper.findRid(uid);
	}

	

}
