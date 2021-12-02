package com.buaa.deadlock;

class classA {  
	public classB b;

	synchronized void methoda() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered classA.methoda.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " trying to call classB.methodb()");
		b.methodb();
	}

	synchronized void methodb() {
		System.out.println(" inside classA.mothedb() ");
	}
}

class classB {
	public classA a;

	synchronized void methoda() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered classB.methoda.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " trying to call classA.methodb()");
		a.methodb();
	}

	synchronized void methodb() {
		System.out.println(" inside classB.mothedb() ");
	}
}

public class DeadLock implements Runnable {
	classA a = new classA();
	classB b = new classB();

	DeadLock() {
		Thread.currentThread().setName("MainThread");
		a.b = b;
		b.a = a;
		new Thread(this).start();
		a.methoda();
		System.out.println("back to main thread");
	}

	public void run() {
		Thread.currentThread().setName("RacingThread");
		b.methoda();
		System.out.println("back to racing thread");
	}

	public static void main(String args[]) {
		new DeadLock();
	}
}
