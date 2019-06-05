package com.banksteel.domain;

public class Function {
	private int fid;//功能id
	private String fname;//功能名
	private String url;//功能url
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Function [fid=" + fid + ", fname=" + fname + ", url=" + url + "]";
	}
	

}
