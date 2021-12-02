package com.buaa.SynchronizedThread;

public class Clerk {  
	int index = 0;// Ĭ��Ϊ0����Ʒ
	Products[] pro = new Products[10];
	// ���������������Ĳ�Ʒ������Ա
	public synchronized void addProduct(Products pd) {
		while (index == pro.length) {
			try {
				this.wait();// ��Ʒ���������Ժ�������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();// ֪ͨ�ȴ����������߿���ȡ��Ʒ��
		pro[index] = pd;
		index++;
	}

	// �����ߴӵ�Ա��ȡ��Ʒ
	public synchronized Products getProduct() {
		while (index == 0) {
			try {
				this.wait(); // ȱ�������Ժ���ȡ��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();// ֪ͨ�ȴ����������߿���������Ʒ��
		index--;
		return pro[index];
	}
}
