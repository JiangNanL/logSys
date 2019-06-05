package com.banksteel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.banksteel.mapper.AuthFunMapper;
import com.banksteel.service.AuthFunService;

@Service
public class AuthFunServiceImpl implements AuthFunService {
	
	@Autowired
	private AuthFunMapper authFunMapper;

	@Override
	public List<Integer> findFid(int aid) {
		
		return authFunMapper.findFid(aid);
	}


	@Override
	public String insertAuthFun(String aid, String[] fids) {
		if (aid!=null && fids!=null) {//如果不为空
		int aids = Integer.parseInt(aid);
		for (int i = 0; i < fids.length; i++) {
			int fid = Integer.parseInt(fids[i]);
			authFunMapper.insertAuthFun(aids, fid);
		}
		return "success";
		}else {
			return null;
	}
		
	}




}
