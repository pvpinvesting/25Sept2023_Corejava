package com.grats.object;

public class VarArgsDemo1 {

	public int sum(String name,int... args) {
//		return a+b+c;
		System.out.println("name:"+name);
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=args[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {24,345,4,2,};
		
		VarArgsDemo1 obj=new VarArgsDemo1();
		int sum1=obj.sum("sum",23,34,45,2234);
		int sum2=obj.sum("sum",new int[] {23,24,3634,324});
		System.out.println(sum1);
		System.out.println(sum2);
		int sum3=obj.sum("sum",nums);
		System.out.println(sum3);
	}

}
