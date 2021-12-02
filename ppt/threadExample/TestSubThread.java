package com.dal.threadExample;

import java.util.*;

public class TestSubThread {
	public static void main(String args[])// throws InterruptedException
	{
		SubThread1 t1 = new SubThread1("线程_1");
		SubThread1 t2 = new SubThread1("线程_2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "方法运行完毕！");
	}
}

class SubThread1 extends Thread {
	String str;

	public SubThread1(String s) {
		str = s;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			for (long j = 1; j < 100000000; j++)
				;
			System.out.println(str + ": 第" + i + "次运行");
		}
		System.out.println(str + ": 结束！");
	}
}
