package com.banksteel.domain;

/*
 * 用户角色关系实体类
 */
public class UserRole {
	private int id;//id
	private String uid;//用户id
	private int rid;//角色id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", uid=" + uid + ", rid=" + rid + "]";
	}
	

}
