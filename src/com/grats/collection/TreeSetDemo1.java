package com.grats.collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> namesList=new TreeSet<>();
//		namesList.add(null);
		namesList.add("Sachin");
		namesList.add("Kohli");
		namesList.add("sehwag");
		namesList.add("Dhoni");
		namesList.add("RohitSharma");
		namesList.add("Ganguly");
		namesList.add("Dravid");
		namesList.remove("sehwag");
		namesList.add("Dhoni");
		namesList.add("Sachin");
		System.out.println(":namesList:"+namesList);
		System.out.println(":first:"+namesList.first());
		System.out.println(":last:"+namesList.last());
		System.out.println(":tailSet:"+namesList.tailSet("Ganguly"));
		
		

	}

}
