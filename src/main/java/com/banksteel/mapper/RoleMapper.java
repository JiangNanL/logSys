package com.banksteel.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.banksteel.domain.Role;

@Mapper
public interface RoleMapper {
	
	public Role findRname(int rid); 

}
