package com.banksteel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.banksteel.domain.Function;


@Mapper
public interface FunctionMapper {
	
	public List<Function> findFnameAndUrl(List<Integer> list);
	
	public List<Function> finFunctionAll();

}
