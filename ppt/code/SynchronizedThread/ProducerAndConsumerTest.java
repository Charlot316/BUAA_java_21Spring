package com.buaa.SynchronizedThread;

//生产者消费者问题测试  
public class ProducerAndConsumerTest {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Thread producerThread = new Thread(new Producer(clerk));
		Thread consumerThread = new Thread(new Consumer(clerk));
		Thread producerThread1 = new Thread(new Producer(clerk));
		Thread consumerThread2 = new Thread(new Consumer(clerk));
		producerThread.start();
		consumerThread.start();
		producerThread1.start();
		consumerThread2.start();
	}
}
