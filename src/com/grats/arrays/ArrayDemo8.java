package com.grats.arrays;

public class ArrayDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrNames=new String[] {"user1","user2","user3"};
		String str=arrNames[2];
//		System.out.println(str);
		arrNames[2]="user5";
//		System.out.println(arrNames[2]);
		for(int i=0;i<arrNames.length;i++) {
			System.out.print(arrNames[i]+" ");
		}
//		arrNames=new String[] {"user4","user5","user6"};

	}

}
