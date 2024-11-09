package com.score.lifcycle;

public class department {
	
	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "department [dname=" + dname + "]";
	}
	public void init() {
		System.out.println("Init Department");
	}
	public void destroy() {
		System.out.println("Destroy Department");
	}
	

}
