package com.banksteel.service;
import java.util.List;

public interface AuthFunService {
	
	public List<Integer> findFid(int aid);

	public String insertAuthFun(String aid, String[] fids);

}
