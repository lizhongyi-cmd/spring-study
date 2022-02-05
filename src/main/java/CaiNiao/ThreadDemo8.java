package CaiNiao;

/**
 * @作者: lizhongyi
 * @功能描述：多线程同步，线程安全问题
 * @日期: 2021/10/24 5:44 下午
 * @版本 1.0
 */
public class ThreadDemo8 {
    public static void main(String[] args) {
        SaleThread saleThread =  new SaleThread();
        new Thread(saleThread,"线程一").start();
        new Thread(saleThread,"线程二").start();
        new Thread(saleThread,"线程三").start();
        new Thread(saleThread,"线程四").start();

    }

    static class SaleThread implements Runnable {
        private int tickets = 100;
        public void run(){
            while(tickets > 0){
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---卖出的票" + tickets--);
            }
        }
    }

}
