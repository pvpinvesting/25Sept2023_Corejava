package com.grats.strings;

public class StringBufferDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(":sb Capacity:"+sb.capacity());
		System.out.println(sb.length());
		
//		StringBuffer sb1 = new StringBuffer(50);
//		System.out.println(":sb1 Capacity:"+sb1.capacity());
		
		for(int i=0;i<50;i++) {
			sb.append(""+i);
			System.out.println(i+":sb Capacity:"+sb.capacity());
		}
		System.out.println(sb);
	}

}
