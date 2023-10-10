package com.grats.arrays;

public class ArrayDeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {5,6,9,4};
		int[] arr2=arr1.clone(); // Deep copy
		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(":arr1:"+arr1[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<arr2.length;i++) {
//			System.out.print(":arr2:"+arr2[i]+" ");
//		}
		System.out.println();
		System.out.println("==============================");
		arr1[2]=14;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(":arr1:"+arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(":arr2:"+arr2[i]+" ");
		}
//		
//		int[] arr3=new int[arr2.length];
//		for(int i=0;i<arr3.length;i++) {
//			arr3[i]=arr2[i];
//		}
//		System.out.println();
//		System.out.println("==============================");
//		arr3[2]=1426;
//		arr2[3]=232;
//		for(int i=0;i<arr2.length;i++) {
//			System.out.print(":arr2:"+arr2[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<arr3.length;i++) {
//			System.out.print(":arr3:"+arr3[i]+" ");
//		}
	}

}
