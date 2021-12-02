package com.buaa.SynchronizedThread;

public class Clerk {  
	int index = 0;// 默认为0个产品
	Products[] pro = new Products[10];
	// 生产者生产出来的产品交给店员
	public synchronized void addProduct(Products pd) {
		while (index == pro.length) {
			try {
				this.wait();// 产品已满，请稍后再生产
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();// 通知等待区的消费者可以取产品了
		pro[index] = pd;
		index++;
	}

	// 消费者从店员处取产品
	public synchronized Products getProduct() {
		while (index == 0) {
			try {
				this.wait(); // 缺货，请稍后再取。
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();// 通知等待区的生产者可以生产产品了
		index--;
		return pro[index];
	}
}
