package com.tnsif.customer1;

public class Customer {
	private int id;
	private String name;
	private String city;
	//default
	public Customer() 
	{
		this.id=45;
		this.name="kitheyon";
		this.city="villupuram";
	}
	//parametric
	public Customer(int id,String name, String city) 
	{
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	

}
