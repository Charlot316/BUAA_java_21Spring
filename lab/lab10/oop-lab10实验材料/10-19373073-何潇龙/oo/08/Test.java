public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object a= new Object();
        Object b= new Object();
        MyThread A = new MyThread (1, b,a);
        MyThread B = new MyThread (2, a,b);
        new Thread(A).start();
        Thread.sleep(100);
        new Thread(B).start();
    }
}


