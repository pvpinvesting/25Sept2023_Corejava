package com.grats.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo6 {

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
		System.out.println(":namesList:"+namesList);
		ListIterator listIterator=namesList.listIterator();
		System.out.println(":hasPrevious:"+listIterator.hasPrevious());
		while(listIterator.hasNext()) {
			String name=(String)listIterator.next();
			System.out.println(":element:"+name);
			if(name.equals("Dhoni")) {
				listIterator.remove();
				listIterator.add("Samson");
				System.out.println(":prev index:"+listIterator.previousIndex()+":prev element:"+listIterator.previous());
			}
			
			if(name.equals("RohitSharma")) {
				listIterator.set("asdfasdf");
			}
//			System.out.println(":hasPrevious:"+listIterator.hasPrevious());
			System.out.println(":next index:"+listIterator.nextIndex());
		}
		System.out.println(":namesList:"+namesList);
	}

}
