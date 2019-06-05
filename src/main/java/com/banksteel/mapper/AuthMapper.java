package com.banksteel.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.banksteel.domain.Authority;

@Mapper
public interface AuthMapper {
	
	
	public List<String> findAnames(List<Integer> aids);
	
	public String findAname(@Param(value="aid")Integer aid);
	
	public void addAuth(String aname); 
	
	public List<Authority> findAll();
	
	public String findAid(String aname);

}
