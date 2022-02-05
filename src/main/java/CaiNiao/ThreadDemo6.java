package CaiNiao;

/**
 * @作者: lizhongyi
 * @功能描述：后台线程
 * @日期: 2021/10/24 4:26 下午
 * @版本 1.0
 */
public class ThreadDemo6 {
    public static void main(String[] args) {
        System.out.println("main 线程是后台线程吗？" + Thread.currentThread().isDaemon());
        DamonThread dt = new DamonThread();
        Thread t = new Thread(dt,"后台线程");
        System.out.println("t 线程是后台程序吗？" + t.isDaemon());
        t.setDaemon(true); //将线程t设置为后台程序
        t.start();
        for(int i = 0;i < 10;i++){
            System.out.println(i);
        }

    }
    static class DamonThread implements Runnable {
        public void run(){
            while (true){
                System.out.println(Thread.currentThread().getName() + "---is running.");
            }
        }
    }
}
