package com.buaa.SynchronizedThread;

//��д�������߳���  
//�������߳�Ҫִ�е�����
public class Producer implements Runnable { 
	private Clerk clerk;
	public Producer() {
		super();
	}
	public Producer(Clerk clerk) {
		super();
		this.clerk = clerk;
	}
	public void run() {
		System.out.println("�����߿�ʼ������Ʒ");
		for (int i = 0; i < 15; i++) {
			// ע��˴���ѭ������һ��Ҫ����pro����ĳ��ȣ�10��
			Products pd = new Products(i);
			clerk.addProduct(pd);// ������Ʒ
			System.out.println("�����ˣ�" + pd);
			try { // ˯��ʱ�������������ֵ������
				Thread.sleep((int) (Math.random() * 10) * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}