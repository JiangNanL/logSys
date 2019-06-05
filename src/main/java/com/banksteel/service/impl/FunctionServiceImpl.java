package com.banksteel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banksteel.domain.Function;
import com.banksteel.mapper.FunctionMapper;
import com.banksteel.service.FunctionService;

@Service
public class FunctionServiceImpl implements FunctionService {
	
	@Autowired
	private FunctionMapper functionMapper;

	@Override
	public List<Function> findFnameAndUrl(List<Integer> fid) {
		
		return functionMapper.findFnameAndUrl(fid);
	}

	@Override
	public List<Function> finFunctionAll() {
		
		return functionMapper.finFunctionAll();
	}

}
