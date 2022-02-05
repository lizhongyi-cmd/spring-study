package CaiNiao;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/24 4:09 下午
 * @Version 1.0
 */
public class ThreadDemo5 {
    public static void main(String[] args) {
        //为了保证资源共享，创建一个售票对象
        TicketWindow tw = new TicketWindow();
        new Thread(tw,"窗口 1").start();
        new Thread(tw,"窗口 2").start();
        new Thread(tw,"窗口 3").start();
        new Thread(tw,"窗口 4").start();
    }
    static class TicketWindow implements Runnable{
        private int tickets = 100;
        public void run(){
            while (true){
                if(tickets >0){
                    Thread th = Thread.currentThread();
                    String th_name = th.getName();
                    System.out.println(th_name + "正在发售第" + tickets-- + "张票");
                }
            }
        }

    }
}
