package com.grats.am.interview;

public class A {
	
	int i,j;
	void outerClassMethod() {
		System.out.println(":Inside outerClassMethod():");
	}
	
	private class Inner{
		void innerClassMethod() {
			System.out.println(":Inside innerClassMethod():");
		}
	}
	protected class Inner2{
		void inner2ClassMethod() {
			System.out.println(":Inside innerClassMethod():");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.Inner innerClsObj=new A().new Inner();
		innerClsObj.innerClassMethod();
		
		A.Inner2 inner2ClsObj=new A().new Inner2();
		inner2ClsObj.inner2ClassMethod();
		
		A outerClsObj = new A();
		outerClsObj.outerClassMethod();
	}

}
