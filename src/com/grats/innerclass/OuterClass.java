package com.grats.innerclass;

public class OuterClass {
	
	String name="prakash";
	
	void methodA() {
		System.out.println("Inside methodA():");
	}
	
	private static class InnerClass{
		int id=1001;
		void methodB() {
			System.out.println("Inside methodB():name:");
		}
	} //member innerclass
	
	void methodC() {
		class LocalInnerClass{
			String name="xyz";
			void methodD() {
				System.out.println("Inside methodD");
			}
		}
		LocalInnerClass obj=new LocalInnerClass();
		obj.methodD();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass obj=new OuterClass();
		obj.methodA();
		
//		OuterClass.InnerClass obj1=obj.new InnerClass();
//		OuterClass.InnerClass obj2=new OuterClass().new InnerClass();
		OuterClass.InnerClass obj2=new OuterClass.InnerClass();
		obj2.methodB();
		
		obj.methodC();
		
		
	}

}
