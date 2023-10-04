package com.grats.am.constructor;

public class Company {
	
	public String cmpName="Wipro";
	public String address="Bangalore";
	public int noOfEmployees=1000;
	
	public Company(String cmpName,String address) {
		this.cmpName=cmpName;
		this.address=address;
	}
	
	protected Company(String cmpName){
		this.cmpName=cmpName;
	}
	
	Company(int noOfEmployees){
		this.noOfEmployees=noOfEmployees;
	}

	private Company(String cmpName,String address,int noOfEmployees) {
		this.cmpName=cmpName;
		this.address=address;
		this.noOfEmployees=noOfEmployees;
	}
	
	@Override
	public String toString() {
		return "Company [cmpName=" + cmpName + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company companyObj1=new Company("TCS","Hyderabad");
		System.out.println(":companyObj1:"+companyObj1);
		
		Company companyObj2=new Company("Infosys");
		System.out.println(":companyObj2:"+companyObj2);
		
		Company companyObj3=new Company(20000);
		System.out.println(":companyObj3:"+companyObj3);
		
		Company companyObj4=new Company("Grats","Bangalore",2000);
		System.out.println(":companyObj4:"+companyObj4);
	}

}
