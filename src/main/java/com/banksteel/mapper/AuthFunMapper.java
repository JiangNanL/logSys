package com.banksteel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthFunMapper {
	
	public List<Integer> findFid(int aid);
	
	public void insertAuthFun(int aid,int fid);

}
