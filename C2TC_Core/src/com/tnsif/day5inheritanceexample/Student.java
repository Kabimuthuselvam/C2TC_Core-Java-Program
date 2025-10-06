package com.tnsif.day5inheritanceexample;

public class Student {
	private String Course;
	private String Name;
	private int id;
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}		
	@Override
	public String toString() {
		return "Student [Course=" + Course + ", Name=" + Name + ", id=" + id + "]";
	}
}
