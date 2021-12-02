package com.dal.threadExample;

public class Machine extends Thread {
	private int a;
	private static int count;
	public void start() {
		super.start();
		// 匿名线程类
		Thread deamon = new Thread() {
			public void run() {
				while (true) { // 无限循环
					reset();
					try {
						sleep(50);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
			}
		};
		deamon.setDaemon(true);
		deamon.start();
	}
	public void reset() {
		a = 0;
	}
	public void run() {
		while (true) {
			System.out.println(getName() + ":" + a++);
			if (count++ == 100)
				break;
			yield();
		}
	}
	public static void main(String args[]) throws Exception {
		Machine machine = new Machine();
		machine.start();
	}
}
