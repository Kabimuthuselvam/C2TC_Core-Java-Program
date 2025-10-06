package com.tnsif.contsructor.example;

public class student {
	private int sid;
	private String name;
	public student() 
	//dafault
	{
		this.sid=45;
		this.name="kitheyon";
	}
	//parameterized
	public student(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", name=" + name + "]";
	}

}
