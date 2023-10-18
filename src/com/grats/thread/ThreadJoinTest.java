package com.grats.thread;

public class ThreadJoinTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ThreadJoin1 t1=new ThreadJoin1();
		ThreadJoin2 t2=new ThreadJoin2();
		ThreadJoin3 t3=new ThreadJoin3(t1,t2);
		t1.start();
		t2.start();
		t3.start();

	}

}
