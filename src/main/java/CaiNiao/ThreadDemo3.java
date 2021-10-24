package CaiNiao;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/24 3:44 下午
 * @Version 1.0
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        while (true){
            System.out.println("main方法正在执行");
        }
    }
    static class MyThread implements Runnable{
        public void run(){
            while (true){
                System.out.println("mythread类的run方法正在执行！");
            }
        }
    }
}
