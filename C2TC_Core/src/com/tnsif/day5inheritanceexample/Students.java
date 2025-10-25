package com.tnsif.day5inheritanceexample;

public class Students extends person {
	private int sid;
	private String course;
	
	public Students(int sid, String course) {
	   super(course, sid, course);
		this.sid = sid;
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", course=" + course + "]";
	}
	

}
