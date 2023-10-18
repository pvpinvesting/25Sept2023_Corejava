package com.grats.thread;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			public void run() {
				System.out.println(":Task is executing:");
			}
		};
		timer.scheduleAtFixedRate(task, 1000, 3000);
	}

}
