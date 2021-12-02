public class MyThread implements Runnable {
    private int type;
    private Object prev;
    private Object self;

    public MyThread(int type, Object prev,Object self) {
        this.type = type;
        this.prev=prev;
        this.self=self;
    }

    @Override
    public void run() {
        int count = 1;
        while (count <27 ) {
            synchronized (prev){
                synchronized (self){
                    if (type == 1) {
                        System.out.printf("%d%d", count*2-1, count*2);
                    } else if (type== 2) {
                        if (count != 26)
                            System.out.printf("%c ",'A'+count-1);
                        else
                            System.out.printf("%c", 'A'+count-1);
                    }
                    count++;
                    self.notify();
                }
                try {
                    if(count==27)
                        break;
                    else {
                        prev.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
