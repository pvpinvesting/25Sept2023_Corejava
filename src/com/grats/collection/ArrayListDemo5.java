package com.grats.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namesList=new ArrayList<>();
		namesList.add("Sachin");
		namesList.add("Kohli");
		namesList.add("sehwag");
		namesList.add("Dhoni");
		namesList.add("RohitSharma");
		namesList.add("Ganguly");
		namesList.add(2, "Dravid");
		namesList.remove("sehwag");
		System.out.println(":namesList:"+namesList);
		Iterator iterator=namesList.iterator();
//			iterator.remove();
		while(iterator.hasNext()) {
//			iterator.remove();
			String name=(String)iterator.next();
			System.out.println(":element:"+name);
			if(name.equals("Dhoni")) {
				iterator.remove();
			}
		}
		System.out.println(":namesList:"+namesList);
	}

}
