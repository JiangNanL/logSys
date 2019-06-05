package com.banksteel.domain;

/*
 * 角色 权限关系实体类
 */
public class RoleAuth {

	private int id;
	private int rid;//角色id
	private int aid;//权限id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "RoleAuth [id=" + id + ", rid=" + rid + ", aid=" + aid + "]";
	}
	
}
