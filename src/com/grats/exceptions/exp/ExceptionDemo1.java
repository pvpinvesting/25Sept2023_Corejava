package com.grats.exceptions.exp;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int[] arr= {3,2,23,434};
		try {
			int b=a/100;
			int c=arr[1];
			Class.forName("com.grats.st.variable.Company");
		}catch(Throwable ex) {
			ex.printStackTrace();
		}
//		catch(Exception ex) {
//			System.out.println("====?Exception ");
//		}catch(ArithmeticException ex) {
//			System.out.println("===>ArithmeticException");
////			ex.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException ex1) {
//			System.out.println("====?ArrayIndexOutOfBoundsException");
////			ex1.printStackTrace();
//		}

	}

}
