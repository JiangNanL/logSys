package com.banksteel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banksteel.domain.User;
import com.banksteel.mapper.UserMapper;
import com.banksteel.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		
		return null;
	}

	@Override
	public User findOne(String userid, String password) {
	
		return userMapper.findOne(userid, password);
	}

	@Override
	public User findById(String userid) {
		
		return  userMapper.findById(userid);
	}

	@Override
	public User findByPw(String password) {
	
		return userMapper.findByPw(password);
	}

	@Override
	public void addOne(String userid, String username, String password) {
		userMapper.addOne(userid, username, password);
		
	}



}
