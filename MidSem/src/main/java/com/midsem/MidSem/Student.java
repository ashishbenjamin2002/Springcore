package com.midsem.MidSem;



import java.util.List;

public class Student {

		private List<String> Roll;
		private String Sname;
		private String Course;
		
		
		public List<String> getRoll() {
			return Roll;
		}
		public void setRoll(List<String> roll) {
			Roll = roll;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}
		public String getCourse() {
			return Course;
		}
		public void setCourse(String course) {
			Course = course;
		}
		@Override
		public String toString() {
			return "Student [Roll=" + Roll + ", Sname=" + Sname + ", Course=" + Course + "]";
		}

		
		
	

}

