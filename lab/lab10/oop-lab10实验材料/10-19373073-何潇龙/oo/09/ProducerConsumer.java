import java.util.ArrayList;
import java.util.List;


public class ProducerConsumer{
    static class Consumer implements Runnable{

        private List<Integer> queue;
        public Consumer(List<Integer> queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            try {
                while (true){
                    synchronized (queue){
                        while (queue.isEmpty()){
                            System.out.println("Queue is Empty");
                            queue.wait();
                        }
                        int i = queue.remove(0);
                        queue.notify();
                        System.out.println(Thread.currentThread().getName() + " 消费了:" + i + "还剩:" + queue.size());
                        Thread.sleep(100);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    static class Producer implements Runnable{
        private List<Integer> queue;
        private int length;

        public Producer(List<Integer> queue, int length) {
            this.queue = queue;
            this.length = length;
        }

        @Override
        public void run() {
            try {
                while (true){
                    synchronized (queue){
                        while(queue.size() >= length){
                            queue.wait();
                        }
                        queue.add(1);
                        System.out.println(Thread.currentThread().getName() + "生产了" + 1 + "现在有" + queue.size());
                        Thread.sleep(100);
                        queue.notify();
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> queue = new ArrayList<>();
        int length = 10;
        Thread c1 = new Thread(new Consumer(queue));
        Thread p1 = new Thread(new Producer(queue,length));
        c1.setName("消费者");
        p1.setName("生产者1");
        c1.start();
        p1.start();
    }
}