package com.dal.threadExample;

import java.util.*;

class TimePrinter3 extends Thread {
	int pauseTime;
	String name;

	public TimePrinter3(int x, String n) {
		pauseTime = x;
		name = n;
	}

	public void run() {
		while (true) {
			System.out.println(name + ":"
					+ new Date(System.currentTimeMillis()));
			Thread.yield();//or yield();
		}
	}

	static public void main(String args[]) {
		TimePrinter tp1 = new TimePrinter(1000, "Fast Guy");
		// tp1.start();
		TimePrinter tp2 = new TimePrinter(3000, "Slow Guy");
		tp2.start();
		tp1.start();
	}
}
