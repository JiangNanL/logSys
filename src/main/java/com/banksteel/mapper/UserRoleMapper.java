package com.banksteel.mapper;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserRoleMapper {
	
	public int findRid(String uid);

}
