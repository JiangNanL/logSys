package com.banksteel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RoleAuthMapper {
	
	public List<Integer> findAid(int rid); 

}
