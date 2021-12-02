package com.buaa.SynchronizedThread;

//编写消费者线程类  
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
		System.out.println("消费者开始取走产品");
		for (int i = 0; i < 15; i++) {
			// 注意此处的循环次数一定要大于pro数组的长度（10）
			// 取产品
			Products pd = clerk.getProduct();
			System.out.println("消费了：" + pd);
			try { // 睡眠时间用随机产生的值来设置
				Thread.sleep((int) (Math.random() * 10) * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}