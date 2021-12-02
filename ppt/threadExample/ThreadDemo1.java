package com.dal.threadExample;

public class ThreadDemo1 {
	public static void main(String[] args) {
		TestThread2 tt = new TestThread2();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
}

class TestThread2 implements Runnable {
	int tickets = 100;
	String str = new String("hello");

	public void run() {
		// String str=new String("hello"); //这样不可以，因为str每次是一个新的对象所以要使用全局的str
		while (true) {
			synchronized (str) {
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
	}
}