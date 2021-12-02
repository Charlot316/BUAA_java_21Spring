public class Ticket {
    public static void main(String[] args) {
        // 创建线程类对象
        TicketSalSystem st = new TicketSalSystem();
        // 启动6次线程
        for (char i = 'A'; i <= 'F'; i++)
        {
            /*
             Thread类的构造方法如下：
             public Thread(Runnable run,String name)
             在创建线程的同时，创建线程名称
             */
            new Thread(【1】, "售票口" + i).start();//【1】
        }
    }
}
class TicketSalSystem implements Runnable
{
    // 定义变量---票数/票号
    public int ticket = 100;
    public int count = 0;
    // 重写run()方法
    @Override
    public void run()
    {
        // 定义while循环， 循环售票
        while (【2】)//【2】
        {
            // 根据题的要求，实现同步，此时定义同步代码块
            synchronized (【3】)//【3】
            {// 传入对象，使用this代替当前类对象
                // 判断是否还有票，如果大于零说明还有票可卖
                if (ticket > 0)
                {
                    // 线程休眠0.5秒
                    try
                    {
                        【4】//【4】
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    count++; // 票号++
                    ticket--;// 循环售票，卖一张少一张
                    // 输出当前的售票窗口和票号
                    System.out.println(Thread.currentThread().getName()
                            + "\t当前票号：" + count);
                }
            }
        }
    }
}


