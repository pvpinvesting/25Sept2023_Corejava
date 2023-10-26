package com.grats.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> idsList=new ArrayList<>();
		idsList.add(1001);
//		idsList.add("Grats");
//		idsList.add(5000.00);
		idsList.add(1002);
		idsList.add(1003);
		idsList.add(1004);
		idsList.add(1001);
		
		for(Integer ids:idsList) {
			System.out.println(":ids:"+ids);
		}
		
//		Integer num=1001;
//		System.out.println(":num:"+num);
		
//		int num1=1001;
	}

}
