package com.grats.exceptions.exp;

public class ThrowsDemo1 {
	public void printMsg() throws Exception {
		System.out.println("Inside printMsg():");
		
		int a=100;
		int[] arr= {3,2,23,434};
			int b=a/100;
			int c=arr[1];
//			try {
				Class.forName("com.grats.st.variable.Company");
//			}catch(ClassNotFoundException e) {
//				e.printStackTrace();
//			}
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThrowsDemo1 obj=new ThrowsDemo1();
		try {
			obj.printMsg();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(MyException ex) {
			ex.printStackTrace();
		}
	}
}
