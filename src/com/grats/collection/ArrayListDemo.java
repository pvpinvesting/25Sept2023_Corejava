package com.grats.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al=new ArrayList();
		al.add(1001);
		al.add("Grats");
		al.add(5000.00);
		
		System.out.println(":0:"+al.get(0));
		System.out.println(":1:"+al.get(1));
		System.out.println(":2:"+al.get(2));
		System.out.println(":========================>:");
		for(int k=0;k<al.size();k++) {
			System.out.println("::"+al.get(k));
		}
		System.out.println(":========================>:");
		
		for(Object ele:al) {
			System.out.println(ele);
		}
		
		//for(datatye name:al){
//	}
		
		
//		String[] names= new String[100];
//		
////		System.out.println(names[0]);
////		System.out.println(names[1]);
////		System.out.println(names[2]);
////		System.out.println(names[3]);
////		System.out.println(names[4]);
//		
//		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
//		}
//		
		

	}

}
