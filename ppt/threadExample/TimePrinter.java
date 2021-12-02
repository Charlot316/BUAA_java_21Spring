package com.dal.threadExample;

import java.util.*;

class TimePrinter extends Thread {
	int pauseTime;
	String name;

	public TimePrinter(int x, String n) {
		pauseTime = x;
		name = n;
	}

	public void run() {
		while (true) {
			try {
				System.out.println(name + ":"
						+ new Date(System.currentTimeMillis()));
				Thread.sleep(pauseTime);//Thread可以省略，调用父类Thread的sleep()
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	static public void main(String args[]) {
		TimePrinter tp1 = new TimePrinter(1000, "Fast Guy");
		tp1.start();
		TimePrinter tp2 = new TimePrinter(3000, "Slow Guy");
		tp2.start();
	}
}
