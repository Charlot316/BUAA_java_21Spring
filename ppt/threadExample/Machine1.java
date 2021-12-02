package com.dal.threadExample;

import java.util.Timer;
import java.util.TimerTask;
public class Machine1 extends Thread {
	private int a;
	public void start() {
		super.start();
		// ����Timer�������߳���Ϊ��̨�߳�
		Timer timer = new Timer(true);
		// ������
		TimerTask task = new TimerTask() {
			public void run() {
				reset();
			}
		};
		// ���ö�ʱ����
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
