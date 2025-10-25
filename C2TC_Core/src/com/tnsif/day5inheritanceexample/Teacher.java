package com.tnsif.day5inheritanceexample;

public class Teacher extends Students {
	private int id;
	private String session;
	private String desig;
	
	public Teacher(int id, String session, String desig) {
		super(id, desig);
		this.id = id;
		this.session = session;
		this.desig = desig;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", session=" + session + ", desig=" + desig + "]";
	}
	

}
