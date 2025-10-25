package com.tnsif.day5inheritanceexample;

public class EXecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person P = new person("Kabilan",20,"VPM");
		System.out.println(P);
		
		Students s = new Students(21,"JAVA");
		System.out.println(s);
		
		Teacher T = new Teacher(21,"Morning","JAVA Core");
		System.out.println(T);

	}

}
