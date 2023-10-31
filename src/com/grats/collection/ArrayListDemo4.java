package com.grats.collection;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namesList=new ArrayList<>();
		namesList.add("Sachin");
		namesList.add("Kohli");
		namesList.add("sehwag");
		namesList.add("Dhoni");
		namesList.add("RohitSharma");
		namesList.add("Ganguly");
		System.out.println(":namesList:"+namesList);
		namesList.add(2, "Dravid");
		System.out.println(":namesList:"+namesList);
//		namesList.clear();
		System.out.println(":namesList:"+namesList);
		namesList.ensureCapacity(200);
		System.out.println(":namesList:"+namesList);
		namesList.remove("sehwag");
		System.out.println(":namesList:"+namesList);
		
		//is Sachin presen in collection
		if(namesList.contains("Sachin")) {
			System.out.println(":Present:");
		}else {
			System.out.println(":Not Present:");
		}
		namesList.clear();
		System.out.println(":namesList:"+namesList);
		if(namesList.isEmpty()) {
			System.out.println(":Empty:");
		}else {
			System.out.println(":Not Empty:");
		}
		
	}

}
