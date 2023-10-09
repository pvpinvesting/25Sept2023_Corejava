package com.grats.strings;

public class StringBufferDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       StringBuffer sb1 = new StringBuffer("Hello");
	       sb1.replace(1, 4, "Java");
	        System.out.println(sb1);
	        
	        StringBuffer sb2 = new StringBuffer("Hello");
	        sb2.delete(1, 3);
	        System.out.println(sb2);
//	        
	        StringBuffer sb3 = new StringBuffer("Hello");
	        sb3.reverse();
	        System.out.println(sb3);
	}

}
