package com.dal.threadExample;

import java.util.Timer;
import java.util.TimerTask;
public class Machine1 extends Thread {
	private int a;
	public void start() {
		super.start();
		// 把与Timer关联的线程设为后台线程
		Timer timer = new Timer(true);
		// 匿名类
		TimerTask task = new TimerTask() {
			public void run() {
				reset();
			}
		};
		// 设置定时任务
		timer.schedule(task, 10, 50);
	}

	public void reset() {
		a = 0;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + ":" + a++);
			yield();
		}
	}

	public static void main(String args[]) throws Exception {
		Machine1 machine = new Machine1();
		machine.start();
	}
}
