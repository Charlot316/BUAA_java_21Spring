package com.dal.threadExample;

public class TestMyThread {
	public static void main(String args[]) {
		MyThread t = new MyThread(5);
		System.out.println("�߳���:" + t.getName());// �õ��̵߳�����
		// �߳�tû��������t.isAlive()��ֵΪfalse
		System.out.println("�߳�����?	" + t.isAlive());
		t.start();// �߳�t��������t.isAlive()��ֵΪtrue

			System.out.println("�߳�����?	" + t.isAlive());
			System.out.println("�߳��Ƿ��ж�?" + t.isInterrupted());
			t.interrupt();
			System.out.println("�߳��Ƿ��ж�?" + t.isInterrupted());

	}
}

class MyThread extends Thread {
	MyThread(int priority) {
		setPriority(priority);
		setName("MyThread-" + priority);
	}

	public void run() {
		System.out.println(getName() + "����");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("�߳�����ʱ����interrupt()�������׳��쳣");
		}
		System.out.println(getName() + "����!");
	}
}
