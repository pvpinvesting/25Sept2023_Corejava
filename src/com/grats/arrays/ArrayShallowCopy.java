package com.grats.arrays;

public class ArrayShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {5,6,9,4};
		int[] arr2=arr1; // Shollow copy
		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(":arr1:"+arr1[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<arr2.length;i++) {
//			System.out.print(":arr2:"+arr2[i]+" ");
//		}
		
		System.out.println("==============================");
		arr2[2]=14;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(":arr1:"+arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(":arr2:"+arr2[i]+" ");
		}
	}

}
