package com.banksteel.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.banksteel.domain.User;

@Mapper
public interface UserMapper {

	public List<User> findAll();
	
	public  User findOne(String userid,String paaword);
	
	public User findById(String userid);
	
	public User findByPw(String password);
	
	public void addOne(@Param(value="userid")String userid,@Param(value="username")String username,@Param(value="password")String password);

	
}
