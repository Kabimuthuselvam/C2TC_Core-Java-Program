package com.tnsif.day4;

public class privateconstructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			// Can't create object with private constructor
			// MyClass m1=new MyClass();
			
			Myclass m=Myclass.getObject();
			m.setId(10);
			
			Myclass m1=Myclass.getObject();
			
			System.out.println(m);
			System.out.println(m1);
			
		

	}

}
