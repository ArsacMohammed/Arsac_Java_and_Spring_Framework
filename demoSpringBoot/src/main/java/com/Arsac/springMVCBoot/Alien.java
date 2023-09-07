package com.Arsac.springMVCBoot;

public class Alien {
	int id;
	String aname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + "]";
	}
	
}
