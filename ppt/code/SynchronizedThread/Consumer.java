package com.buaa.SynchronizedThread;

//��д�������߳���  
public class Consumer implements Runnable {
	private Clerk clerk;
	public Consumer() {
		super();
	}
	public Consumer(Clerk clerk) {
		super();
		this.clerk = clerk;
	}
	public void run() {
		System.out.println("�����߿�ʼȡ�߲�Ʒ");
		for (int i = 0; i < 15; i++) {
			// ע��˴���ѭ������һ��Ҫ����pro����ĳ��ȣ�10��
			// ȡ��Ʒ
			Products pd = clerk.getProduct();
			System.out.println("�����ˣ�" + pd);
			try { // ˯��ʱ�������������ֵ������
				Thread.sleep((int) (Math.random() * 10) * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}