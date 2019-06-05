package com.banksteel.service;

import java.util.List;

import com.banksteel.domain.Function;

public interface FunctionService {
	
	public List<Function> findFnameAndUrl(List<Integer> fid);
	
	public List<Function> finFunctionAll();

}
