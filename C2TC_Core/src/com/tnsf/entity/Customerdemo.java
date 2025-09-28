package com.tnsf.entity;

public class Customerdemo {
public static void main(String[] args) {
	Customer c1 = new Customer();
	c1.setId(101);
	c1.setName("RAJA");
	c1.setPlace("Villupuram");
	System.out.println("id:"+c1.getId()+" name:"+c1.getName()+" city:"+c1.getPlace());

	Customer c2 = new Customer();
	c2.setId(102);
	c2.setName("RAVI");
	c2.setPlace("Villupuram");
	System.out.println("id:"+c2.getId()+" name:"+c2.getName()+" city:"+c2.getPlace());
}
}
