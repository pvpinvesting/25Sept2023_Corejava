package com.grats.exceptions.exp;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		String msg;
		try {
//			int b=a/0;
//			System.out.println(":b:"+b);
//			try {
//				
//			}
			int[] arr=new int[5];
			try {
				System.out.println(arr[10]);
			}catch(Exception ex) {
				ex.printStackTrace();
//				System.out.println(""+ex.getCause());
				msg="Invalid index used for read array";
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Inside catch");
		}finally {
			System.out.println("inside finally block");
		}
//		return msg;

	}

}
