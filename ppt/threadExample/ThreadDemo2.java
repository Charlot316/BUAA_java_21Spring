package com.dal.threadExample;

public class ThreadDemo2 {
	public static void main(String[] args) {
		TestThread1 tt = new TestThread1();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
}

class TestThread1 implements Runnable {
	int tickets = 100;

	public void run() {
		while (true) {
			sale();
		}
	}

	public synchronized void sale() {
		if (tickets > 0) {
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName()
					+ "is sailing ticket" + tickets--);
		}
	}
}
