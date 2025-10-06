package com.tnsif.contsructor.example;

public class Studentdemo {

	public static void main(String[] args) {
		student S1=new student();
		
		S1.setSid(39);
		S1.setName("Kabilan");
		System.out.println(S1);
		
		student S2=new student();
		System.out.println(S2);
		
		student S3=new student(44,"kishore");
		System.out.println(S3);
		
	

	}

}
