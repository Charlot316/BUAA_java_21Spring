package com.buaa.SynchronizedThread;

//编写生产者线程类  
//生产者线程要执行的任务
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
		System.out.println("生产者开始生产产品");
		for (int i = 0; i < 15; i++) {
			// 注意此处的循环次数一定要大于pro数组的长度（10）
			Products pd = new Products(i);
			clerk.addProduct(pd);// 生产产品
			System.out.println("生产了：" + pd);
			try { // 睡眠时间用随机产生的值来设置
				Thread.sleep((int) (Math.random() * 10) * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}