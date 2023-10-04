package com.grats.innerclass;

public class AbstractDemo1Impl extends AbstractDemo1 {

	@Override
	public void funA() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo1 obj=new AbstractDemo1() {
			public void funA() {
				System.out.println("Inside funA");
			}
		};
		obj.funA();
		
		InterfaceDemo obj2=new InterfaceDemo() {
			public void methodInterfaceDemo() {
				System.out.println("Inside methodInterfaceDemo");
			}
		};
		obj2.methodInterfaceDemo();
	}

}
