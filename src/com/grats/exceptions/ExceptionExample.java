package com.grats.exceptions;

public class ExceptionExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int num=100;
		String name="prakash";		
		System.out.println("name:"+name);
//		A obj=new A();
		
		
		
//		Class.forName("com.grats.st.variable.Company");
		try {
			
			System.out.println("num:"+num);
			int a=num/0;
			int b=a+num;
//			System.out.println(":b:"+b);
		}catch(Exception e) {
			System.out.println("Exception raised"+e.getMessage());
//			e.printStackTrace();
		}
		int sum=num+19;
		System.out.println(sum);
		String obj1="";
		obj1 = obj1.concat("abc0");
		System.out.println(obj1);
		
//		String obj2="12adb";
//		Integer obj3=Integer.parseInt(obj2);
//		System.out.println(obj3);
		
//		int[] arr= {4,6,7,10};
//		System.out.println(""+arr[6]);
		
	}

}
