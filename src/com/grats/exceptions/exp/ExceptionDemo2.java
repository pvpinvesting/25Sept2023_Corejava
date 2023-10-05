package com.grats.exceptions.exp;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a=100;
			int[] arr= {3,2,23,434};
			int d=0;
			int index=10;
			try {
				if(arr.length>index) {
					int c=arr[index];
					throw new ArrayIndexOutOfBoundsException("trying to access out of the index");
				}
				
				if(d==0) {
					throw new MyException("Can't divide by zero");
//					throw new ArithmeticException();
//					System.out.println(":d:"+d);
					
//					throw new ArithmeticException("Can't divide by zero");
				}
				
				int b=a/d;
				
//				throw new ArithmeticException();
//				
//				int c=arr[1];
//				Class.forName("com.grats.st.variable.Company");
				
			}catch(MyException ex) {
				System.out.println(":Msg:"+ex.getMessage());
				
			}catch(Exception ex) {
				System.out.println(":Msg:"+ex.getMessage());
				ex.printStackTrace();
			}
		
	}

}
