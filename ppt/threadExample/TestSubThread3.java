package com.dal.threadExample;

public class TestSubThread3{
	public static void main(String args[]){
		SubThread t1=new SubThread("线程_1");
		SubThread t2=new SubThread("线程_2");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+"方法运行完毕！");			
	}	
}
class SubThread extends Thread{
	String str;
	public SubThread(String s){
		str=s;	
	}	
	public void run(){
		for(int i=1;i<=10;i++){
			for(long j=1;j<100000000;j++)
					;
			System.out.println(str+": 第"+i+"次运行");
		}	
		System.out.println(str+": 结束！");					
	}
}
