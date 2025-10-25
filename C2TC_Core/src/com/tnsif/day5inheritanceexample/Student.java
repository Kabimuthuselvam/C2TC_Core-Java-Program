package com.tnsif.day5inheritanceexample;

public class Student extends College {
	private String Course;
	private String Name;
	private int id;
	public Student(String CollegeName, String CollegeLocation, String Course, String Name, int id) {
		super(CollegeName, CollegeLocation);
		this.Course = Course;
		this.Name = Name;
		this.id = id;
	}
	
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
		return "Student [Course=" + Course + ", Name=" + Name + ", id=" + id + ",]";
	}
}
