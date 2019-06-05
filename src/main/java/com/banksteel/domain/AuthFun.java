package com.banksteel.domain;

public class AuthFun {
	private int id;//连接表id
	private int aid;//权限id
	private int fid;//功能id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	@Override
	public String toString() {
		return "AuthFun [id=" + id + ", aid=" + aid + ", fid=" + fid + "]";
	}
	
	
}
