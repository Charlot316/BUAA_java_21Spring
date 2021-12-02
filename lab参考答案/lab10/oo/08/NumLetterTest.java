public class NumLetterTest {
	public static void main(String[] args) throws InterruptedException{ 
		final Object object = new Object();
        new Thread(new Runnable() {
        	int num=1;
            @Override
            public void run() {
                while(num<=52){
                    synchronized (object){
                        object.notify();
                        try {
                            if(num>52) break;
                            else object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        num=threaddo1(num);
                        object.notify();
                    }
                }
            }
        }).start();
		Thread.sleep(10);
		
		new Thread(new Runnable() {
        	char c='A';
            @Override
            public void run() {
                while(c<='Z'){
                    synchronized (object){
                        object.notify();
                        try {
                            if(c>'Z') break;
                            else object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        c=threaddo2(c);
                        object.notify();
                    }
                }
            }
        }).start();
	}
	public synchronized static int threaddo1(int num) {
		System.out.print(num);
		num++;
		System.out.print(num);
		num++;
		return num;
	}
	public synchronized static char threaddo2(char c) {
		System.out.print(c);
		if(c!='Z') System.out.print(" ");
		c++;
		return c;
	}
}
