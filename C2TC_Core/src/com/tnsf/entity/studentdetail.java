package com.tnsf.entity;

public class studentdetail {
	public static void main(String[] args) {
		student S1 = new student();
		S1.setRegno(12345);
		S1.setName("RAVI");
		S1.setDept("ECE");
		S1.setCollege("IFET");
		System.out.println("regno:"+S1.getRegno()+" name:"+S1.getName()+" department:"+S1.getDept()+" College:"+S1.getCollege());

		student S2 = new student();
		S2.setRegno(12346);
		S2.setName("KAVI");
		S2.setDept("ECE");
		S2.setCollege("IFET");
		System.out.println("regno:"+S2.getRegno()+" name:"+S2.getName()+" department:"+S2.getDept()+" College"+S2.getCollege());
	    
		student S3 = new student();
		S3.setRegno(12373);
		S3.setName("ARRUN");
		S3.setDept("CSE");
		S3.setCollege("IFET");
		System.out.println("regno:"+S3.getRegno()+" name:"+S3.getName()+" department:"+S3.getDept()+" College"+S3.getCollege());
	
	}
}
