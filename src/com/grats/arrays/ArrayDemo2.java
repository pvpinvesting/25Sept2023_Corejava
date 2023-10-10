package com.grats.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		int[] rollNos;
		int[] rollNos= {1001, 1002,1003,1004,1005}; // Quick array initialization
//		rollNos={1001, 1002,1003,1004,1005};  // this way is not possible.
		String names[] = new String[]{"User1","User2","User3","User4","User5"};
//		names=new String[]{"User1","User2","User3","User4"}; //This is possible
		
		
//		int []phoneNos;
		int phoneNos [];
		
		int size=5; 
//		long size=5; // Can't define the array of size by long value
		phoneNos=new int[size]; 
		
		//Modify the array
//		phoneNos[0]=987000;
//		phoneNos[1]=987001;
//		phoneNos[2]=987002;
//		phoneNos[3]=987003;
//		phoneNos[4]=987004;
		
		//or
		
		for(int i=0;i<phoneNos.length;i++) {
			phoneNos[i]=987000+i;
			System.out.println(phoneNos[i]);
		}

		System.out.println("===================Print User Details=====================");
		for(int i=0;i<rollNos.length;i++) {
			System.out.println(rollNos[i]+" "+names[i]+" "+phoneNos[i]); //accessing the array
		}
		System.out.println("===================Print User Details=====================");
		
	}

}
