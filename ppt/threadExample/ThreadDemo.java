package com.dal.threadExample;

public class ThreadDemo{
    public static void main(String[] args){
	TestThread tt=new TestThread();
	new Thread(tt).start();
	new Thread(tt).start();
	new Thread(tt).start();
	new Thread(tt).start();
    }	
}
class TestThread implements Runnable{
	int tickets =100;
	public void run(){
	   while(true){
	     if(tickets>0){
		try{Thread.sleep(10);}
	        catch(Exception e){}		               
 System.out.println(Thread.currentThread().getName()+"is sailing ticket"+tickets--);
             }
	   }
	}
}