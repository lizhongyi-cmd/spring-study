package CaiNiao;

/**
 * @作者: lizhongyi
 * @功能描述：线程同步锁
 * @日期: 2021/10/24 6:04 下午
 * @版本 1.0
 */
public class ThreadDemo9 {
    public static void main(String[] args) {
        Ticket1 ticket1 = new Ticket1();
        new Thread(ticket1,"线程一").start();
        new Thread(ticket1,"线程二").start();
        new Thread(ticket1,"线程三").start();
        new Thread(ticket1,"线程四").start();

    }
    static class Ticket1 implements Runnable{
        private int tickets = 10;
        Object lock  = new Object();
        public void run(){
            while (true){
                synchronized (lock){
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if(tickets >0){
                        System.out.println(Thread.currentThread().getName() + "---卖出的票" + tickets --);
                    }else {
                        break;
                    }
                }
            }

        }
    }
}
