package com.banksteel.service;


import java.util.List;
import com.banksteel.domain.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findOne(String userid,String password);
	
	public User findById(String userid);
	
	public User findByPw(String password);
	
	public void addOne(String userid,String username,String password);

}
