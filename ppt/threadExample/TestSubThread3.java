package com.dal.threadExample;

public class TestSubThread3{
	public static void main(String args[]){
		SubThread t1=new SubThread("�߳�_1");
		SubThread t2=new SubThread("�߳�_2");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+"����������ϣ�");			
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
			System.out.println(str+": ��"+i+"������");
		}	
		System.out.println(str+": ������");					
	}
}
