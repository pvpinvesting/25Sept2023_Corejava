package com.grats.methodoverriding;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather obj=new Son();
//		System.out.println(obj.getAssets());
		
		
		
		//Father duties
//		obj.fatherDuties(); Compilation error
		// we need the Father object then do the type casting here
		
		Father father=(Father)obj;
//		father.fatherDuties();
//		
		Son son=(Son)father;
		son.sonDuties();
//		son.gfDuties();
	}

}
