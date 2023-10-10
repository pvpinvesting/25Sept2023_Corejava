package com.grats.arrays;

import java.util.Arrays;

public class ArraysDemo6 {
	int[] rollNos= {1001,1002,1003,1004,1005};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int intArr[] = { 10, 20, 15, 22, 35 }; 
        
        // To convert the elements as List 
//        System.out.println("Integer Array as List: "
//                           + Arrays.asList(intArr)); 
        
        System.out.println(Arrays.toString(intArr));
        
        Arrays.sort(intArr); 
//        
        for(int i=0;i<intArr.length;i++) {
        	System.out.print(intArr[i]+" ");
        }
        System.out.println();
        int eleIndex = Arrays.binarySearch(intArr, 22);
        System.out.println(":Given element index:"+eleIndex);
        
       
        
	}
	
}
