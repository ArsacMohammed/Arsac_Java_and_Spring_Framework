package com.Arsac.springMVCBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity   // we pass the method as entity.
public class Alien {
	
	
	public Alien() {
	}
	
	public Alien(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	@Id
	int aid;
	String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
}
