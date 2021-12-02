package com.dal.threadExample;

public class Test {
	public static void main(String[] args) {
		// 建立一个账户，存款为0
		Account ac = new Account(123456789, "Tom", 0.0);
		System.out.println(ac.toString() + "：存取款操作如下");
		Thread p = new Thread(new GetMoney(ac));// /////////////////
		Thread c = new Thread(new SaveMoney(ac));// //////////////////
		p.start();
		c.start();
	}
}

class Account {//wait() notify() 和notifyAll()都是从父类Object那里继承来的
	private String name;
	private long id;
	private double sum, saveMoney, getMoney;

	public Account(long id, String name, double sum) {
		this.id = id;
		this.name = name;
		this.sum = sum;
	}

	public synchronized double get(double d) {
		while (sum < 50000) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		getMoney = d;
		sum -= getMoney;
		this.notify();
		return getMoney;
	}

	public synchronized double save(double d) {
		while (sum >= 125000) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		saveMoney = d;
		sum += saveMoney;
		this.notify();
		return saveMoney;
	}

	public double getSum() {
		return sum;
	}

	public String toString() {
		return "账号：" + id + "：姓名" + name + "；存款余额" + sum;
	}
}

class GetMoney implements Runnable {
	private Account account1;//has a 关系

	public GetMoney(Account a) {
		account1 = a;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("取钱：" + account1.get(50000) + "\t账户余额 : sum="
					+ account1.getSum() + "\n");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

class SaveMoney implements Runnable {
	private Account account1;  //has a关系

	public SaveMoney(Account a) {
		account1 = a;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print("存钱：" + account1.save(25000) + "\t账户余额 ：sum="
					+ account1.getSum() + "\n");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {

			}
		}
	}
}