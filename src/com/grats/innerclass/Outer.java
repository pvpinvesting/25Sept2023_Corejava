package com.grats.innerclass;

public class Outer {
	
	int compId=1001;
	String compName="Grats";
	
	void show() {
		System.out.println(":Outer:Inside show():");
	}
	
	static class Inner{
		int deptId;
		String deptName;
		void display() {
			System.out.println(":Inner:Inside show():");
//			System.out.println(":compId:"+compId+":compName:"+compName);
		}
	}
	
	void funOuter() {
		class InnerLocal{
			int num=3001;
			String name="funOuter";
			void config() {
				System.out.println(":Config inside local inner class:");
			}
		}
		InnerLocal obj3=new InnerLocal();
		obj3.config();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		obj.show();
		obj.funOuter();
		
//		Outer.Inner obj1=obj.new Outer.Inner();
//		obj1.display();
	}

}
