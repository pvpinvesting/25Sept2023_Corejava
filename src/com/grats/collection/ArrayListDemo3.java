package com.grats.collection;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> namesList=new ArrayList<>(100);
		namesList.add("Sachin");
		namesList.add("Sachin1");
		namesList.add("Sachin2");
		namesList.add("Sachin3");
		namesList.add("Sachin4");
		namesList.add("Sachin");
		namesList.add("Sachin5");
		namesList.add("Sachin7");
		namesList.add("Sachin9");
		System.out.println(":size:"+namesList.size());
		System.out.println(":namesList:"+namesList);
		ArrayList<String> namesList2=new ArrayList<>(namesList);
		System.out.println(":namesList2:"+namesList2);
		ArrayList<String> professionList=new ArrayList<>();
		professionList.add("Sales");
		professionList.add("Sales");
		professionList.add("Sales");
		
		namesList2.addAll(professionList);
		System.out.println(":namesList2:"+namesList2);
		
	}

}
