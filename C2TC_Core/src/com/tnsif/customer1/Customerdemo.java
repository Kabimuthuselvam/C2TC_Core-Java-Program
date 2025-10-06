package com.tnsif.customer1;

public class Customerdemo {

	public static void main(String[] args) {
        Customer C1=new Customer();
		
		C1.setId(39);
		C1.setName("Kabilan");
		C1.setCity("villupuram");
		System.out.println(C1);
		
		Customer C2=new Customer();
		System.out.println(C2);
		
		Customer C3=new Customer(44,"kishore","villupram");
		System.out.println(C3);
	}

}
