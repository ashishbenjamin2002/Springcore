package com.score.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Ashish Benjamin")
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname) {
		super();
		this.sname = sname;
	}

	

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}

	
	

	
}