package com.dal.threadExample;

public class TestMyThread {
	public static void main(String args[]) {
		MyThread t = new MyThread(5);
		System.out.println("线程名:" + t.getName());// 得到线程的名字
		// 线程t没有启动，t.isAlive()得值为false
		System.out.println("线程启动?	" + t.isAlive());
		t.start();// 线程t已启动，t.isAlive()得值为true

			System.out.println("线程启动?	" + t.isAlive());
			System.out.println("线程是否中断?" + t.isInterrupted());
			t.interrupt();
			System.out.println("线程是否中断?" + t.isInterrupted());

	}
}

class MyThread extends Thread {
	MyThread(int priority) {
		setPriority(priority);
		setName("MyThread-" + priority);
	}

	public void run() {
		System.out.println(getName() + "运行");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("线程休眠时调用interrupt()方法会抛出异常");
		}
		System.out.println(getName() + "结束!");
	}
}
