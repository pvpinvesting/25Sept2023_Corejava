package com.grats.exceptions.exp;

public class FinallyDemo1 {
	
	public Boolean isEven(int num) {
		System.out.println(":getMessage:Start:");
		try {
			System.out.println(":try block start:");
			if(num%2==0) {
				System.exit(0);
				return true;
			}
			System.out.println(":try block end:");
		}catch(Exception e) {
			System.out.println(":Inside catch:");
		}
		finally {
			System.out.println(":Inside finally block:");
		}
		System.out.println(":getMessage:End:");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyDemo1 obj=new FinallyDemo1();
		Boolean flag=obj.isEven(10);
//		System.out.println(flag);
		if(flag) {
			System.out.println("Given number is an even number");
		}else {
			System.out.println("Given number is not an even number");
		}
	}
}
