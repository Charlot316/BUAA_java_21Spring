public class Test {
	public static void main(String args[]) throws InterruptedException {
		Stack stack1=new Stack("stack1");
		Producer pro1=new Producer(stack1,"producer1");
		//Thread.sleep(10);
		Consumer con1=new Consumer(stack1,"consumer1");
	}
}
class Producer extends Thread{
	private Stack theStack;
	public Producer(Stack s,String name) {
		super(name);
		theStack=s;
		start();
	}
	public void run() {
		String goods;
		for(int i=0;i<40;i++) {
			synchronized(theStack) {
				goods="goods"+(theStack.getPoint()+1);
				if(theStack.push(goods))
					System.out.println(getName()+":push "+goods+"to "+theStack.getName());
			}
			yield();
		}
	}
}
class Consumer extends Thread{
	private Stack theStack;
	public Consumer(Stack s,String name) {
		super(name);
		theStack=s;
		start();
	}
	public void run() {
		String goods;
		for(int i=0;i<40;i++) {
			synchronized(theStack) {
				goods=theStack.pop();
				System.out.println(getName()+":pop "+goods+"from "+theStack.getName());
			}
			yield();
		}
	}
}
class Stack{
	private String name;
	private final int SIZE=20;
	private String[] buffer=new String[SIZE];
	int point;
	public Stack(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public synchronized int getPoint() {
		return point;
	}
	public synchronized String pop() {
		this.notify();
		while(point==1) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		String g=buffer[point];
		buffer[point]=null;
		Thread.yield();
		point--;
		return g;
	}
	public synchronized boolean push(String g) {
		this.notify();
		while(point==buffer.length-1) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
			return false;
		}
		point++;
		Thread.yield();
		buffer[point]=g;
		return true;
	}
}