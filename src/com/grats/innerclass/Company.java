package com.grats.innerclass;

public class Company {
	
	static int compId=1001;
	static String compName="Grats";
	
	void show() {
		System.out.println("show() called");
	}
	
	static class Department{
		static int deptId=2001;
		static String deptName="Sales";
		void printCompanyData() {
			System.out.println(":compId:"+compId+":compName:"+compName+":deptId:"+deptId+":deptName:"+deptName);
		}
	}

	private class Accounts{
		void printAccounts() {
			System.out.println(":Inside accounts:");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company compObj=new Company();
		compObj.show();
		
//		Company.Department deptObj = compObj.new Department();
//		deptObj.printCompanyData();
		
		Company.Department deptObj2 = new Company.Department();
		deptObj2.printCompanyData();
		
		Company.Accounts deptObj3 = compObj.new Accounts();
		deptObj3.printAccounts();
		
	}

}
