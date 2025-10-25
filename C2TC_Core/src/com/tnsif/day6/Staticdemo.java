package com.tnsif.day6;

public class Staticdemo {
	{
		System.out.println("Instance Bolck");
	}
	static
	{
		System.out.println("New Code");
	}
	public static void main(String[] args) {
	Staticdemo s1 = new Staticdemo();
	
	
		{
			System.out.println("main block");
		}}
	static
	{
		System.out.println("Welcome to core java");
	}
	}
