package com.SpringCore.SpringCore;

public class Student {
	private int sid;
	private String sName;
	private String sAddress;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sName, String sAddress) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sAddress = sAddress;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
	
	
}
