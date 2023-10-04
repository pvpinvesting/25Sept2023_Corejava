package com.grats.am.constructor;

public class CompanySamePkg {

	public CompanySamePkg() {
//		super("TCS","Hyderabad");
//		super("Infosys");
//		super(20000);
//		super("Grats","Bangalore",2000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company companyObj1=new Company("TCS","Hyderabad");
		System.out.println(":companyObj1:"+companyObj1);
//		
		Company companyObj2=new Company("Infosys");
		System.out.println(":companyObj2:"+companyObj2);
//		
		Company companyObj3=new Company(20000);
		System.out.println(":companyObj3:"+companyObj3);
		
//		Company companyObj4=new Company("Grats","Bangalore",2000);
//		System.out.println(":companyObj4:"+companyObj4);
		
		CompanySamePkg obj=new CompanySamePkg();
		System.out.println(":obj:"+obj);
	}

}
