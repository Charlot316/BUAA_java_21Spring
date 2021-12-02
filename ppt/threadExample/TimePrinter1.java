package com.dal.threadExample;

import java.util.*;

class TimePrinter1 extends Object implements Runnable {
	int pauseTime;
	String name;

	public TimePrinter1(int x, String n) {
		pauseTime = x;
		name = n;
	}

	public void run() {
		while (true) {
			try {
				System.out.println(name + ":"
						+ new Date(System.currentTimeMillis()));
				Thread.sleep(pauseTime);//Static method 类方法 Thread不可以省略
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	static public void main(String args[]) {
		Thread t1 = new Thread(new TimePrinter1(1000, "Fast Guy"));
		t1.start();
		Thread t2 = new Thread(new TimePrinter1(3000, "Slow Guy"));
		t2.start();
	}
}
